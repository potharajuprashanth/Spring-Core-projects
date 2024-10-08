package com.assignment;

public class Product {
private int id;
private String name;
private float price;
private int manYear;//mandatory fileds should contain the setter method and <property>


private  int expireYear;//mandatory fileds should contain the setter method and <property>
private String company_name;
private long contact;
private String companyEmailId ;
public Product()
{
	System.out.println("Product Object Is created");
}

public int getId() {
	return id;
}


public String getName() {
	return name;
}


public float getPrice() {
	return price;
}


public int getManYear() {
	return manYear;
}

public void setManYear(int manYear) {
	this.manYear = manYear;
}

public int getExpireYear() {
	return expireYear;
}

public void setExpireYear(int expireYear) {
	this.expireYear = expireYear;
}

public String getCompany_name() {
	return company_name;
}



public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

public String getCompanyEmailId() {
	return companyEmailId;
}




@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", manYear=" + manYear + ", expireYear="
			+ expireYear + ", company_name=" + company_name + ", contact=" + contact + ", companyEmailId="
			+ companyEmailId + "]";
}


}
