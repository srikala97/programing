package google;

import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the string...");
       String s1=scan.next();
       String temp="";
       int j=0;
       for(int i=0;i<s1.length()-1;i++)
       {
    	   char ch=s1.charAt(i);
    	   if(Character.isDigit(ch))
    	   {
    		   temp=temp+ch;
    		   int k=Integer.parseInt(temp);
    		   j=j+k;
    		   
    	 
    	   }
       }
       
		
   
		
		
		
	}

}
