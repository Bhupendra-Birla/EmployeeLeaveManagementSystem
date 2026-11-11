package com.kodewala.orderdeliverymanagementsystem;

public interface IDeliveryPartner {

	double calculateShippingCost(double oWeight);
	
	//java 8 feature
	public default void trackShipment(String trackingId) {
	}
	
}

