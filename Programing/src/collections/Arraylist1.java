package collections;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l1=new ArrayList();
		//add of elements to the arraylist...
		l1.add(100);
		l1.add("srikala");
		l1.add(25);
		l1.add(30);
		l1.add('A');
		l1.add(true);
		System.out.println(l1);
		//size of the arraylist....
		System.out.println(l1.size());
		//removing of an element in the arraylist....
		l1.remove(1);
		System.out.println(l1);
		// adding of element with index and object....
		l1.add(1, "kala");
		System.out.println(l1);
		//retrieving of specific value...
		System.out.println(l1.get(1));
		//change element/replace...
		l1.set(1, "sri");
		System.out.println(l1);
		//search contains return true/false
		System.out.println(l1.contains("kala"));
		//Isempty()
		System.out.println(l1.isEmpty());
		
		//for loop
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		//for each loop
		
		for(Object e:l1)
		{
			System.out.println(e);

		}

		//Iterator()
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		



		
		
		
		
		
	}

}
