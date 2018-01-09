package com;

import com.app.emp.Employee;

import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

public class App {

	public static void main(String[] args) {

		// A a = new A();
		// a.aObjMethod();

		// B b = new B();
		// b.bObjMethod();

		// C c=new C();
		// c.cObjMethod();

		// D d = new D();
		// d.dObjMethod();

		// E e = new E();
		// e.eObjMethod();

		// -----------------------------------------------

		Employee employee1 = new Employee(123, "Nag", 1000.00);
		System.out.println(employee1);

		// -----------------------------------------------

		// employee1.id = 0;
		// employee1.name = null;
		// employee1.salary = 10000.00;
		// employee1.bonus = 100000.00;
		
		//-----------------------------------------------------
		
		employee1.setSalary(500.00);
		System.out.println(employee1);

	}

}
