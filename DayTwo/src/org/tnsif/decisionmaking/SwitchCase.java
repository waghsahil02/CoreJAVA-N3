package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Withdraw Cash");
			break;
		
		case 2:
			System.out.println("Deposit Cash");
			break;
		
		case 3:
			System.out.println("Contact Bank");
			break;
			
		case 4:
			System.out.println("Check Balance");
			break;
			
		case 5:
			System.out.println("Exit");
			break;	
			
			
		}
	}

}
