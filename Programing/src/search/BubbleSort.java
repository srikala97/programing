package search;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
		/*for(int i=0;i<size;i++)
		{
			System.out.print(ele[i]+" ,");
		}
		*/
		
		System.out.println(" Array elements before sorting..."+Arrays.toString(ele));
		for(int i=0;i<ele.length-1;i++)
		{
			for(int j=0;j<ele.length-1;j++)
			{
				if(ele[j]>ele[j+1])
				{
					int temp=ele[j];
					ele[j]=ele[j+1];
					ele[j+1]=temp;
				}
			}
		}
		
	/*	for(int i=0;i<size;i++)
		{
			System.out.print(ele[i]+" ,");
		}
		*/
		
		System.out.println(" Array elements after sorting..."+Arrays.toString(ele));
		
		
		
	}

}
