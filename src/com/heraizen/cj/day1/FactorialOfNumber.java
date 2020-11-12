package com.heraizen.cj.day1;

/**
 * 
 * @author shobhi
 */
import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter any number:");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			fact = fact * (i + 1);
		}
		System.out.println("The factorial of " + num + " is " + fact);
		scan.close();
	}

}
