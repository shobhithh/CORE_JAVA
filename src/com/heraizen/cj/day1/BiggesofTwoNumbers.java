package com.heraizen.cj.day1;

import java.util.*;

public class BiggesofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Num1 value: ");
		num1 = scan.nextInt();

		System.out.println("Enter the Num2 value: ");
		num2 = scan.nextInt();

		scan.close();
		if (num1 <= num2) {
			System.out.println("The biggest of the two numbers entered (" + num1 + " and " + num2 + ") is " + num2);
		} else
			System.out.println("The biggest of the two numbers entered (" + num1 + " and " + num2 + ") is " + num1);
	}

}
