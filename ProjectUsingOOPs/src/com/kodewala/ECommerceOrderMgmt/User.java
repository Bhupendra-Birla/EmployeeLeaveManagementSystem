package com.kodewala.ECommerceOrderMgmt;

public class User {
	// Data hiding + Encapsulation

	private int uId;
	private String uName;
	private String uEmail;
	private long uContactNo;

	public User(int uId, String uName, long uContactNo, String uEmail) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uContactNo = uContactNo;
		this.uEmail = uEmail;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public long getuContactNo() {
		return uContactNo;
	}

	public void setuContactNo(long uContactNo) {
		this.uContactNo = uContactNo;
	}

	// Method Overloading
	public void doLogin(String email) {
		if (email == "bbirla9033@gmail.com") {
			System.out.println("User.doLogin(String email)");
		}

	}

	public void doLogin(String name, String password) {

		if (name == "bhupendra" && password == "9033") {
			System.out.println("User.doLogin(String name, String password)");
		}

	}

	public void doLogin(String email, long password) {
		if (email == "bbirla9033@gmail.com" && password == 9033) {
			System.out.println("User.doLogin(String email, long password)");
		}

	}

	public void doLogOut(String name) {

		if(name == "bhupendra") {
			System.out.println("Ok :::User.doLogOut()");
		}
		else {
			System.out.println(" No :: Give correct name User.doLogOut()");
		}

	}
	
	static {
		System.out.println("::::::E-Commerce Order Management System::::::");
	}
	
	public void displayUserDetails() {
		System.out.println(":::::::::User Details:::::::");
		System.out.println("User Id :: " + uId);
		System.out.println("User Name :: " +uName);
		System.out.println("User Email :: " + uEmail);
		System.out.println("User Contanct :: " + uContactNo);
	
		
	}

}
