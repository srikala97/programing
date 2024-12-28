package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of elements....");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" elements....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}*/
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(101, "srikala");
		h1.put(102, "shivanna");
		h1.put(103, "shashikala");
		h1.put(104, "srikanth");
		h1.put(105, "shailaja");
		
		System.out.println(h1);
		System.out.println(h1.get(103));
		h1.put(106, "kala");
		System.out.println(h1);
		h1.remove(103);
		System.out.println(h1);
		System.out.println(h1.containsKey(104));
		System.out.println(h1.containsValue("srikanth"));
		System.out.println(h1.isEmpty());
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.entrySet());
		for(Object i:h1.entrySet())
		{
			System.out.println(i);
			
			
		}
		
		/*for(Object i:h1.values())
		{
			System.out.println(i);
			
			
		}*/
		
		for(Object i:h1.keySet())
		{
			System.out.println(i+"    "+h1.get(i));
		}
		
		for( Map.Entry entry:h1.entrySet())
		{
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
				
		
	}

}
