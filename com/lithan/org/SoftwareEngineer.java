package com.lithan.org;

public class SoftwareEngineer extends TechnicalEmployee {
	
	public boolean codeAccess;
	
	public SoftwareEngineer(String name) {
		super(name);
		this.codeAccess = false;
	}
	
	public boolean getCodeAccess() {
		return this.codeAccess;
	}
	
	public void setCodeaccess(boolean access) {
		this.codeAccess = access;
	}
	
	public int getSuccessfulCheckIns() {
		return super.successfulCheckIns;
	}
	
	public boolean checkInCode() {
		if(this.codeAccess == true) {
			super.successfulCheckIns ++;
			this.codeAccess = true;
			return true;
		} else {
			this.codeAccess = false;
			return false;
		}
	}
	
}
