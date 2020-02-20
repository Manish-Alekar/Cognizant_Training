import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<EmployeeDemo> list = new ArrayList<>();
		addEmployeeDemo(list);
		Collections.sort(list,new SortByDesignation());
		for(EmployeeDemo emp : list)
		{
			System.out.println(emp);
		}
	}
	private static void addEmployeeDemo(ArrayList<EmployeeDemo> list) {
		EmployeeDemo emp1 = new EmployeeDemo(1,"manish","Badlapur","mumbai",22,22000.0,"developer");
		EmployeeDemo emp2 = new EmployeeDemo(3,"nimish","bhoisar","virar",23,22000.0,"tester");
		EmployeeDemo emp3 = new EmployeeDemo(2,"vijay","nalasopara","mumbai",21,22000.0,"software engineer");
		EmployeeDemo emp4 = new EmployeeDemo(4,"sanket","sion","mumbai",25,22000.0,"hr");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
	}
	}
