package com.kodewala.employeepayrollmanagementsystem;
// My Application is well Polymorphic +  Inherited +Encapsulated
public class Employee {
	//Data hiding
	private String empId;
    private String empName;
	private double empBasicSalary;
	private double grossSalary;
	
	public Employee(String empId, String empName, double empBasicSalary ,double grossSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empBasicSalary = empBasicSalary;
		this.grossSalary = grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getGrossSalary() {
		return grossSalary;
	}
	
	//providing controlled access via public setter and getter methods	  
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}
	public double getEmpBasicSalary() {
		return empBasicSalary;
	}
	
	
	public double calculateBasicSalary(double grossSalary) {
		
		empBasicSalary = grossSalary *75/100;
		
		return empBasicSalary;
	}
	
	
	static {
		System.out.println("Employee Payroll Management System");
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee id  :: " + empId);
		System.out.println("Employee name  :: " + empName);
		System.out.println("Employee BasicSalary  :: " + empBasicSalary);

	}
	
	public void setCalculateBasicSalary(double grossSalary) {
		this.empBasicSalary  = this.empBasicSalary;
	}
	public double getCalculateBasicSalary() {
		return empBasicSalary;
	}
	
}
