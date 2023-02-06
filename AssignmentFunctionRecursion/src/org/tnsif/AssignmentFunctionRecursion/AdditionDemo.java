package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class AdditionDemo {
	// Function Definition
		 /*static int addition(int x,int y) {
			int sum = x+y;
			return(sum);
		}*/
		 static void addition(int x,int y) {
				int sum = x+y;
				System.out.println("The sum is "+sum);
		 }		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Two Nubers For Addition:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		// Function Call
		//int sum = addition(a,b);
		//System.out.println(addition(a,b));
		//System.out.println("the sum is"+sum);
		addition(a,b);

	}

}
