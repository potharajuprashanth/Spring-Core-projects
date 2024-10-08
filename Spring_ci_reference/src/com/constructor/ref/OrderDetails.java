package com.constructor.ref;

import java.util.List;

public class OrderDetails {

	private int orderId;
	private Double amount;
	private List<ProductDetails> productDetails;
	
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public List<ProductDetails> getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(List<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}
	public OrderDetails(List<ProductDetails> productDetails) {
		super();
		System.out.println("ProductDetails() 1 param is executed in OrderDetails");
		this.productDetails = productDetails;
	}
	public OrderDetails(int orderId, Double amount, List<ProductDetails> productDetails) {
		super();
		System.out.println("OrderDeatils(orderId,name,productDetails) 3 params executed ");
		this.orderId = orderId;
		this.amount = amount;
		this.productDetails = productDetails;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", amount=" + amount + ", productDetails=" + productDetails + "]";
	}

	
	
	
	
}
