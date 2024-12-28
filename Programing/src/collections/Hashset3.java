package collections;

import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h1=new HashSet();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		System.out.println(h1);
		
		HashSet h2=new HashSet();
		h2.add(3);
		h2.add(4);
		h2.add(5);
		System.out.println(h2);
		
		//union
		//h1.addAll(h2);
		//System.out.println(h1);
		
		//Intersection
		//h1.retainAll(h2);
		//System.out.println(h1);
		
		//difference
		//h1.removeAll(h2);
		//System.out.println(h1);
		
		//Subset
		h1.containsAll(h2);
		System.out.println(h1);
		System.out.println(h1.containsAll(h2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
