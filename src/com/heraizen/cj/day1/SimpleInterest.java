package com.heraizen.cj.day1;

import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int principal_amount, time;
		float rate, simple_interest;
		System.out.println("Enter the principal amount: ");
		principal_amount = scan.nextInt();
		System.out.println("Enter the rate of Intrest: ");
		rate = scan.nextFloat();
		System.out.println("Enter the time (year) : ");
		time = scan.nextInt();
		simple_interest = (principal_amount * time * rate) / 100;
		System.out.println("Simple Intrest is " + simple_interest);
		scan.close();
	}

}
