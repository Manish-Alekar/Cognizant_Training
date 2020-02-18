class Test{
	int x=10;
	static int y=20;
	static public void show()
	{
		System.out.println(x);
	
	}
}
public class StaticDemo {
	public static void main(String [] args) {
		Test t = new Test();
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t.x);
		System.out.println(t.y);
		t2.x=50;
		t1.y=30;
		System.out.println(t.x);
		System.out.println(t2.y);
	}
}
