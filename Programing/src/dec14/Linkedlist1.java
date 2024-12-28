package dec14;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of elements....");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" elements....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		LinkedList<Integer> l1=new LinkedList<Integer> ();
		for(int i=0;i<size;i++)
		{
			l1.add(ele[i]);
		}
		
		System.out.println(" Enter the search element...");
		int search=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<l1.size()-1;i++)
		{
			if(search==l1.get(i))
			{
				System.out.println(" Element is found...");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(" Element is not found");
		}
		
		
	}

}
