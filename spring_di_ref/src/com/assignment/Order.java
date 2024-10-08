package com.assignment;

public class Order {

	private int id;
	private float orderAmount;
	private Product product;
public Order()
{
	System.out.println("Order is created");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getOrderAmount() {
	return orderAmount;
}
public void setOrderAmount(float orderAmount) {
	this.orderAmount = orderAmount;
}
public Product getProduct() {
	
	return product;
}
public void setProduct(Product product) {
	System.out.println("Product is called in to the Order");
	this.product = product;
}
@Override
public String toString() {
	return "Order [id=" + id + ", orderAmount=" + orderAmount + ", product=" + product + "]";
}


}
