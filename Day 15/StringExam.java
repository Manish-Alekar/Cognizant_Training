
public class StringExam {
	public static void main(String[] args) {
		String msg="I am an engineer";
		String year="of 2020";
		msg=msg.concat(year);
		System.out.println(msg);
		String str1=msg.substring(3,10);
		
		System.out.println(str1);
		int str2=msg.indexOf('e');
		System.out.println(str2);
		int str3=msg.lastIndexOf("e");
		System.out.println(str3);
		char str4=msg.charAt(6);
		System.out.println(str4);
		CharSequence str5=msg.subSequence(4,10);
		System.out.println(str5);
		String str6=msg.replace("an","IT");
		System.out.println(str6);
		String str7=msg.toLowerCase();
		System.out.println(str7);
		String str8=msg.toUpperCase();
		System.out.println(str8);
		String str9=msg.trim();
		System.out.println(str9);
		int str10=msg.valueOf(str);
		System.out.println(str10);
	}
}
