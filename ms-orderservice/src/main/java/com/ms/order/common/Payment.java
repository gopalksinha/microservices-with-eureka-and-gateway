package com.ms.order.common;

public class Payment {

	private int paymentId;
	private String status;
	private String transctionId;
	private int orderId;
	private double orderTotal;
	

	public Payment(int paymentId, String status, String transctionId, int orderId, double orderTotal) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.transctionId = transctionId;
		this.orderId = orderId;
		this.orderTotal = orderTotal;
	}

	public Payment() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public double getOrderTotal() {
		return orderTotal;
	}


	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}


	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransctionId() {
		return transctionId;
	}
	public void setTransctionId(String transctionId) {
		this.transctionId = transctionId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", status=" + status + ", transctionId=" + transctionId
				+ ", orderId=" + orderId + ", orderTotal=" + orderTotal + "]";
	}
	

}
