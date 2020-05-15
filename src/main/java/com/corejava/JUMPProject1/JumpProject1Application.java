package com.corejava.JUMPProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JumpProject1Application {

	public static void main(String[] args) throws RecordNotFoundException {
		//create company
		Company googee = new Company("googee", "NJ");
		//add department to company 
		googee.addDepartment(new Department("Sale", 1));
		googee.addDepartment(new Department("Tec", 2));
		googee.deleteDepartment(1);
		googee.updatDepartment(2, "CS");
		googee.listDepartment();
		
		//create department
		Department sale = new Department("Sale", 1);
		//add employees to department
		sale.addEmployee(new Employee("Jack",1));
		sale.addEmployee(new Employee("Eva",2));
		sale.addEmployee(new Employee("Logan",3));
		sale.addEmployee(new Employee("Noah",4));
		sale.addEmployee(new Employee("Emma",5));		
		//delete employee
		sale.deleteEmployee(1);
		//get employees by ID
		sale.getEmployee(2);
		//sale.checkEmployee(1);
		//update employee by ID
		sale.updatEmployee(2, "Nick");
		//show employees
		sale.listEmployee();
		
		
		
	}

}
