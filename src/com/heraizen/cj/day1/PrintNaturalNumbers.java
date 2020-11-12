package com.heraizen.cj.day1;

import java.util.*;

public class PrintNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		num = scan.nextInt();
		System.out.print("First 5 natural numbers are:");
		for (int i = 0; i < num; i++) {
			System.out.print(i + 1 + " ");
		}
		scan.close();
	}

}
