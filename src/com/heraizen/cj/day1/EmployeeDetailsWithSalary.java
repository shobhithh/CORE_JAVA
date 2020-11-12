package com.heraizen.cj.day1;

import java.util.*;

public class EmployeeDetailsWithSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employeenumber, salary, yearsalary;
		Scanner scan = new Scanner(System.in);
		String employeename;
		System.out.println("Enter the empno: ");
		employeenumber = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the employee name: ");
		employeename = scan.nextLine();

		System.out.println("Enter the monthly salary: ");
		salary = scan.nextInt();

		yearsalary = salary * 12;
		System.out.println("Hi " + employeename + "! Your employee id is " + employeenumber + ", monthly salary is Rs "
				+ salary + " and yearly salary is Rs " + yearsalary + ".");
		scan.close();
	}

}
