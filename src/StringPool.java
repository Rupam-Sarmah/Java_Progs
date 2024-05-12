// Program 2: Comparing two references to objects 
// created using new operator. 
import java.util.*; 

// Driver Class 
class StringPool { 
	// main function 
	public static void main(String[] args) 
	{ 
		String s1 = new String("abc"); 
		String s2 = new String("abc"); 
		String s3 = "abc";

		// Note that this == compares whether 
		// s1 and s2 refer to same object or not 
		if (s1.equals(s2)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
}
