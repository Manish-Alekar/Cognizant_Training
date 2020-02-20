import java.util.Comparator;

public class EmployeeDemo implements Comparable<EmployeeDemo> {
	int id;
	String name;
	String address;
	String city;
	int age;
	double salary;
	String designation;
	

	public EmployeeDemo(int id, String name, String address, String city, int age, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", age=" + age
				+ ", salary=" + salary + ", designation=" + designation + "";
	}


	public int compareTo(EmployeeDemo emp) {
		if(this.id<emp.id)
		{
			return 1;
		}
		else if(this.id==emp.id)
		{
			return 0;
		}
		else
		{
			return -1;
		}
		
	}
	
	
	
}

class SortByName implements Comparator<EmployeeDemo>{
	public int compare(EmployeeDemo emp1,EmployeeDemo emp2)
	{
		return emp1.getName().compareTo(emp2.getName());
	}
}
class SortByAddress implements Comparator<EmployeeDemo>{
	public int compare(EmployeeDemo emp1,EmployeeDemo emp2)
	{
		return emp1.getAddress().compareTo(emp2.getAddress());
	}
}class SortByDesignation implements Comparator<EmployeeDemo>{
	public int compare(EmployeeDemo emp1,EmployeeDemo emp2)
	{
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}
}