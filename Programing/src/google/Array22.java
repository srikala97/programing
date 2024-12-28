package google;

import java.util.Scanner;

public class Array22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size...");
		int size=scan.nextInt();
		System.out.println(" enter the "+size+" elements...");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
