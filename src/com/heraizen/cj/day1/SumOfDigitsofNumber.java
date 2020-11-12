package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfDigitsofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num, rem, sum = 0;
		System.out.println("Enter any number:");
		num = scan.nextInt();
		while (num > 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("The sum of digits of the entered number is " + sum);
		scan.close();
	}

}
