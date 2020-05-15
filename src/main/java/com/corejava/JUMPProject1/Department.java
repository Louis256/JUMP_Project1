package com.corejava.JUMPProject1;

import java.util.Arrays;

public class Department {
	private String departmentName;
	private int departemtNumber;
	private Employee[] employees;
	
	

	public Department(String departmentName, int departemtNumber) {
		super();
		this.departmentName = departmentName;
		this.departemtNumber = departemtNumber;
		this.employees = new Employee[20];
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public int getDepartemtNumber() {
		return departemtNumber;
	}
	
	public void setDepartemtNumber(int departemtNumber) {
		this.departemtNumber = departemtNumber;
	}

	
	
	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	private int indexOfEmployee(int id) {		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] == null) {
				continue;
			}
			else if(employees[i].getStaffNumber() == id) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	//get employee
	public Employee getEmployee(int id) {
		int index = indexOfEmployee(id);
		if(index != -1) {
			return employees[index];
		}
		return null;
	}
	
	//add employee
	public Employee addEmployee(Employee newEmployee) {
		if(getEmployee(newEmployee.getStaffNumber()) == null) {
			for (int i = 0; i < employees.length; i++) {
				if (employees[i] == null) {
					employees[i] = newEmployee;
					return newEmployee;
				}
			}
		}
		return null;
	}
	
	//delete employee
	public Employee deleteEmployee(int id){
		int index = indexOfEmployee(id);
		if(index != -1) {
			Employee temp = employees[index];
			employees[index] = null;
			return temp;
		}
		return null;
	}
	
	//print employee
	public void listEmployee() throws RecordNotFoundException {
		for(Employee emp : employees) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
	}
	
	//update employee
	public void updatEmployee(int id, String name) {
		int index = indexOfEmployee(id);
		if(index != -1) {
			employees[index].setName(name);
		}
	}
	
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departemtNumber=" + departemtNumber + ", employees="
				+ Arrays.toString(employees) + "]";
	}
	
	
	
}
