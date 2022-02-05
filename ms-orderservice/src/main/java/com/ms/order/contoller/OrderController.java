package com.ms.order.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.order.common.TransctionRequest;
import com.ms.order.common.TransctionResponse;
import com.ms.order.model.Order;
import com.ms.order.services.OrderServices;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServices orderServices;
	
	
	@GetMapping("/getOrders")
	public List<Order> getOrders() {
		return this.orderServices.getOrders();
	}
	
	@PostMapping("/saveOrder")
	public TransctionResponse saveOrders(@RequestBody TransctionRequest request) {
		return this.orderServices.saveOrder(request);
	}
	
	
}
