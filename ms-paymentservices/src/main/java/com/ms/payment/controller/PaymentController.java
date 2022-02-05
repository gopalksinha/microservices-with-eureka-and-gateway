package com.ms.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.payment.model.Payment;
import com.ms.payment.services.PaymentServices;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentServices paymentServices;
	
	@PostMapping("acceptpayment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentServices.savePayment(payment);
	}

}
