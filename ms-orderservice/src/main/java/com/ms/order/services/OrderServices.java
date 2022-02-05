package com.ms.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ms.order.common.Payment;
import com.ms.order.common.TransctionRequest;
import com.ms.order.common.TransctionResponse;
import com.ms.order.model.Order;
import com.ms.order.repository.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private RestTemplate restTemplate;

	public List<Order> getOrders() {
		return this.orderRepository.findAll();
	}

	public TransctionResponse saveOrder(TransctionRequest request) {
		String responseMessage = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getOrderId());
		payment.setOrderTotal(order.getAmount());
		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE:9002/payment/acceptpayment", payment,
				Payment.class);
		responseMessage = paymentResponse.getStatus().equalsIgnoreCase("success")
				? "Congratulations !!!! Order placed successfully"
				: "Order Failed to process, Contact customer care!!!!!";
		this.orderRepository.save(order);
		return new TransctionResponse(order, paymentResponse.getOrderTotal(), paymentResponse.getTransctionId(),
				responseMessage);
	}
}
