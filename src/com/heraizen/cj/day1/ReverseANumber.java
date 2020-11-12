package com.heraizen.cj.day1;

import java.util.*;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scan.nextInt();
		int reversenum = 0;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the entered number is " + reversenum);
		scan.close();
	}

}
