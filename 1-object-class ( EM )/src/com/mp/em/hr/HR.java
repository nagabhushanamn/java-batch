package com.mp.em.hr;

import com.mp.em.emp.Employee;

public class HR {

	public static void manageEmployees() {

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";

		Employee.doTeach();

		e1.doListen();
		e2.doListen();

	}

}
