package com.kodewala.employeepayrollmanagementsystem;

import java.util.Scanner;

public class EmployeePayrollManagmentSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FullTimeEmployee fte = new FullTimeEmployee("Bhupendra Birla", "F@1234", 90000.50, 19000.50, 9000.0, 108750.50);
		FullTimeEmployee fte1 = new FullTimeEmployee("Niraj", "F@4567", 85000.00, 17000.50, 7000.0, 102000);

		double salary = fte.calculateBasicSalary(108750.50);
		System.out.println("Basic Salary ::  " + salary);
		fte.displayFullTimeEmployeeDetails();

		double salary2 = fte1.calculateBasicSalary(102000);
		System.out.println("Basic Salary ::  " + salary2);
		fte1.displayFullTimeEmployeeDetails();

		PartTimeEmployee pte = new PartTimeEmployee("Shivam", "p@1234", 7000.0, 6.5, 150, 0.0);

		double salary1 = pte.calculateBasicSalary(0.0);
		System.out.println("Total Salary ::  " + salary1);
		pte.displayPartTimeEmployeeDetails();

		System.out.println("Full Time Employees are :: " + fte.getCountNoOfEmployees1());

		System.out.println("Part Time Employees are :: " + pte.getCountNoOfEmployees2());

	}

}
