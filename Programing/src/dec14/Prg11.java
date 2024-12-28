package dec14;

import java.util.Scanner;

public class Prg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner scan=new Scanner(System.in);
	   System.out.println(" Enter the string....");
	   String s1=scan.nextLine().toLowerCase();
	   int acount=0, ecount=0, icount=0,ocount=0, ucount=0;
	   
	   for(int i=0;i<s1.length();i++)
	   {
		   char c=s1.charAt(i);
		   if(c=='a')
		   {
			   acount++;
		   }
		   else if(c=='e')
		   {
			   ecount++;
		   }
		   else if(c=='i')
		   {
			   icount++;
			   
		   }
		   else if(c=='o')
		   {
			   ocount++;
		   }
		   else if(c=='u')
		   {
			   ucount++;
		   }
		   
	   }
		System.out.println(" Number of count for a : " +acount++);
		System.out.println(" Number of count for e : " +ecount++);
		System.out.println(" Number of count for i : " +icount++);
		System.out.println(" Number of count for o : " +ocount++);
		System.out.println(" Number of count for u : " +ucount++);
	}

}
