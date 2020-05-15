package com.corejava.JUMPProject1;

import java.util.Arrays;

public class Company {
	private String name;
	private String location;
	private Department[] departments;
	
	public Company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.departments = new Department[20];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}
	
	private int indexOfDepartment(int id) {
		for(int i = 0; i < departments.length; i++) {
			if(departments[i] == null) {
				continue;
			}
			else if(departments[i].getDepartemtNumber() == id) {
				return i;
			}
			
		}
		return -1;
	}
	//get Department
	public Department getDepartment(int id) {
		int index = indexOfDepartment(id);
		if(index != -1) {
			return departments[index];
		}
		
		return null;
	}
	
	//add Department
	public Department addDepartment(Department newDepartment) {
		if(getDepartment(newDepartment.getDepartemtNumber()) == null) {
			for (int i = 0; i < departments.length; i++) {
				if (departments[i] == null) {
					departments[i] = newDepartment;
					return newDepartment;
				}
			}
		}
		return null;
	}
	
	//delete Department
	public Department deleteDepartment(int id) {
		int index = indexOfDepartment(id);
		if(index != -1) {
			Department temp = departments[index];
			departments[index] = null;
			return temp;
		}
		return null;
	}
	
	//print Department
	public void listDepartment() {
		for(Department emp : departments) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
	}
	
	//update Department
	public void updatDepartment(int id, String name) {
		int index = indexOfDepartment(id);
		if(index != -1) {
			departments[index].setDepartmentName(name);
		}
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", departments=" + Arrays.toString(departments)
				+ "]";
	}
	
	

}
