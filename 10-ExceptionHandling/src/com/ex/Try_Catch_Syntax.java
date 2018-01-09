package com.ex;

class Employee {
	public void doWork() {
		System.out.println("Employee workig..");
	}
}

public class Try_Catch_Syntax {

	public static void main(String[] args) {

		try {
			System.out.println("A");
			int ari = 1 / 1;
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[1]);
			Employee e = null;
			e.doWork();
			System.out.println("B");
		} catch (ArithmeticException e) {
			System.out.println("ArithEx - " + e.getMessage());
			System.out.println("C");
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("ArrayEx - " + aiobe.getMessage());
		} catch (Exception e) {
			System.out.println("Ex- " + e.getMessage());
		}

		System.out.println("D");

	}

}
