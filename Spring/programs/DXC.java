package com.example.demo;

public class DXC {
	
		private int EmployeeId;
		private String EmploymentType;
		private int year;
		private Cohorts cohort;
		public DXC() {}
		public DXC(int employeeId, String employmentType, int year, Cohorts cohort) {
			super();
			EmployeeId = employeeId;
			EmploymentType = employmentType;
			this.year = year;
			this.cohort = cohort;
		}
		public int getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(int employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmploymentType() {
			return EmploymentType;
		}
		public void setEmploymentType(String employmentType) {
			EmploymentType = employmentType;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public Cohorts getCohort() {
			return cohort;
		}
		public void setCohort(Cohorts cohort) {
			this.cohort = cohort;
		}
		public void printDXC() {
			System.out.println("Empid:"+EmployeeId);
			System.out.println("EmploymentType:"+EmploymentType);
			System.out.println("Year:"+year);
			System.out.println("---------------------------------------------");
			cohort.printinfo();
		}
		}

