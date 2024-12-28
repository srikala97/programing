package dec14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size of element....");
		int size=scan.nextInt();
		System.out.println(" Enter the" +size+" of element....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		
		
		/*for(int i=0;i<size;i++)
		{
			System.out.println(ele[i]);
		}
		
		*/
		LinkedList<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			l1.add(ele[i]);	
		}
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(" enter the search key element....");
		int key=scan.nextInt();
		int l=0;
		int h=l1.size()-1;
		boolean flag=false;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(l1.get(mid)==key)
			{
				System.out.println(" Element is found...");
				flag=true;
				break;
				
			}
			
			if(key>l1.get(mid))
			{
				l=mid+1;
			}
			
			
			if(key<l1.get(mid))
			{
				h=mid-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println(" Element is not found...");
		}
		
		
		
		
		
	}

}
