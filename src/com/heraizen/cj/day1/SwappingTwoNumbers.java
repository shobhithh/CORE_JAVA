package com.heraizen.cj.day1;

import java.util.*;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number num1: ");
		num1 = scan.nextInt();
		System.out.println("Enter the Second number num2: ");
		num2 = scan.nextInt();
		System.out.println("Before swap, the values of num1 = " + num1 + " and num2 = " + num2);
		num1 -= num2;
		num2 += num2;
		num1 -= num1;
		System.out.println("After swap, the values of num1 = " + num1 + " and num2 = " + num2);
		scan.close();
	}

}
