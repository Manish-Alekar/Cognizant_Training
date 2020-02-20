import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mango", 110);
		map.put("Grapes", 200);
		map.put("WaterMelon", 20);
		map.put("Banana", 70);
		map.remove("Banana",70);
		//System.out.println(map.get("Grapes"));
		
		//System.out.println(map);
		for(Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
			//System.out.println(entry.getValue());
		}
	}
}
