package com.heraizen.cj.day1;

import java.util.*;

public class ConvertNegativeNumberToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = scan.nextInt();

		if (num < 0) {
			num = -num;
		}
		System.out.println("The result is " + num);
		scan.close();
	}

}
