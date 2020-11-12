package com.heraizen.cj.day1;

import java.util.*;

public class SumofSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		System.out.print("The series is:");
		System.out.print("1");
		for (int i = 1; i < num; i++) {
			System.out.print("+" + 1 + "/" + (i + 1));
		}
		scan.close();
	}

}
