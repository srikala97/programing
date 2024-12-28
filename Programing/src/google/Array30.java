package google;

import java.util.Scanner;

public class Array30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the size...");
		int size=scan.nextInt();
		System.out.println(" Enter the "+size+" Elements...");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i+1];
			if(arr[i+1]==arr.length)
			{
				arr[arr.length-1]=arr[arr.length];
			}
			System.out.println(arr[i]);
		}
		
		
		
	}

}
