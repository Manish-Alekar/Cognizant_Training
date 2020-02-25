package com.Serialization;

import java.io.Serializable;

public class Employee1 implements Serializable{

	int id;
	String name;
	String address;
	
	transient int age;
	
	long phone;

	public Employee1() {
	}

	public Employee1(int id, String name, String address,  int age,  long phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		
		this.age = age;
		
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + address + " : " + age+"  :  "+phone;

	}

}
