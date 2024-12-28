package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();
		l1.add(34);
		l1.add(56);
		l1.add(45);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.set(1, 78);
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1.contains(34));
		System.out.println(l1.isEmpty());
		


		
		
		
	}

}
