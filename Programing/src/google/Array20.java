package google;

import java.util.Scanner;

public class Array20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println(" enter the size of charcter ...");
       int size=scan.nextInt();
       System.out.println(" enter the "+size+ " of character elements....");
       char[] carr=new char[size];
       for(int i=0;i<carr.length;i++)
       {
    	   carr[i]=scan.next().charAt(0);
       }
		
		for(char k: carr)
		{
			System.out.print(k);
		}
		
		
		
	}

}
