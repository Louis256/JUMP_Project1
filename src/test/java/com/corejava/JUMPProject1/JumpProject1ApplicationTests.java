package com.corejava.JUMPProject1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JumpProject1ApplicationTests {

	@Test
	public void testAddEmployee() throws Throwable {
		Department sale = new Department("Sale", 1);
		
		sale.addEmployee(new Employee("Jack",1));
		sale.addEmployee(new Employee("Eva",2));
		
		assertEquals("Jack",sale.getEmployee(1).getName());
		assertEquals("Eva",sale.getEmployee(2).getName());
		
		
		sale.deleteEmployee(1);
		assertNull(sale.getEmployee(1));
		
		
		sale.updatEmployee(2, "Nick");
		assertEquals("Nick",sale.getEmployee(2).getName());
	}

}
