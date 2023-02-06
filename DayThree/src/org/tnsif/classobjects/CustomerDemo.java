package org.tnsif.classobjects;

import java.util.Scanner;

//Driver Class
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<3) { //for getting multiple customer's input.
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Details : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		String Customername = sc.nextLine();
		String City = sc.next();
		
		//Customer ct = new Customer(101,"sahil","nsk");
		Customer ct = new Customer(id,Customername,City);
		System.out.println("Cutsomer Details are : ");
		ct.display();
		i++;
		
		}
		
	}

}
