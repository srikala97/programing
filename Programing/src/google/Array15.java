package google;

import java.util.Scanner;

public class Array15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the rows..");
      int row=scan.nextInt();
      System.out.println("enter the column...");
      int column=scan.nextInt();
      int[][] arr=new int[row][column];
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<column;j++)
    	  {
    		  System.out.println("enter the "+i+" "+j);
    		  arr[i][j]=scan.nextInt();
    	  }
      }
      int sum=0;
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<column;j++)
    	  {
    		  System.out.print(arr[i][j]+" ");
    		  sum=sum+arr[i][j];
    	  }
    	  System.out.println();
      }
      
		System.out.println(sum);
		
		
		
		
	}

}
