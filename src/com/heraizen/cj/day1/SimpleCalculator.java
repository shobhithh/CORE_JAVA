package com.heraizen.cj.day1;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
		int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        float result=0;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.printf("Error! operator is not correct");
             
        }

        System.out.print("The result is "+result);
        scan.close();
	}

}
