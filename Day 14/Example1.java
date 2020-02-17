import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		int m,n,sum=0;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number: ");
		m=ab.nextInt();
		ab.close();
		while(m>0) {
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("Sum of digits : "+sum);
		
	}
}
