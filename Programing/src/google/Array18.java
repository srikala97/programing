package google;

import java.util.Scanner;

public class Array18 {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println(" enter the number of rows...");
      int rows=scan.nextInt();
      System.out.println(" enter the number of columns...");
      int columns=scan.nextInt();
      int[][] arry=new int[rows][columns];
      for(int i=0;i<rows;i++)
      {
    	  for(int j=0;j<columns;j++)
    	  {
    		  System.out.println(" enter the elements "+i+" "+j);
    		  arry[i][j]=scan.nextInt();
    	  }
      }
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arry[i][j]);
			
			}
			System.out.println();
		}
		//System.out.println();
		
		
	}

}
