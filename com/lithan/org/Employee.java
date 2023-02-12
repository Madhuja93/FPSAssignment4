package com.lithan.org;

import java.util.Random;

public abstract class Employee {
	
	public String name;
	public double baseSalary;
	public int employeeID;
	
	public Employee() {	}
	

	public abstract String employeeStatus();
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
		Random rd = new Random();
		this.employeeID =  rd.nextInt();
	}
	
	public double getBaseSalary() {
		return this.baseSalary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getEmployeeID() {
		return this.employeeID;
	}
	
	public Employee getManager() {
		return this;
	}
	
	public boolean equals(Employee other) {
		if (other.employeeID == this.employeeID) {
			return true;
		}else {
			return false;
		}	
	}
	
	public String toString() {
		String employeeIDWithName = this.employeeID + " " + this.name;
		return employeeIDWithName;
	}
}

























