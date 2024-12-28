package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size....");
		int size=scan.nextInt();
		System.out.println(" enter the " +size+" elements...  ");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		 Arrays.sort(ele);
		System.out.println(" enter the key element");
		int key=scan.nextInt();
	    int l=0;
	    int h=ele.length-1;
	    boolean flag=false;
	    
	    while(l<=h)
	    {
	    	int mid=(l+h)/2;
	    	if(ele[mid]==key)
	    	{
	    		System.out.println(" element is found.....");
	    		flag=true;
	    		break;
	    	}
	    	if(key>ele[mid])
	    	{
	    		l=mid+1;
	    	}
	    	if(key<ele[mid])
	    	{
	    		h=mid-1;
	    	}
	    }
	    if(flag==false)
	    {
	    	System.out.println(" element not found");
	    }
		
		
	}

}
