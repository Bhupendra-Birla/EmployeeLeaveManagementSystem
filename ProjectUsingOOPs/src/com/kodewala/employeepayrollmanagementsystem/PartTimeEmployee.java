package com.kodewala.employeepayrollmanagementsystem;

public class PartTimeEmployee extends Employee {
	
	//Data Hiding
	private double workingHours;
	private int hourlyRate;
	private static int countNoOfEmployees2 = 0;

	public PartTimeEmployee(String empId, String empName, double empBasicSalary, double workingHours, int hourlyRate,
			double grossSalary) {
		super(empId, empName, empBasicSalary, grossSalary);
		this.workingHours = workingHours;
		this.hourlyRate = hourlyRate;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;

	}

	public double getWorkingHours() {
		return workingHours;
	}

	@Override
	public double calculateBasicSalary(double grossSalary) {

		return hourlyRate * workingHours;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	{
		countNoOfEmployees2++;

	}

	public int getCountNoOfEmployees2() {
		return countNoOfEmployees2;
	}

	public void setCountNoOfEmployees2(int countNoOfEmployees2) {
		this.countNoOfEmployees2 = countNoOfEmployees2;
	}

	public void displayPartTimeEmployeeDetails() {
		System.out.println(":::::::::Part Time Employee ::::::::");
		System.out.println("Employee id  :: " + getEmpId());
		System.out.println("Employee name  :: " + getEmpName());
		System.out.println("Employee Working Hours :: " + workingHours);
		System.out.println("Employee Hourly Rate :: " + hourlyRate);
		System.out.println("Employee Salary :: " + getCalculateBasicSalary());
	}

}
