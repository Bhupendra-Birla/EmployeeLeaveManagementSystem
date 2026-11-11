package com.kodewala.orderdeliverymanagementsystem;

public class ShippingService {
	                            //Runtime polymorphism
	public void processDelivery(IDeliveryPartner iDeliveryPartner){
		
		
		System.out.println(iDeliveryPartner.calculateShippingCost(4));
		iDeliveryPartner.trackShipment("282id29");
		
	}
	

}
