package com.heraizen.cj.day1;

import java.util.*;

public class NumberOfDigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num, count = 0;
		System.out.println("Enter any number:");
		num = scan.nextInt();
		while (num > 0) {
			num = num / 10;
			count = count + 1;
		}
		System.out.println("The number of digits in the entered number is " + count);
		scan.close();
	}

}
