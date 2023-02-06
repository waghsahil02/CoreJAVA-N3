package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age and weight of person for Bungie jumping");
		int age = sc.nextInt();
		int wt = sc.nextInt();
		
		
		if(age>=12)
		{
			if(wt>=40)
			{
				if(wt<120)
				{
					System.out.println("Eligible");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else 
			{
				System.out.println("Not Eligible");
			}
		}
		else 
		{
			System.out.println("You're Kid");
		}

	}

}
