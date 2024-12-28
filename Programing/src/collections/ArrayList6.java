package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the element size....");
		int size=scan.nextInt();
		System.out.println(" enter the"+size+ " elements ");
		String[] a1=new String[size];
		for(int i=0;i<size;i++)
		{
			a1[i]=scan.next();
		}
		/*for(int i=0;i<size;i++)
		{
			System.out.println(a1[i]);
		}
	*/
		ArrayList<String> arr=new ArrayList<String>(Arrays.asList(a1));
		System.out.println(arr);
		
		
	}

}
