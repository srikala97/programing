package collections;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(45);
		l1.add(67);
		l1.add(90);
		System.out.println(l1);
		l1.addFirst(100);
		l1.addLast(70);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);

		

		

		
		
		
	}

}
