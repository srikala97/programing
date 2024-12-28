package collections;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Hashtable <Integer, String> t1=new Hashtable<Integer,String>();
        t1.put(101, "sri");
        t1.put(102, "kala");
        t1.put(103, "hello");
        t1.put(104, "how");
        t1.put(105, "heyy");
        
        System.out.println(t1);
       System.out.println(t1.get(103));
       t1.remove(104);
       System.out.println(t1);
       System.out.println(t1.containsKey(104));
       System.out.println(t1.containsKey(105));
       System.out.println(t1.containsValue("heyy"));
       System.out.println(t1.isEmpty());
       System.out.println(t1.keySet());
       System.out.println(t1.values());
       System.out.println(t1.entrySet());
       for(Object i:t1.entrySet())
       {
    	   System.out.println(i);
       }


       
		
		
	
	}

}
