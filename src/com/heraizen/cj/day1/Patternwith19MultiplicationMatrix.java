package com.heraizen.cj.day1;

public class Patternwith19MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 19;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num + " ");
				num += 19;
			}

			System.out.println();

		}
	}

}
