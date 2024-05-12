import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class IteratorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
		li.add("Apple"); li.add("orange"); li.add("banana");
		System.out.println(li);
		
		Set<String> hs=new HashSet<>();
		hs.add("a"); hs.add("z"); hs.add("b");
		System.out.println(hs);
		
		//List with Iterator
		Iterator<String> i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		
	}

}
