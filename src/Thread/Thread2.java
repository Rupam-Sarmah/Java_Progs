package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thread2 extends Thread {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public void run() {
		List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,5,6));
		int sumEven = li.stream()
				.filter(n->n%2==0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("sum of Even"+sumEven);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sumOdd = li.stream()
				.filter(n->n%2!=0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of Odd"+sumOdd);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Entire List:");
		li.stream().forEach(System.out::println);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of Odd::::::::::"+li.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum());
	}

}
