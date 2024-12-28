package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet l1=new HashSet();
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("Srikala");
		l1.add(56);
		l1.add(true);
		l1.add('A');
		l1.add(82.5);
		System.out.println(l1);
		
		l1.remove('A');
		System.out.println(l1);

		System.out.println(l1.contains(82.5));
		
		
	}

}
