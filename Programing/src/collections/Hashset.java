package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h1=new HashSet();
		//HashSet h2=new HashSet(100,(float)0.90);
		//HashSet<Integer> h3=new HashSet<Integer>();
		
		h1.add("Srikala");
		h1.add('A');
		h1.add(true);
		h1.add(56);
		h1.add(62.5);
		h1.add(null);
		System.out.println(h1);
		
		System.out.println(h1.contains('A'));
		h1.remove("Srikala");
		System.out.println(h1);
		System.out.println(h1.isEmpty());
		for(Object e:h1)
		{
			System.out.println(e);
		}
		
		Iterator it=h1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
		
	}

}
