package collections;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(23);
		h2.add(56);
		h2.add(78);
		System.out.println(h2);
		
		HashSet<Integer> h3=new HashSet<Integer>();
		h3.addAll(h2);
		System.out.println(h3);
		h3.add(100);
		System.out.println("New hashset "+h3);
		
		//removing all
		
		h3.removeAll(h2);
		System.out.println(h3);

		
		
		
		
		
		
		
		
	}

}
