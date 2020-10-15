package com.training.org;

public class Organisation {
	private String orgName;
	private String orgLoc;
	private String noEmpl;
	
	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default");
	}
	public Organisation(String orgName,String orgLoc,String noEmpl) {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("parameterised constructor");
		this.noEmpl=noEmpl;
		this.orgLoc=orgLoc;
		this.orgName=orgName;
	}

	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgLoc() {
		return orgLoc;
	}
	public void setOrgLoc(String orgLoc) {
		this.orgLoc = orgLoc;
	}
	public String getNoEmpl() {
		return noEmpl;
	}
	public void setNoEmpl(String noEmpl) {
		this.noEmpl = noEmpl;
	}
	@Override
	public String toString() {
		return "Organisation [orgName=" + orgName + ", orgLoc=" + orgLoc + ", noEmpl=" + noEmpl + "]";
	}
	
}
