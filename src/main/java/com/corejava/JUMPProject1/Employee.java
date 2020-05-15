package com.corejava.JUMPProject1;

public class Employee {
	private String name;
	private int staffNumber;
	
	public Employee(String name, int staffNumber) {
		super();
		this.name = name;
		this.staffNumber = staffNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", staffNumber=" + staffNumber + "]";
	}
	
	
	

}
