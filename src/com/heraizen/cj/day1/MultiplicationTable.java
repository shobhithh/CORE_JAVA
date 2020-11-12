package com.heraizen.cj.day1;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		num = scan.nextInt();
		System.out.println("Multiplication table for " + num + "is :");
		for (int i = 0; i < 10; i++) {
			System.out.println(num + "*" + (i + 1) + "=" + num * (i + 1));
		}
		scan.close();
	}

}
