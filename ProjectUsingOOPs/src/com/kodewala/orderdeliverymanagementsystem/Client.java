package com.kodewala.orderdeliverymanagementsystem;

public class Client {

	public static void main(String[] args) {
		
		ShippingService service = new ShippingService();
		service.processDelivery(new Ekart());
		
		service.processDelivery(new ExpressBee());
		service.processDelivery(new Delhivery());
	}

}
