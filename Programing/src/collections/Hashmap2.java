package collections;

import java.util.HashMap;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap h1=new HashMap();
		h1.put(101,"sri");
		h1.put(102,"kala");
		h1.put(103,"kanth");
		
		HashMap h2=new HashMap();
		h2.put(104,"hey");
		h2.put(105,"how?");
		
		h1.putAll(h2);
		System.out.println(h1);
		
		/*System.out.println(h1.keySet());
		
		for(Object i:h1.keySet())
		{
			System.out.println(i);
		}
		*/
		
		//System.out.println(h1.entrySet());
		h1.remove(104);
		System.out.println(h1);

		
		
	}

}
