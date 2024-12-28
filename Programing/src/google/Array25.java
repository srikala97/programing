package google;

import java.util.Scanner;

public class Array25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println(" enter the firstarryRow size..");
       int firstRow=scan.nextInt();
       System.out.println(" enter the firsarry Column size..");
       int firstColumn=scan.nextInt();
       int[][] arr1=new int[firstRow][firstColumn];
 
       for(int i=0;i<arr1.length;i++)
       {
    	   for(int j=0;j<arr1.length;j++)
    	   {
    		   System.out.println("enter the "+i+" "+j);
    		   arr1[i][j]=scan.nextInt();
    	   }
       }
       System.out.println(" enter the second array row size..");
       int secondRow=scan.nextInt();
       System.out.println(" enter the secondColumn size..");
       int secondColumn=scan.nextInt();
       int[][] arr2=new int[secondRow][secondColumn];
       for(int i=0;i<arr2.length;i++)
       {
    	   for(int j=0;j<arr2.length;j++)
    	   {
    		   System.out.println("enter the "+i+" "+j);
    		   arr2[i][j]=scan.nextInt();
    	   }
       }
       System.out.println(" First array elements...");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
       System.out.println(" Second array elements...");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
       
		
	}

}
