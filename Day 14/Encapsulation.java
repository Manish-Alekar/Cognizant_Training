class Example{
	private int age;
	private int salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
	 this.age=age;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Example exp = new Example();
		exp.setAge(10);
		int age=exp.getAge();
		System.out.print(age);
	}
}
