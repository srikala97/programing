package search;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size of elements... ");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" of elements....");
		int[] ele=new int[size];
		for(int i=0;i<ele.length;i++)
		{
		    ele[i]=scan.nextInt();
			
		}
		/*for(int i=0;i<ele.length;i++)
		{
			System.out.println(ele[i]);
		}
		*/
		
		System.out.println(Arrays.toString(ele));
		
		for(int i=1;i<ele.length;i++)
		{
			int temp=ele[i];
			int j=i-1;
			while((j>=0)&&(ele[j]>temp))
			{
				ele[j+1]=ele[j];
				j--;
			}
			ele[j+1]=temp;
		}
		
		System.out.println(" After sorting...."+Arrays.toString(ele));
		
	}

}
