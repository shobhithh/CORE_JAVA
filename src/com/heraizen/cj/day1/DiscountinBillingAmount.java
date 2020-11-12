package com.heraizen.cj.day1;

import java.util.*;

public class DiscountinBillingAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int netamount;
		System.out.println("Enter the billing amount: ");
		int billingamount = scan.nextInt();
		if (billingamount > 6000) {
			netamount = billingamount - billingamount / 10;
		} else {
			netamount = billingamount;
		}
		System.out.println("your Net billing amount: " + netamount);
		scan.close();
	}

}
