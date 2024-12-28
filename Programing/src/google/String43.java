package google;

import java.util.Scanner;

public class String43 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println(" Enter a senetence...");
    String s1=scan.nextLine();
    System.out.println(" Enter a string...");
    String s2=scan.next();
    String[] sarr=s1.split(" ");
    int count=0;
    for(int i=0;i<=sarr.length-1;i++)
    {
    	if(s2.equals(sarr[i]))
    	{
    	  count++;	
    	  
    	}
    	
    }
	if(count>0)
	{
		System.out.println(" Given word is present...");
	}
	else
	{
		System.out.println(" Given word is not present...");
	}
		
		
		
	}

}
