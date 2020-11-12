package com.heraizen.cj.day1;

import java.util.Scanner;

public class NaturalNumbersInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		num = scan.nextInt();
		scan.close();
		System.out.print("First 5 natural numbers are:");
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

}
