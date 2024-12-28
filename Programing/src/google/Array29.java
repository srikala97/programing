package google;

import java.util.Scanner;

public class Array29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println(" enter the size of an array...");
     int size=scan.nextInt();
     System.out.println(" Enter the "+size+" elements");
     int[] arr=new int[size];
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=scan.nextInt();
     }
     
     for(int i=0;i<arr.length;i++)
     {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[i]==arr[j])
    		{
    			System.out.print(arr[j]);
    		}
    	}
     }
     
	}

}
