package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("srikala");
		a1.add("kala");
		a1.add("shiva");
		a1.add("roo");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(" after sorting...."+a1);
		//a1.clear();
		//System.out.println(a1);
		
		
		
	}

}
