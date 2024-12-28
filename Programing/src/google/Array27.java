package google;

import java.util.Scanner;

public class Array27 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println(" enter the 1st array of number of rows size...");
    int arr1Row=scan.nextInt();
    System.out.println(" enter the 1st array of number of columns size...");
	int arr1Column=scan.nextInt();
	int[][] arr1=new int[arr1Row][arr1Column];
	for(int i=0;i<arr1Row;i++)
	{
		for(int j=0;j<arr1Column;j++)
		{
			System.out.println(" Enter the "+i+" "+j);
			arr1[i][j]=scan.nextInt();
		}
	}
	System.out.println(" enter the 2nd array of number of rows size...");
    int arr2Row=scan.nextInt();
    System.out.println(" enter the 2nd array of number of columns size...");
	int arr2Column=scan.nextInt();		
	int[][] arr2=new int[arr2Row][arr2Column];	
	for(int i=0;i<arr2Row;i++)
	{
		for(int j=0;j<arr2Column;j++)
		{
			System.out.println(" Enter the "+i+" "+j);
			arr2[i][j]=scan.nextInt();
		}
	}
	System.out.println(" 1st array elements are....");
	for(int i=0;i<arr1Row;i++)
	{
		for(int j=0;j<arr1Column;j++)
		{
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(" 2nd array elements are....");
	for(int i=0;i<arr2Row;i++)
	{
		for(int j=0;j<arr2Column;j++)
		{
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
		
	}

}
