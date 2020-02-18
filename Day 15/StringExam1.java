/*Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"
*/
public class StringExam1 {
	static public boolean isAlphanumeric(String str)
	{
		boolean result=false;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		if(str.charAt(i)<=90 && str.charAt(i)>=65 && str.charAt(i)<9)
		{
			result=true;
		}	/*System.out.println("String is alphanumeric.");*/
		else
		{
			result=false;
			break;
		}
		//System.out.println("String is not alphanumeric");
	}
		return result;//System.out.println(str.matches("^[a-zA-Z0-9]*$"));
	}
	static public boolean toTitleCase(String str)
	{
		boolean result=false;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		if(str.charAt(i)<=90 && str.charAt(i)>=65 && str.charAt(i)<9)
		{
			result=true;
		}	
		else
		{
			result=false;
			break;
		}
		
	}
		return result;
	}
	public static void main(String[] args) {
		String str="Global Warming";
		String str1=str.substring(10,14);
		System.out.println(str1);
		String str2=str.substring(4,8);
		System.out.println(str2);
		int str3=str.indexOf("Wa");
		
		System.out.println(str3);
		String str5=str.toUpperCase();
		System.out.println(str5);
		
		String str6=str.replace("a","*");
		System.out.println(str6);
		String str7=str.substring(0,9);
		System.out.println(str7);
		String str8=str.substring(4);
		System.out.println(str8);
		System.out.println(isAlphanumeric(str));
	}
	
}
