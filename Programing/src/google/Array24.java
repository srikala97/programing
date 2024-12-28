package google;

import java.util.Scanner;

public class Array24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println(" enter the row...");
       int row=scan.nextInt();
       System.out.println(" enter the column...");
       int column=scan.nextInt();
      // System.out.println(" enter the "+row+" "+column);
       int[][] arr1=new int[row][column];
       for(int i=0;i<arr1.length;i++)
       {
    	   for(int j=0;j<arr1.length;j++)
    	   {
    		   System.out.println("enter the "+i+" "+j);
    		   arr1[i][j]=scan.nextInt();
    	   }
       }
       for(int i=0;i<arr1.length;i++)
       {
    	   for(int j=0;j<arr1.length;j++)
    	   {
    		   System.out.print(arr1[i][j]+" ");
    	   }
    	   System.out.println();
       }
		
		
	}

}
