package google;

import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number of rows...");
     int row=scan.nextInt();
     System.out.println(" enter the number of columns...");
     int columns=scan.nextInt();
     int[][] arr=new int[row][columns];
     for(int i=0;i<row;i++)
     {
    	 for(int j=0;j<columns;j++)
    	 {
    		 System.out.println("Enter the number of elemnts "+i+" "+j);
    		 arr[i][j]=scan.nextInt();
    	 }
     }
     for(int i=0;i<row;i++)
     {
    	 for(int j=0;j<columns;j++)
    	 {
    		 System.out.print(arr[i][j]*arr[i][j]+" ");
    	 }
    	 System.out.println();
     }
     
     
     
		
		
		
		
	}

}
