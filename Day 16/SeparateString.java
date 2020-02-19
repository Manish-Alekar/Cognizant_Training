
public class SeparateString {
	public static void main(String...args) {
		String str="India will be 5 trillion USD economy by 2025";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}	
}
