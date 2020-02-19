import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		HashSet<String> set= new HashSet<>();
		set.add("Hello");
		set.add("to");
		set.add("Java");
		set.add("Batch");
		set.add("7");
		set.add("true");
		System.out.println(set);
		
		//Iterator<String> it=set.iterator();
		Iterator<String> it=set.iterator();
		//System.out.println("*****Forward Direction*****");
		
				
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			if(element.equals("Java")) {
				break;
			}
		}
		/*
		System.out.println("*****Backward Direction*****");
		while(it.hasPrevious()) {
			String element=it.previous();
			System.out.println(element);
		}
		System.out.println("set size :"+set.size());
		System.out.println("set contains Python? :"+set.contains("Python"));
		
		for(String obj:set)
		{
			System.out.println(obj);
			if(obj.equals("Java"))
			{
				break;
			}
		}*/
	}
}
