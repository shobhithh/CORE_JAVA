package com.heraizen.cj.day1;

public class PatternNumber33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
