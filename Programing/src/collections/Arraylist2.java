package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a2=new ArrayList();
		a2.add('a');
		a2.add('z');
		a2.add('k');
		a2.add('c');
		a2.add('i');
		//System.out.println(a2);
		ArrayList a2_dup=new ArrayList();
		a2_dup.add(a2);
		System.out.println(" After adding all elements" +a2_dup);
		//a2_dup.removeAll(a2_dup);
		//System.out.println(" After removing all elements..." +a2_dup);
		System.out.println(" elements before sorting...."+a2);
		Collections.sort(a2);
		System.out.println(" elements after sorting...."+a2);
		Collections.sort(a2,Collections.reverseOrder());
		System.out.println(" elements reverse sorting...."+a2);
		Collections.shuffle(a2);
		System.out.println(" elements after shuffle...."+a2);

		

		

		

		
		
		
		
		
	}

}
