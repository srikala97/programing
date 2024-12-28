package google;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the size..");
      int size=scan.nextInt();
      System.out.println(" enter the "+size+" elements...");
      int[] arr=new int[size];
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=scan.nextInt();
      }
      int sum=0;
      double avg;
      for(int i=0;i<arr.length;i++)
      {
    	 sum=sum+arr[i];
    	 
      }
      avg=sum/arr.length;
		
		System.out.println(avg);
		
		
		
	}

}
