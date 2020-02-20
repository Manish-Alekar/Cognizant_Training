import java.util.Hashtable;
import java.util.Map.Entry;

public class TreeMapDemo {
	public static void main(String[] args) {
		Hashtable<String, String> map = new Hashtable<>();
		map.put("Banana", "35");
		map.put("Orange", "60");
		map.put("Mango", "110");
		map.put("Grapes", "200");
		map.put("WaterMelon", "20");
		for(Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			
		}
		
	}
}
