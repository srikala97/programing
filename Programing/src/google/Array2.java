package google;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size of element...");
       int size=scan.nextInt();
       System.out.println("enter"+size+"elements....");
       double[] arr=new double[size];
       for(int i=0;i<=arr.length-1;i++)
       {
    	   arr[i]=scan.nextDouble();
       }
       for(double k:arr)
       {
    	   System.out.println(k);
       }
		
		
		
		
		
		
	}

}
