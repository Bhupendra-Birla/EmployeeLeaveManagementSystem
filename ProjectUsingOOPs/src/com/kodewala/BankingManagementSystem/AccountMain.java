package com.kodewala.BankingManagementSystem;

public class AccountMain {
public static void main(String[] args) {
	
	Account account = new SavingAccount("Bhupendra",47010100003375l,11000.0);
	account.deposit(2000, true, "Bhupendra");
account.withDraw(1000,false, "Bhupendra");
//	System.out.println(account.getAccBalance());
	
	((SavingAccount) account).showSavingAccountDetails();
//	account.showAccountDetails();
	
//((CurrentAccount)account).showCurrentAccountDetails();
	account.calculateMonthlyBenefits();
}
}
