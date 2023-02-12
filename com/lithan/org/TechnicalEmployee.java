package com.lithan.org;

public class TechnicalEmployee extends Employee {
	
	public int successfulCheckIns;
	
	public TechnicalEmployee(String name){
		super(name, 75000);
		this.successfulCheckIns = 0;
	}

	public TechnicalEmployee(String name, double baseSalary){
		super(name, baseSalary);
	}
	
	public String employeeStatus() {
		return super.toString() + " has " + this.successfulCheckIns + " Successful check Ins " ;
	}
	
}