package google;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size...");
       int size=scan.nextInt();
       System.out.println("enter the char elements....");
       char[] elements=new char[size];
       for(int i=0;i<=elements.length-1;i++)
       {
    	   elements[i]=scan.next().charAt(0);
       }
       String s1="";
       for(int i=0;i<=elements.length-1;i++)
       {
    	   
    	   s1=s1+elements[i];
       }
		
		
		System.out.println(s1);
		
		
		
	}

}
