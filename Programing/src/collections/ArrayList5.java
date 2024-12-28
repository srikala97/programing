package collections;

import java.util.ArrayList;

//import google.Array;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<String>();
		a1.add("srikala");
		a1.add("kala");
		a1.add("shiva");
		a1.add("kanth");
		a1.add("rooo");
		String[] a2=new String[a1.size()];
		a1.toArray(a2);
		
		for(String ele:a2)
		{
			System.out.println(ele);
		}
		
		
		
		
	}

}
