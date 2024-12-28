package dec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size of element...");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" elements....");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		List<Integer> ele=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			ele.add(arr[i]);
		}
		System.out.println(" enter the search element....");
		int search=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			
			//System.out.print(ele[i]+",");
			
			if(ele.get(i)==search)
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
