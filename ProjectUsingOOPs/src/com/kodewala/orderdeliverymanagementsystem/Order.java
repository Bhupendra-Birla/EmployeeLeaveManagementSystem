package com.kodewala.orderdeliverymanagementsystem;

public class Order {
	private String id;
	private String customerName;
	private double oWeight;
	
	public Order(String id , String customerName , double oWeight) {
		this.id =id;
		this.oWeight = oWeight;
		this.customerName = customerName;
		
	}
	
	public void setId(String id) {
		this.id = id;
		
	}
	public String getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getoWeight() {
		return oWeight;
	}

	public void setoWeight(double oWeight) {
		this.oWeight = oWeight;
	}
	
	

}
