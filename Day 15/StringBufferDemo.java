
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Welcome to java 8");
		System.out.println(sb.capacity());
		sb.append(" This is my question for demo ");
		System.out.println(sb.capacity());
		sb.insert(7," Dear");
		System.out.println(sb);
		sb.replace(7,15,"Sanket");
		System.out.println(sb);
	}
}
