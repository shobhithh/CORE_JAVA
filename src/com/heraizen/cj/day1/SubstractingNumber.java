package com.heraizen.cj.day1;

import java.util.*;

public class SubstractingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1, num2, result, temp;

		System.out.println("Enter the first number num1:");
		num1 = scan.nextInt();

		System.out.println("Enter the second number num2:");
		num2 = scan.nextInt();

		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		result = num1 - num2;

		System.out.println("The result (difference) is: " + result);
		scan.close();
	}

}
