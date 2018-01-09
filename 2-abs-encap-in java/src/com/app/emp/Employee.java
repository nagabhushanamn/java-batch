package com.app.emp;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id, String name) {
		if (id > 0)
			this.id = id;
		if (name != null)
			this.name = name;
	}

	public Employee(int id, String name, double salary) {
		this(id, name);
		if (salary > 0.0 && salary <= 1000.00)
			this.salary = salary;
		this.bonus = this.salary * 0.2;
	}

	public int getId() {
		return id;
	}

	// public void setId(int id) {
	// this.id = id;
	// }

	public String getName() {
		return name;
	}
	//
	// public void setName(String name) {
	// this.name = name;
	// }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0.0 && salary <= 1000.00)
			this.salary = salary;
		this.bonus = this.salary * 0.2;
	}

	public double getBonus() {
		return bonus;
	}

	// public void setBonus(double bonus) {
	// this.bonus = bonus;
	// }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
