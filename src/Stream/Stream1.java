package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<String> strlist = Arrays.asList("John", "Herry", "Stephan", "Json");
		//Internal Iteration
		System.out.print("This is internal Iteration");
		strlist.forEach(System.out::println);
		System.out.println("----------------------------");
		
		//filter
		
		List<String> name = strlist.stream()
				.filter(n -> n.startsWith("J"))
				.collect(Collectors.toList());
		System.out.println(name);
		System.out.println("This is Filter");
		System.out.println("----------------------------");
		
		List<Integer> length = strlist.stream()
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(length);
		System.out.println("This is Map");
		System.out.println("----------------------------");
		
		List<Integer> numlist = Arrays.asList(1,2,4,5,7,89,0);
		int num =  numlist.stream().reduce(0,
				(a,b)-> a+b);
		System.out.println(num);
		System.out.println("This is reduce");
		System.out.println("----------------------------");
	}

}
