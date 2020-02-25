package com.connectivity;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter id:");
//		int id=Integer.parseInt(br.readLine());
//		System.out.println("Enter name:");
//		String name=br.readLine();
//		System.out.println("Enter age:");
//		int age=Integer.parseInt(br.readLine());
//		System.out.println("Enter address:");
//		String address=br.readLine();
//		System.out.println("Enter designation:");
//		String desig=br.readLine();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcDemo";
		Connection conn = DriverManager.getConnection(url,"root","ROOT");
//		String query="insert into user values(?,?,?,?,?)";
//		String query="update user set name=? where id=?";
		String query="select * from user";
		PreparedStatement ps=conn.prepareStatement(query);
//		ps.setInt(1,id);
//		ps.setString(2,name);
//		ps.setInt(3,age);
//		ps.setString(4,address);
//		ps.setString(5,desig);
//		int result=ps.executeUpdate();
//		ps.setString(1, name);
//		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery(query);
//		int result=ps.executeUpdate();
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age =rs.getInt(3);
			String address=rs.getString(4);
			String designation=rs.getString(5);
			System.out.println(id+" : "+name+" : "+age+" : "+address+" : "+designation);
		}
//		else
//		{
//			System.out.println("Try Again");
//		}
		//System.out.println(conn.getClass().getName());
		//Statement stat = conn.createStatement();
		//String query="delete from employee where id=2";
//		int result=stat.executeUpdate(query);
//		if(result>0) {
//			System.out.println("Record deleted successfully!!");
//		}
//		else
//		{
//			System.out.println("Something went wrong..");
//		}
		//***********CREATE TABLE***********
		/*String sql = "CREATE TABLE user " +
                "(id int primary key , " +
                " name varchar(30), " + 
                " age int, " + 
                " address varchar(30), " + 
                " designation varchar(30))"; 
		stat.executeUpdate(sql);
		
		if(stat!=null)
		{
			conn.close();
		}*/
		//************INSERT INTO**************
		/*String insert="insert into user values(1,'Manish',22,'Mumbai','PAT')";
		stat.executeUpdate(insert);
		insert="insert into user values(2,'Nimish',22,'Pune','ET')";
		stat.executeUpdate(insert);
		insert="insert into user values(3,'Sanjay',23,'Mumbai','PAT')";
		stat.executeUpdate(insert);*/
		//************UPDATE*************
		//String update="update user set name='Sanket' where id=3";
		//stat.executeUpdate(update);
//		ResultSet rs=stat.executeQuery(sql);
//		while(rs.next())
//		{
//			int id=rs.getInt(1);
//			String name=rs.getString(2);
//			String address=rs.getString(3);
//			int age=rs.getInt(4);
//			long phone=rs.getLong(5);
//			System.out.println(id +"\t"+name +"\t"+address +"\t"+age +"\t"+phone);
//		}
		
	}
}
