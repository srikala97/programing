package dec14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size....");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" elements....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
	//	HashSet<Integer> h1=new HashSet<Integer>(Arrays.asList(ele));
		HashSet<Integer> h1=new HashSet<Integer>();
		for(int i=0;i<size;i++)
		{
			h1.add(ele[i]);
		}
		System.out.println(" enter the search element....");
		int search=scan.nextInt();
		//System.out.println(h1);
		boolean flag=false;
		/*for(int i=0;i<size;i++)
		{
			if(h1[i].)
			{
				System.out.println(" Element is found....");
				flag=true;
			}
		}
		*/
		
		if(h1.contains(search))
		{
			System.out.println(" Element is found....");
			flag=true;
		}
		if(flag==false)
		{
			System.out.println(" Element is not found....");
		}
		
	}

}
