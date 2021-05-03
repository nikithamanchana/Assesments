package com.example.demo;

public class Cohorts {

	private int cohortid;
	private String cohortname;
	private String emailid;
	private long contactno;

	public Cohorts() {
		
	}
	public Cohorts(int cohortid, String cohortname, String emailid, long contactno) {
		super();
		this.cohortid = cohortid;
		this.cohortname = cohortname;
		this.emailid = emailid;
		this.contactno = contactno;
	}
	public int getCohortid() {
		return cohortid;
	}
	public void setCohortid(int cohortid) {
		this.cohortid = cohortid;
	}
	public String getCohortname() {
		return cohortname;
	}
	public void setCohortname(String cohortname) {
		this.cohortname = cohortname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public void printinfo() {
		System.out.println("Id:"+cohortid);
		System.out.println("Name:"+cohortname);
		System.out.println("email:"+emailid);
		System.out.println("contactno:"+contactno);
	}
}