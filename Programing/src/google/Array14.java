package google;

import java.util.Scanner;

public class Array14 {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size..");
       int size=scan.nextInt();
       System.out.println("enter the "+size+" elements...");
       int[] arr=new int[size];
       for(int i=0;i<arr.length;i++) 
       {
    	   arr[i]=scan.nextInt();
       }
       int max=arr[0];
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]<max)
    	   {
    		   max=arr[i];
    	   }
       }
    	   
       System.out.println(max);
		
		
		
	}

}
