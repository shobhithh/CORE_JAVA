package com.heraizen.cj.day1;

import java.util.Scanner;
import java.lang.Math;

public class SumofSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		System.out.print("The series is:");
		for (int i = 1; i <= num; i++) {
			System.out.print(1 + "/" + Math.pow((i + 1), 3));
			if (i == num) {
				break;

			}
			System.out.print("+");
		}
		scan.close();
	}

}
