import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
public class IteratorExampleNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();:
		 * 
			This line retrieves an iterator over the set of map entries (Map.Entry<String, Integer>).
			 Each entry in the map consists of a key-value pair. The entrySet() method returns a set 
			 containing all the entries in the map.
		 */
		/***
		 * Iterator<String> iterator = map.keySet().iterator();:
		 * 
			*This line retrieves an iterator over the set of keys (String) in the map.
			* The keySet() method returns a set containing all the keys in the map.
		 */
		//Type-1
		Map<String,Integer> m=new ConcurrentHashMap<>();
		m.put("one", 1);m.put("Two", 2); m.put("Three", 3);
		Iterator<Map.Entry<String,Integer>> i=m.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<String,Integer> data = i.next();
			String key=data.getKey();
			Integer value=data.getValue();		
			System.out.println(key+"---"+value);
		}
		
		//Type-2
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key+"...."+m.get(key));
		}

	}

}
