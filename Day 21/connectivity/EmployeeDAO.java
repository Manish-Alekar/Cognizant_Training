package com.connectivity;

import java.util.List;

//import com.Serialization.Employee;


public interface EmployeeDAO {

	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();

}


