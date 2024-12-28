package google;

import java.util.Scanner;

public class Array16 {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the first array");
      System.out.println(" enter the size of rows in first array");
      int firstarryrow=scan.nextInt();
      System.out.println(" enter the size of columns in first array");
      int firstarrycolumn=scan.nextInt();
      int[][] arry1=new int[firstarryrow][firstarrycolumn];
      for(int i=0; i<firstarryrow;i++)
      {
    	  for(int j=0;j<firstarrycolumn;j++)
    	  {
    		  System.out.println("enter the "+i+" "+j);
    		  arry1[i][j]=scan.nextInt();
    	  }
      }
      
      System.out.println("Enter the second array");
      System.out.println(" enter the size of rows in second array");
      int secondarryrow=scan.nextInt();
      System.out.println(" enter the size of columns in second array");
      int secondarrycolumn=scan.nextInt();
      int[][] arry2=new int[secondarryrow][secondarrycolumn];
      for(int i=0; i<secondarryrow;i++)
      {
    	  for(int j=0;j<secondarrycolumn;j++)
    	  {
    		  System.out.println("enter the "+i+" "+j);
    		  arry2[i][j]=scan.nextInt();
    	  }
      }
	System.out.println(" first array ....");	
	for(int i=0;i<firstarryrow;i++)
	{
		 for(int j=0;j<firstarrycolumn;j++)
		 {
			 System.out.print(arry1[i][j]+" ");
		 }
		 System.out.println();
	}
	System.out.println(" Second array....");
	for(int i=0;i<secondarryrow;i++)
	{
		 for(int j=0;j<secondarrycolumn;j++)
		 {
			 System.out.print(arry2[i][j]+" ");
		 }
		 System.out.println();
	}
	
	System.out.println(" Adding of two array....");
	if((firstarryrow==secondarryrow)&&(firstarrycolumn==secondarrycolumn))
	{
		int[][] addarry=new int[firstarryrow][secondarryrow];
		for(int i=0;i<firstarryrow;i++)
		{
			for(int j=0;j<firstarrycolumn;j++)
			{
				addarry[i][j]=arry1[i][j]+arry2[i][j];
				System.out.print(addarry[i][j]+" ");
			}
			System.out.println();
		}
			
	}
	else
	{
		System.out.println(" Arrays cannot be added because their dimensions are different....");
	}	
		
		
	}

}
