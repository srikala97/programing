package google;

import java.util.Scanner;

public class String42 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println(" Enter a string...");
     String s1=scan.next();
     String s2="";
     for(int i=0;i<=s1.length()-1;i++)
     {
    	 char c=s1.charAt(i);
    	 if(!Character.isDigit(c))
    	 {
    		 s2=s2+c;
    	 }
     }
		
	System.out.println(s2);	
		
	}

}
