package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialUsingFunction {
	// Function Definition
		static int factorial(int num1) {
			int fact = 1;
			for(int i=1;i<=num1;i++) {
				fact = fact*i;
			}
			return(fact);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check Factorial: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// Function Call
		int result = factorial(num);
		System.out.println("Factorial of "+num+" is "+result);

	}

}
