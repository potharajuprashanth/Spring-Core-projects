package com.flipkart.orders;

public class Order {

	private String orderId;
	private Product product;
	private Transaction transaction;
	
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		System.out.println("Product object is executed inside the Order");
		this.product = product;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	
	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction object is executed inside the Order");
		this.transaction = transaction;
	}
	
	
	
	
}
