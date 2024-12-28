package dec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size of element....");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" of elements...");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			l1.add(ele[i]);
		}
		System.out.println(" Elements before sorting...."+l1);
		Collections.sort(l1);
		
		System.out.println(" Elements After sorting...."+l1);
		System.out.println(" enter the search element...");
		int search=scan.nextInt();
		int l=0;
		int h=l1.size()-1;
		//int mid=(l+h)/2;
		boolean flag=false;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(search==l1.get(mid))
			{
				System.out.println(" Element is found....");
				flag=true;
				break;
			}
			if(search>l1.get(mid))
			{
				l=mid+1;
			}
			
			if(search<l1.get(mid))
			{
				h=mid-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println(" Element is not found....");
		}
		
	}

}
