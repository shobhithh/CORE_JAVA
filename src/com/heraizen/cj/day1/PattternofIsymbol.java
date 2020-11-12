package com.heraizen.cj.day1;

public class PattternofIsymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0 || i == 6 || j == 4) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();

		}
	}

}
