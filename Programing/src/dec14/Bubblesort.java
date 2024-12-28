package dec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size...of elements....");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" of elements....");
		int[] ele=new int[size];
		for(int i=0;i<size;i++)
		{
			ele[i]=scan.nextInt();
		}
		
		
		ArrayList<Integer> a1=new ArrayList();
		for(int i=0;i<size;i++)
		{
			a1.add(ele[i]);
		}
		System.out.println("Elements before sorting" +a1);
		
		//System.out.println("Elements After sorting" +a1);
	for(int i=0;i<a1.size()-1;i++)
	{
		int temp=0;
		for(int j=0;j<a1.size()-i-1;j++)
		{
			if(a1.get(j)>a1.get(j+1))
			{
				temp=a1.get(j);
				a1.set(j, a1.get(j+1));
				a1.set(j+1, temp);
			}
		}
	}
		
	System.out.println("Elements After sorting" +a1);	
	
	Collections.sort(a1,Collections.reverseOrder());
	System.out.println(a1);
	
		
	}
	
	
	

	/*private static void bubbleSort(ArrayList<Integer> a1) {
		// TODO Auto-generated method stub
		
	}
*/
}
