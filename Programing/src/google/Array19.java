package google;

import java.util.Scanner;

public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println(" enter the size...");
     int size=scan.nextInt();
     System.out.println(" enter the "+size +" elements...");
	 int[] a1=new int[size];
	 for(int i=0;i<a1.length;i++)
	 {
		 a1[i]=scan.nextInt();
	 }
	for(int i=0;i<a1.length;i++)
	{
		System.out.print(a1[i]);
	}
		
		
	}

}
