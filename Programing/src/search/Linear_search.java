package search;

import java.util.Scanner;

public class Linear_search {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of array...");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" elements...");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(ele[i]+" ,");
		}
		System.out.print(" Enter the search element....");
		int searchele=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<ele.length;i++)
		{
			if(searchele==ele[i])
			{
				System.out.println(" Element found..." +ele[i]);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(" Element not found....");
		}
		
		
		
	}
	
	
	
	
}
