package com.kodewala.BankingManagementSystem;

public class SavingAccount extends Account {
 
	private static double minBalance = 2000;

	public SavingAccount(String accHName, long accNumber, double accBalance) {
		super(accHName, accNumber, accBalance);
	
	}
	                 @Override
                   public void calculateMonthlyBenefits() {
		    double interest = getAccBalance() * 0.4/12;
		
		System.out.println( "Saving Interest : " + interest);
	}
	public void showSavingAccountDetails() {
		System.out.println("Saving Account Details :: ");
		System.out.println("Account Balance :" + getAccBalance());
		System.out.println(" Account Minimum Balance : " + minBalance);
	}
	
}
