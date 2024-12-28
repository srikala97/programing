package google;

import java.util.Scanner;

public class String40 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println(" Enter a string...");
     String s1=scan.next();
     String s2="aeiou";
     int count=0;
     for(int i=0;i<=s2.length()-1;i++)
     {
         

    	 char c1=s2.charAt(i);
    	 for(int j=0;j<=s1.length()-1;j++)
    	 {
    		 char c2=s1.charAt(j);
    		 if(c1==c2)
    		 {
    			 count++;
    		 }
    		 
    		 
    	 }
    	 System.out.println(c1+"count is "+count);
     }
     
    // System.out.println(c1+"count is "+count);
		
		
		
	}

}
