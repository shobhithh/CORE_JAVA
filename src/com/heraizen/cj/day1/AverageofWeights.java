package com.heraizen.cj.day1;

import java.util.Scanner;

public class AverageofWeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p1_weight, p2_weight, p3_weight, sum, avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of the first person: ");
		p1_weight = scan.nextFloat();
		System.out.println("Enter the weight of the second person: ");
		p2_weight = scan.nextFloat();
		System.out.println("Enter the weight of the third person: ");
		p3_weight = scan.nextFloat();

		scan.close();
		sum = p1_weight + p2_weight + p3_weight;
		avg = sum / 3;
		System.out.println(
				"The sum of weight of the 3 persons is " + sum + " Kgs and the average weight is " + avg + " Kgs");
	}

}
