package com.kodewala.BankingManagementSystem;

public abstract class Account {
	
	private String accHName;
	private long accNumber;
	private double accBalance;
	
	public Account(String accHName, long accNumber, double accBalance) {
		super();
		this.accHName = accHName;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}

	public abstract void calculateMonthlyBenefits();
	
	
//	  public void setAccHName(String accHName) { 
//		  this.accHName = accHName; 
//	  }
	  public String getAccHName() {  
		  return accHName; 
		  }
//	  public void setAccNumber(long accNumber) {  
//		  this.accNumber = accNumber; 
//		  } 
	   public long getAccNumber() {  
		   return accNumber; 
		   }  
//	   public void setAccBalance(double accBalance) {
//		   this.accBalance = accBalance;
//		   }
	 	 	
	public double getAccBalance() {
		return accBalance;
	}
	
	
	public void deposit (double amount , boolean isDeposit  ,String sign ) {
		checkValidateAccNo(accNumber);
		checkSign(sign);
		updateBalance(amount, isDeposit);
		
		
	}
	public void withDraw(double amount,boolean isDeposit, String sign ) {
		if(amount>0 && accBalance >= amount && checkSign(sign)) {
			checkValidateAccNo(accNumber);
			updateBalance(amount , isDeposit);
		}
		else {
			System.err.println("Please give me correct :: Amount or Sign");
		}
	}
	
	
	private double updateBalance(double amount , boolean isDeposit) {
		if(isDeposit) {
			accBalance =  accBalance + amount ;
			return  accBalance;
		} 
		
		else {
			accBalance = accBalance - amount;
		}
		return  accBalance;
	}
	
	private boolean checkSign(String sign) {
		if(sign.equals("Bhupendra")){
			return true;
		}
		return false;
	}
	private void checkValidateAccNo( long accNumber) {
		if(accNumber<=0) {
			System.out.println("Account Number must be positive ::");
		}
		
	}
	
	public void showAccountDetails() {
		System.out.println("Account holder name : " + accHName);
		System.out.println("Account Number :" + accNumber);
		System.out.println("Account Balance :" + accBalance);
	}
	
}
