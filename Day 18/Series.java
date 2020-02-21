import java.util.ArrayList;

public class Series {
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		int a=10;
		int n=9;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				a=a+2;
				num.add(a);
			}
			else {
				a=a+4;
				num.add(a);
			} 
		}
		for(int i = n-1;i>=0;i--) {
			System.out.print(" "+num.get(i));
		}
		
		//System.out.print(num);
		
		

		
	
		
	}
}
