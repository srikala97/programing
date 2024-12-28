package dec14;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of elements....");
		int size=scan.nextInt();
		System.out.println(" Enter the " +size+" elements...");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
			
		}
		System.out.println(" enter the search element....");
		int search=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			
			//System.out.print(ele[i]+",");
			
			if(ele[i]==search)
			{
				System.out.println(" Element is found");
				flag=true;
				break;
			}
			
			
		}
		
		if(flag==false)
		{
			System.out.println(" Element is not found....");
		}
	
		
	}
	
	
	
	
	
}
