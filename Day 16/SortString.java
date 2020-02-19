//import java.lang.reflect.Array;
import java.util.Arrays;

public class SortString {
	public static String sortInput(String str) {
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);	
	}
	public static void main(String...args) {
		String str="helloworld";
		String output= sortInput(str);
		System.out.println("Input String :"+str);
		System.out.println("Output String :"+output);
		
	}
}
