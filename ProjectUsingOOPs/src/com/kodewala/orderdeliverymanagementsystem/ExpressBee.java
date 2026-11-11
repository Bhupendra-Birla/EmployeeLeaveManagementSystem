package com.kodewala.orderdeliverymanagementsystem;

public class ExpressBee implements IDeliveryPartner {
	@Override
	public double calculateShippingCost(double oWeight) {
		return oWeight * 30;
	}

	
	
	
	

}
