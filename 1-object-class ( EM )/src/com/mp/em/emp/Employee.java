// package dec
package com.mp.em.emp;

//import s

// public type
public class Employee {

	// 1. state

	// a. class state
	public final static String COMP_NAME = "MatchPoint";
	public static String tnrName;

	// b. obj state
	public int id;
	public String name;

	// 2.constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 3. behav

	// a. class behav
	public static void doTeach() {
		System.out.println("Teaching....");
	}

	// b. obj behav
	public void doListen() {
		System.out.println(name + " listening..");
	}

	// 4. inner types

}
