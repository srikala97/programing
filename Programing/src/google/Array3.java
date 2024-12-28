package google;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the size ...");
       int size=scan.nextInt();
       System.out.println("Enter "+size+" elements");
       char[] elements=new char[size];
       for(int i=0;i<=elements.length-1;i++)
       {
    	   elements[i]=scan.next().charAt(i); 
       }
       
		for(char c:elements)
		{
			System.out.println(c);
		}
		
		
		
		
	}

}
