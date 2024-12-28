package google;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size..");
       int size=scan.nextInt();
       System.out.println("enter the elements...");
       int[] elements=new int[size];
       for(int i=0;i<=elements.length-1;i++)
       {
    	   elements[i]=scan.nextInt();
       }
       int sum=0;
       int avg=0;
		for(int i=0;i<=elements.length-1;i++)
		{
		    sum=sum+elements[i];
		   
		    	
		}
		System.out.println(sum);
		 avg=sum/elements.length;
		System.out.println(avg);
		
		
		
	}

}
