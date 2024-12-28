package dec14;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of element....");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" elements...");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
	
		LinkedHashSet l1=new LinkedHashSet();
		for(int i=0;i<size;i++)
		{
			l1.add(ele[i]);
		}
		
		System.out.println(l1);
		
		System.out.println(" Enter the key element....");
		int key=scan.nextInt();
		
		if(l1.contains(key))
		{
			System.out.println(" Element is found...");
		}
		
		else
		{
			
			System.out.println(" Element is not found...");
		}
		
		
		
	}

}
