package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection conn=getConnection();
	PreparedStatement ps=null;
	
	private Connection getConnection()
	{
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcDemo";
			Connection conn = DriverManager.getConnection(url,"root","ROOT");
			return conn;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<Employee>();
		String sql="select * from employee";
		ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Employee emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			emp.setAddress(rs.getString("address"));
			
			
		}
		return null;
	}
	
}
