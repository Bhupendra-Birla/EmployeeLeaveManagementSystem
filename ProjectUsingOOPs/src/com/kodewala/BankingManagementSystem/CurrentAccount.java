package com.kodewala.BankingManagementSystem;

public class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(String accHName, long accNumber, double accBalance, double overDraftLimit) {
		super(accHName, accNumber, accBalance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	

	public void calculateMonthlyBenefits() {
		double monthlyCharges = 100;
	 double accBalance=	getAccBalance() - monthlyCharges;
		
		System.out.println( "Updated Balance : " +  accBalance);
		System.out.println(monthlyCharges);
	}
		
	
	public void showCurrentAccountDetails() {
		System.out.println("::::::::::::Current Account Details ::::::::::");
		System.out.println("Account Balance :" + getAccBalance());
		System.out.println("Account OverDraft Limit : " + overDraftLimit);
		System.out.println("Account updated Balance : " + getAccBalance() );
//		System.out.println("Account monthly charges : " + monthlyCharges);
	}

}
