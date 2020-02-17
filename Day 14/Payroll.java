import java.util.Scanner;

class Employee{
	int empid;
	String name,designation,address;
	long mob_no;
	public void getdata() {
		Scanner sc = new Scanner(System.in);
		empid=sc.nextInt();
		name=sc.nextLine();
		designation=sc.nextLine();
		address=sc.nextLine();
		sc.close();
	}
	public void putdata() {
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Address:"+address);
		System.out.println("Mobile no:"+mob_no);
	}
}
class Salary extends Employee{
	
	
	float base_pay,da,hra,gross_pay,pf,income_tax,net_pay;
	public void getdata1() {
		super.getdata();
		Scanner sb = new Scanner(System.in);
		base_pay=sb.nextFloat();
		da=sb.nextFloat();
		hra=sb.nextFloat();
		pf=sb.nextFloat();
		income_tax=sb.nextFloat();
		sb.close();
		/*this.base_pay=base_pay;
		this.da=da;
		this.hra=hra;
		this.pf=pf;
		this.income_tax=income_tax;*/
	}
	
	public void calculate() {
		gross_pay=base_pay+da+hra;
		net_pay=gross_pay-income_tax-pf;
	}
	public void display() {
		super.putdata();
		System.out.println(base_pay+"\n"+da+"\n"+hra+"\n"+gross_pay+"\n"+pf+"\n"+income_tax+"\n");
		System.out.println("Net Pay is : "+net_pay);
		
	}
}
public class Payroll {
	public static void main(String[] args) {
		Salary sal = new Salary();
		sal.getdata1();
		sal.calculate();
		sal.display();
	}
}
