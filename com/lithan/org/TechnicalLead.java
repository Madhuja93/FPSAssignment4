package com.lithan.org;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
	
	int headCount = 0;
	ArrayList<SoftwareEngineer> softwareEngineerArray = new ArrayList<SoftwareEngineer>();
	
	public TechnicalLead(String name) {
		super(name, 75000 * 1.3);
		headCount = 4;
	}
	
	public boolean hasHeadCount() {
		this.headCount = this.softwareEngineerArray.size();
		if(headCount <= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addReport(SoftwareEngineer e) {
		this.headCount = this.softwareEngineerArray.size();
		if(this.headCount <= 4) {
			this.headCount ++;
			this.softwareEngineerArray.add(e);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean approveCheckIn(SoftwareEngineer e) {
		for (SoftwareEngineer var : softwareEngineerArray) 
		{ 
		    if(var.name == e.name) {
		    	if(var.codeAccess == true) {
		    		return true;
		    	} else {
		    		return false;
		    	}
		    }
		}
		return false;
	}
	
	public boolean requestBonus(Employee e,double bonus) {
		return true;
	}
	
	public String getTeamStatus() {
		String statusReportManager = super.employeeStatus() + " is managing /n";
		String statusReportEmployee = "";
		if(this.softwareEngineerArray.size() != 0) {
			for (SoftwareEngineer var : this.softwareEngineerArray) 
			{ 
				statusReportEmployee = statusReportEmployee + var.employeeStatus();
			}
			return statusReportManager +  statusReportEmployee;
		} else {
			String noDirectEmployees = " and no direct reports yet ";
			return statusReportManager + noDirectEmployees;
		}
		
	}
}
