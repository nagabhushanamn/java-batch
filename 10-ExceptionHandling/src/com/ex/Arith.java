package com.ex;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number-1");
		int n1 = sc.nextInt();

		System.out.println("Enter Number-2");
		int n2 = sc.nextInt();

		// ---------------------------------------
		System.out.println("1.Add");
		// ---------------------------------------
		System.out.println("2-Sub");
		// ---------------------------------------
		try {
		System.out.println("3-Div");
		int div = n1 / n2;
		System.out.println("div result : " + div);
		}catch (ArithmeticException e) {
			//..handling code
			/*
			 *  ==> report to end-user with friendly message
			 *  ==> log it for future maintence
			 *  ==> re-throw
			 * 
			 */
		}
		// ---------------------------------------
		System.out.println("4.Mul");
		// ---------------------------------------
		System.out.println("I love this App");

		sc.close();

	}

}
