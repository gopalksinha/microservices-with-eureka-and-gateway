package com.ms.payment.services;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.payment.model.Payment;
import com.ms.payment.repository.PaymentRepository;

@Service
public class PaymentServices {
	
	@Autowired
	private PaymentRepository paymentRespsitory;
	
	public Payment savePayment(Payment payment) {
		payment.setStatus(paymentProcessing());
		payment.setTransctionId(UUID.randomUUID().toString());
		return this.paymentRespsitory.save(payment);
	}
	
	public String paymentProcessing() {
		int value = new Random().nextInt();
		
		return  value > 500 ? "success":"failed";
	}
}
