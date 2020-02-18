interface Add{
	int add(int a, int b);
	int mul(int a, int b)
	{
		return a*b;
	}
}
	
interface Sub extends Add{
	int add(int a, int b);
}
class Div{
	public int div(int a,int b)
	{
		return a/b;
	}
}

class Impl extends Div implements Add
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		if(a>b)
			return a-b;
		else
			return b-a;
	}
}
public class TestInterface {
	public static void main(String[] args) {
		Add imp = new Impl();
		System.out.println(imp.add(2,3));
		System.out.println(imp.sub(9,17));
		System.out.println(imp.div(10,2));
		System.out.println(imp.mul(10,2));
	}
}
