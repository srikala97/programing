package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size of elements....");
		int size=scan.nextInt();
		System.out.println("enter the " +size+" elements....");
		String[] a1=new String[size];
		for(int i=0;i<size;i++)
		{
			a1[i]=scan.next();
		}
		
		for(int i=size-1;i>=0;i--)
		{
			//System.out.println(a1[i]);
		
		
		ArrayList l1=new ArrayList(Arrays.asList(a1[i]));
		//l1.toArray(a1);
		System.out.println(l1);
		}
	}

}
