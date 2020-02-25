package com.connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.Serialization.Employee;
//import com.cts.training.bean.Employee;
//import com.cts.training.bean.EmployeeDAO;
public class EmployeeDAOImpl implements EmployeeDAO 

{	
	Connection conn = getConnection();
	PreparedStatement ps= null;	
	public boolean saveEmployee(Employee employee) 
	{
		
		String sql="insert into Employee values(?,?,?,?,?)";
		try {
		   ps=conn.prepareStatement(sql);
		   ps.setInt(1, employee.getId());
		   ps.setString(2, employee.getName());
		   ps.setString(3, employee.getAddress());
		   ps.setInt(4, employee.getAge());
		   ps.setLong(5, employee.getPhone());
		   ps.executeUpdate();
		   return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		return false;
		}
		
	
	}	
	
	public boolean updateEmployee(Employee employee)
	{
		String sql="update employee set address=? where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,employee.getAddress());
			ps.setInt(2,employee.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;// TODO: handle exception
		}
		
	}
	public boolean deleteEmployee(Employee employeeById) {
		String sql="delete from employee where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,employeeById.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
			return false;
		}
		
	}	
	
	
	@Override
	public Employee getEmployeeById(int id)
	{
		String sql="select * from employee where id=?";	
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			Employee emp=null;
			while(rs.next()) {
				emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAddress(rs.getString("address"));
			emp.setAge(rs.getInt("age"));		
			emp.setPhone(rs.getLong("phone"));
			}
			return emp;
			}
		catch(SQLException e) {
			e.printStackTrace();	
			}	
		
		return null;



		
		
		// TODO Auto-generated method stub
		
	}	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<Employee>();
		String sql="select * from employee";
		try {
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setAge(rs.getInt("age"));
			
				emp.setPhone(rs.getLong("phone"));
				employees.add(emp);
			}
			return employees;
			}
			catch(SQLException e)
		{  
				e.printStackTrace();		
				}
		return null;
	}	
	
	private Connection getConnection() {
		Connection conn = null;
		try {			
			Class.forName("com.mysql.jdbc.Driver");			
	
			String url = "jdbc:mysql://localhost:3306/jdbcDemo";
			conn = DriverManager.getConnection(url, "root", "ROOT");
			return conn;
		} 
		catch (Exception e)
		{
			return null;
		}
		
	}
}
