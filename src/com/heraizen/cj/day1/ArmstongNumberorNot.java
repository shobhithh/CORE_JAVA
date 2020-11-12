package com.heraizen.cj.day1;

import java.util.Scanner;

public class ArmstongNumberorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any Positive Number : ");
		int num = scan.nextInt();
		int result = 0;
		int number = num;
		while (num != 0) {
			int rem = num % 10;
			result += rem * rem * rem;
			num /= 10;
		}

		if (number == result) {
			System.out.print("Armstrong Number");
		} else {
			System.out.print("Not an Armstrong Number");
		}
		scan.close();
	}

}
