package com.heraizen.cj.day1;

import java.util.*;

public class FibanociSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 1, num3, i, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		num = scan.nextInt();
		System.out.print("Fibonacci series up to the entered number is: ");
		System.out.print(num1 + " " + num2);
		scan.close();
		for (i = 2; i < num; i++) {
			num3 = num1 + num2;
			if (num3 > num) {
				break;
			}
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
