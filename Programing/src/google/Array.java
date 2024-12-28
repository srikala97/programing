package google;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scan=new Scanner(System.in);
       System.out.println(" enter the size of array...");
       int size=scan.nextInt();
       System.out.println("Enter"+size+"elements...");
       int[] arr=new int[size];
       for(int i=0;i<arr.length-1;i++)
       {
    	   arr[i]=scan.nextInt();
       }
		for(int k:arr)
		{
			System.out.println(k);
		}
		
		

	}

}
