package com.heraizen.cj.day1;

import java.util.*;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Num1 value: ");
		num1 = scan.nextInt();

		System.out.println("Enter the Num2 value: ");
		num2 = scan.nextInt();

		scan.close();
		sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

	}

}
