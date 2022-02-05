package com.ms.order.common;

import com.ms.order.model.Order;

public class TransctionResponse {

	private Order order;
	private double amount;
	private String transctionId;
	private String responseMsg;
	
	
	public TransctionResponse(Order order, double amount, String transctionId) {
		super();
		this.order = order;
		this.amount = amount;
		this.transctionId = transctionId;
	}
	
	public TransctionResponse(Order order, double amount, String transctionId, String responseMsg) {
		super();
		this.order = order;
		this.amount = amount;
		this.transctionId = transctionId;
		this.responseMsg = responseMsg;
	}

	public TransctionResponse() {
		super();
	}

	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransctionId() {
		return transctionId;
	}
	public void setTransctionId(String transctionId) {
		this.transctionId = transctionId;
	}
	
	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	@Override
	public String toString() {
		return "TransctionResponse [order=" + order + ", amount=" + amount + ", transctionId=" + transctionId
				+ ", responseMsg=" + responseMsg + "]";
	}
	
}
