package com.heraizen.cj.day1;

import java.util.Scanner;

public class BiggestfromtheMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scan.nextInt();

		System.out.println("Enter number of columns: ");
		int columns = scan.nextInt();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		int max_number = matrix[0][0], sum = 0;
		int min_number = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum = sum + matrix[i][j];
				if (max_number < matrix[i][j]) {
					max_number = matrix[i][j];
				} else if (min_number > matrix[i][j]) {
					min_number = matrix[i][j];
				}
			}
		}
		System.out.println("Maximum Number " + max_number);
		System.out.println("Minimum Number " + min_number);
		System.out.println("Sum " + sum);
		scan.close();
	}
}
