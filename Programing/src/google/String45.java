package google;

import java.util.Scanner;

public class String45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println(" Enter a sentence...");
       String s1=scan.nextLine();
       String[] s2=s1.split(" ");
       String senetence="";
       for(int i=s2.length-1;i>=0;i--)
       {
    	   String word=s2[i];
    	  String words="";
    	   for(int j=0;j<=word.length()-1;j++)
    	   {
    		    words=words+word.charAt(j);
    	   }
    		System.out.print(senetence+words+" ");   
       }
       
		
		
		
		
	}

}
