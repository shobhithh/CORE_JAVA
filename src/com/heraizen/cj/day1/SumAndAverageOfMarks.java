package com.heraizen.cj.day1;
import java.util.Scanner;

public class SumAndAverageOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1,marks2,marks3,total_marks=0,average=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject:");
		marks1=scan.nextInt();
		System.out.println("Enter the marks scored in 2nd subject:");
		marks2=scan.nextInt();
		System.out.println("Enter the marks scored in 3rd subject:");
		marks3=scan.nextInt();
		total_marks=marks1+marks2+marks3;
		average=total_marks/3;
		System.out.println("Total marks: "+total_marks);
		System.out.println("Average: "+average);

		if(average<35)
			{
			System.out.println("Grade:C");
			}
		else if(average>35 && average<60 )
		{
			System.out.println("Grade:B");
		}
		else {
			System.out.println("Grade:A");
		}
		scan.close();
	}

}
