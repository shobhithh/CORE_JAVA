package com.heraizen.cj.day1;

import java.util.Scanner;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
				if (i == num) {
					break;
				}
				System.out.print(",");
			}
		}
		scan.close();
	}

}
