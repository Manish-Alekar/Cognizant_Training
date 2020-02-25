package com.connectivity;

//import java.util.List;
import java.util.Scanner;

//import com.Serialization.Employee;

//import com.cts.training.bean.Employee;
//import com.cts.training.bean.EmployeeDAO;
//import com.cts.training.dao.impl.EmployeeDAOImpl;
//import com.cts.training.dao.impl.EmployeeDAOimpl1;


public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAO empObj = new EmployeeDAOImpl();
		
		//List<Employee> list = empObj.getAllEmployees();
		//list.forEach(System.out::println);
		
		//Employee employee =new Employee(2,"manish","pune", 22,1234567896l);
		
		//empObj.saveEmployee(employee);
		

//		Employee emp=empObj.getEmployeeById(2);
//		System.out.println(emp);
		
		
//		Employee emp=empObj.getEmployeeById(1);
//		empObj.deleteEmployee(emp);
		Employee emp=empObj.getEmployeeById(3);
		emp.setAddress("latur");
		empObj.updateEmployee(emp);
		
		
		
		
		
		
		
		
		
		
		
//		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
//		empObj.addEmployee(emp);
//		
		
//		Employee empl = empObj.getEmployeeById(1234);
//		empObj.deleteEmployee(empl);
		
		/*Employee em = empObj.getEmployeeById(4234);
		 em.setName("aj");
		 empObj.updateEmployee(em);
		
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
		
		System.out.println("Add Employee");
		System.out.println("Update Employee");
		System.out.println("Delete Employee");
		System.out.println("Get Emp By Id");
		System.out.println("Display all");
		System.out.println("Exit");
		Scanner  s=new Scanner(System.in);*/
		
	

	}
	
}


