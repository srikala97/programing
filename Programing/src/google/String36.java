package google;

import java.util.Scanner;

public class String36 {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println(" Enter a string...");
       String s1=scan.next();
       String s2="";
       for(int i=s1.length()-1;i>=0;i--)
       {
    	   char c=s1.charAt(i);
    	   s2=s2+c;
       }
		System.out.println(" Reverse of a string..."+s2);
		
		
	}

}
