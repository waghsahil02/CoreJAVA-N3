package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		/*
		System.out.println("enter values of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//Arithmetic operators
		System.out.println("Add: "+(x+y));
		System.out.println("Sub: "+(x-y));
		System.out.println("Mul: "+(x*y));
		System.out.println("Div: "+(x/y));
		System.out.println("Mod: "+(x%y));
		
		//Relational operators
		boolean res = x>y;
		System.out.println(res);
		
		//Assignment operators
		x*=y;  //i.e x = x*y;
		System.out.println(x);
		
		//Logical operators
		boolean res2 = (5==5) && (5>3);
		boolean res3 = (5==4) || (5>2);
		boolean res4 = !(5==4);
		
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4); */
		
		/*Bitwise operators
		int a = 12 & 5;
		int b = 12 | 5;
		int c = 12^5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		/*Ternery operators
		
		String res=(12%2==0)?"True":"False";
		System.out.println(res);*/
		
		//Increment & Decrement operators
		int x = sc.nextInt();
		
		int p = x++;
		int q = --x;
		
		System.out.println(p);
		System.out.println(q);
		
	}

}
