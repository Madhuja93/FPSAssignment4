package com.lithan.org;

public class BusinessLead extends BusinessEmployee{
	
	public int headCount;
	
	public BusinessLead(String name) {
		super(name, 100000);
		this.headCount = 10;
	}

	public boolean hasHeadCount() {
		return true;
	}
	
	public boolean addReport(Accountant e,TechnicalLead supportTeam) {
		return true;
	}
	
	public boolean requestBonus(Employee e, double bonus) {
		return true;
	}
	
	public boolean approveBonus(Employee e, double bonus) {
		return true;
	}
	
}
