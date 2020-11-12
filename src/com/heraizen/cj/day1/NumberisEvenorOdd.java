package com.heraizen.cj.day1;

import java.util.*;

public class NumberisEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("The Entered number " + num + " is even");
		} else
			System.out.println("The Entered number " + num + " is odd");
		scan.close();
	}

}
