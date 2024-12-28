package google;

import java.util.Scanner;

public class Array28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" enter the 1st array size");
      int size1=scan.nextInt();
      System.out.println(" enter the "+size1+" elements...");
      int[] arr1=new int[size1];
      for(int i=0;i<arr1.length;i++)
      {
    	  arr1[i]=scan.nextInt();
      }
      System.out.println(" enter the 2nd array size");
      int size2=scan.nextInt();
      System.out.println(" enter the "+size2+" elements...");
      int[] arr2=new int[size2];
      for(int i=0;i<arr2.length;i++)
      {
    	  arr2[i]=scan.nextInt();
      }
	System.out.println(" Third array after transferring elements from both arrays:");
	
	int[] arr3=new int[size1+size2];
	
	for(int i=0;i<size1;i++)
	{
		arr3[i]=arr1[i];
	}
	for(int i=0;i<size2;i++)
	{
		arr3[i+size1]=arr2[i];
	}
	for(int i=0;i<arr3.length;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	
		
	}

}
