class Q
{
	public void display()
	{
		System.out.println("Class Q");
	}
}
class P extends Q
{
	@Override
	public void displays()
	{
		System.out.println("Class P");
	}
}
public class Poly {
	public static void main(String[] args) {
		P b = new P();
		Q a = new Q();
		Q a1 = new P();
		a1.display();
	}
}
