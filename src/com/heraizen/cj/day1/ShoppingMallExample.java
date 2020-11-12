package com.heraizen.cj.day1;

import java.util.*;

public class ShoppingMallExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 0;
		double payable_amount = 0.0;
		double discount = 0.0;
		char str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		amount = scan.nextInt();

		System.out.println("Do you have a membership card?");
		str = scan.next().charAt(0);
		if (str == 'y' || str == 'Y') {
			discount = 10.0;
			discount = amount * 10 / 100;
			payable_amount = (double) amount - discount;
			System.out.println("Thank you! Your total bill amount is Rs " + amount + ", discount is Rs " + discount
					+ " and net amount payable is Rs" + payable_amount);
		} else if (str == 'n' || str == 'N') {
			discount = amount * 3 / 100;
			payable_amount = amount - discount;
			System.out.println("Thank you! Your total bill amount is Rs " + amount + ", discount is Rs " + discount
					+ " and net amount payable is Rs" + payable_amount);
		} else {
			System.out.println("invalid input");
		}
		scan.close();
	}

}
