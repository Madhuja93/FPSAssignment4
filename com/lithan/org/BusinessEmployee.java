package com.lithan.org;

public class BusinessEmployee  extends Employee {
	
	public double bonusBudget;
	
	public BusinessEmployee(String name) {
		super(name, 50000);
	}
	
	public BusinessEmployee(String name, double baseSalary) {
		super(name, baseSalary);
	}
	
	public double getBonusBudget() {
		return this.bonusBudget;
	}
	
	public String employeeStatus() {
		String employeeDetailsWithBudget = this.employeeID + " " + this.name + " with a budget of " + this.bonusBudget;
		return employeeDetailsWithBudget; 	
	}
	
}
