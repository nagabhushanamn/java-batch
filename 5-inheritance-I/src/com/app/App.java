package com.app;

import com.app.emp.JavaEmployee;

class A extends Object {
	public A(int i) {
		super();
		System.out.println("im A");
	}
}

class B extends A {
	public B(int i) {
		super(i);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int i) {
		super(i);
		System.out.println("im C");
	}
}

public class App {

	public static void main(String[] args) {

		/// JavaEmployee javaEmployee = new JavaEmployee(123, "Abc");

		C c = new C(123);

	}

}
