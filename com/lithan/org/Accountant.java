package com.lithan.org;

class Accountant extends BusinessEmployee {
	
	public double bonusBudget;
	public int supportingTeam;
	public TechnicalLead assignedTechnicalLead;
	
	public Accountant(String name) {
		super(name);
		this.bonusBudget = 0;
		this.supportingTeam = 0;
	}
	
	public TechnicalLead getTeamSupported() {
		if(this.assignedTechnicalLead != null) {
			return this.assignedTechnicalLead;
		} else {
			return null;
		}
	}
	
	public void supportTeam(TechnicalLead lead) {
		this.assignedTechnicalLead = lead;
		this.bonusBudget = 0;
		
		for (SoftwareEngineer var : lead.softwareEngineerArray)  
		{ 
			this.bonusBudget = this.bonusBudget + var.baseSalary;
		}
		
		double bonusPercentage = this.bonusBudget/100*10;
		this.bonusBudget = this.bonusBudget + bonusPercentage;
	}
	
	public boolean approveBonus(double bonus) {
		if(this.bonusBudget > bonus) {
			return true;
		} else {
			return false;
		}	
	}
	
	public String employeeStatus() {
		return super.employeeStatus() + " is supporting " + this.assignedTechnicalLead.name;
	}
	
	
}
