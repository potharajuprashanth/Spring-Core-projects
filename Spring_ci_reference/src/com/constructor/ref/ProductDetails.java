package com.constructor.ref;

public class ProductDetails {
private int pid;
private String name;
private Double price;



public ProductDetails()
{
	System.out.println("ProductDetails() Deafult constructor is executed ");
}





public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "ProductDetails [pid=" + pid + ", name=" + name + ", price=" + price + "]";
}

	




}
