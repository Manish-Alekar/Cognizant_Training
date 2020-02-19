
public class ToggleAlternate {
	public static void main(String...args) {
		//String str1="";
		String str = "Java programming is easy";
		//char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			/*char str1=str.charAt(i+1);
			String str2=String.valueOf(str1);  
			str3=str2.toUpperCase();  */
			if(i%2==0)
				System.out.print(Character.toUpperCase(str.charAt(i)));
			else
				System.out.print(Character.toLowerCase(str.charAt(i)));
		}
		//System.out.println(str3);
	}
}
