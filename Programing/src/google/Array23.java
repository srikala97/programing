package google;

import java.util.Scanner;

public class Array23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println(" enter the size..");
      int size=scan.nextInt();
      System.out.println(" enter the "+size+" elements...");
      int[] arr=new int[size];
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=scan.nextInt();
      }
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
