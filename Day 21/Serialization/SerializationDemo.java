package com.Serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void serialize(Employee1 employee,String path)throws Exception{
		FileOutputStream fout = new FileOutputStream(path);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		ObjectOutputStream oos = new ObjectOutputStream(bout);
		oos.writeObject(employee);
		oos.close();
		bout.close();
		fout.close();
	}
	public static Object deserialize(String filePath) throws Exception
	{
		FileInputStream fin = new FileInputStream(filePath);
		BufferedInputStream bin = new BufferedInputStream(fin);
		ObjectInputStream oin = new ObjectInputStream(bin);
		Object obj = oin.readObject();
		return obj;
	}
	
	public static void main(String[] args) throws Exception {
//		Employee1 employee = new Employee1(111,"manish","mumbai",22,754812654);
//		serialize(employee,"employee.txt");
//		System.out.println("Object saved successfully");
		Employee1 employee = (Employee1) deserialize("employee.txt");
		System.out.println(employee);
 	}
}
