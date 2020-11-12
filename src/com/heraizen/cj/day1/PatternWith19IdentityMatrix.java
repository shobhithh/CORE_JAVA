package com.heraizen.cj.day1;

public class PatternWith19IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 19;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(number + " ");
				} else
					System.out.print("0 ");

			}

			System.out.println();
		}
	}

}
