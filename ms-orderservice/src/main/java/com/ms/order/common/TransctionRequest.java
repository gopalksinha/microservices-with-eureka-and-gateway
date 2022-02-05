package com.ms.order.common;

import com.ms.order.model.Order;

public class TransctionRequest {
	
	private Order order;
	private Payment payment;
	
	
	public TransctionRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	
	
	public TransctionRequest() {
		super();
	}


	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "TransctionRequest [order=" + order + ", payment=" + payment + "]";
	}
	

}
