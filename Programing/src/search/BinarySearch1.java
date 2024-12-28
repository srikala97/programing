package search;

import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size.....");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" elements....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		System.out.println(" enter the key element.....");
		int key=scan.nextInt();
		int l=0;
		int h=ele.length-1;
		boolean flag=false;
        while(l<h)
        {
        	int mid=(l+h)/2;
        	if(key==mid)
        	{
        		System.out.println(" element found....");
        		flag=true;
        		break;
        	}
        	if(key>mid)
        	{
        		l=mid+1;
        	}
        	if(key<mid)
        	{
        		l=mid-1;
        	}
        	
        }

		if(flag==false)
		{
			System.out.println(" element found....");
		}
		
		
		
		
	}

}
