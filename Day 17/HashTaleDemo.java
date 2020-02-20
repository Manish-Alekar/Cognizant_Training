import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTaleDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> map = new Hashtable<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mango", 110);
		map.put("Grapes", 200);
		map.put("WaterMelon", 20);
		for(Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
		
	}
}
