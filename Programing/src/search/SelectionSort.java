package search;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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
		System.out.println(" Array elements before sorting...."+Arrays.toString(ele));
		for(int i=0;i<ele.length-1;i++)
		{
			for(int j=i+1;j<ele.length;j++)
			{
				if(ele[i]>ele[j])
				{
					int temp=ele[i];
					ele[i]=ele[j];
					ele[j]=temp;
							
				}
			}
		}
		System.out.println(" Array elements before sorting...."+Arrays.toString(ele));
	}

}
