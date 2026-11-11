package com.kodewala.orderdeliverymanagementsystem;

public class Delhivery implements IDeliveryPartner{

	@Override
	public double calculateShippingCost(double oWeight) {
		
		return oWeight *23;
	}
	

}
