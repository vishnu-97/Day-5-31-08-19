package com.genesis;

public class Project {
	private int pno;
	private String pname,company;
	public Project(int pno, String pname, String company) {
		this.pno = pno;
		this.pname = pname;
		this.company = company;
	}
	public Project() {
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Project [pno=" + pno + ", pname=" + pname + ", company=" + company + "]";
	}
	
	
	
}
