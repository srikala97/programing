package google;

import java.util.Scanner;

public class String21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the string1...");
       String s1=scan.next();
      String s2="";
      for(int i=(s1.length()-1);i<=0;i--)
      {
    	  s2=s2+s1.charAt(i);
      }
       if(s1.equalsIgnoreCase(s2))
       {
    	   System.out.println("String is palindrome...");
       }
       else
       {
    	   System.out.println("String is not palindrome...");
       }
		
		
		
		
	}

}
