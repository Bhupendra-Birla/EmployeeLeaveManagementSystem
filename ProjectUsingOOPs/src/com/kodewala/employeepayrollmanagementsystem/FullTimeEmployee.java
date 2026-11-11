package com.kodewala.employeepayrollmanagementsystem;

public class FullTimeEmployee extends Employee {
	//data hiding
	private double specialAllowances;
	private double deduction;
	private static int countNoOfEmployees1 = 0;

	public FullTimeEmployee(String empId, String empName, double empBasicSalary, double specialAllowances,
			double deduction, double grossSalary) {
		super(empId, empName, empBasicSalary, grossSalary);
		this.specialAllowances = specialAllowances;
		this.deduction = deduction;

	}
      //method overriding
	@Override
	public double calculateBasicSalary(double grossSalary) {
		return grossSalary = getCalculateBasicSalary() + specialAllowances - deduction;

	}

	public double getSpecialAllowances() {
		return specialAllowances;
	}

	public void setSpecialAllowances(double specialAllowances) {
		this.specialAllowances = specialAllowances;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	{
		countNoOfEmployees1++;
	}

	public int getCountNoOfEmployees1() {
		return countNoOfEmployees1;
	}

	public void displayFullTimeEmployeeDetails() {
		System.out.println("Full time Employee Details ::");
		System.out.println("Employee id  :: " + getEmpId());
		System.out.println("Employee name  :: " + getEmpName());
		System.out.println("Employee Allowances :: " + specialAllowances);
		System.out.println("Employee Deduction :: " + deduction);
		System.out.println("Employee gross salary :: " + getGrossSalary());

	}

}
