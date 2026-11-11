package com.kodewala.ECommerceOrderMgmt;

public class Customer {

	private String cAddress;
	private double cWalletBalance;
	private int cLoyalltyPoints;

	public Customer(String cAddress, double cWalletBalance, int cLoyalltyPoints) {
		super();
		this.cAddress = cAddress;
		this.cWalletBalance = cWalletBalance;
		this.cLoyalltyPoints = cLoyalltyPoints;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public double getcWalletBalance() {
		return cWalletBalance;
	}

	public void setcWalletBalance(double cWalletBalance) {
		this.cWalletBalance = cWalletBalance;
	}

	public int getcLoyalltyPoints() {
		return cLoyalltyPoints;
	}

	public void setcLoyalltyPoints(int cLoyalltyPoints) {
		this.cLoyalltyPoints = cLoyalltyPoints;
	}
	
	//Exposing only required functionality
	public void placeOrder(boolean isConfirm ,int noOfOrderReQuest) {
		checkOrder(noOfOrderReQuest);
		confirmOrder(isConfirm);
	}
	
	
	//Hiding  core functionality /implementation details 
	private void checkOrder(int noOfOrderReQuest) {
		if(noOfOrderReQuest >0 && noOfOrderReQuest<5) {
			System.out.println("No of orders are valid ");
		}
		else {
			System.out.println("No of orders are Invalid");
		}
		
	}
	
	private void confirmOrder( boolean isConfirm) {
		
		if(isConfirm) {
			System.out.println("Orders are Confirm");
		}
		else {
			System.out.println("Orders are  not confirmed");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
