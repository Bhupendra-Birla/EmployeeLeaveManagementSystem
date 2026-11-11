package com.kodewala.orderdeliverymanagementsystem;

public class Ekart implements IDeliveryPartner {
	
	
	public double calculateShippingCost(double oWeight) {
		
		return oWeight *25;
		
	}
	public void trackShipment(String trackingId) {
		System.out.println("Ekart.trackShipment()");
	}

}
