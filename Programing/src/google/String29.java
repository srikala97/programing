package google;

import java.util.Scanner;

public class String29 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println(" Enter the sentence...");
    String s1=scan.nextLine();
    String[] sarr=s1.split(" ");
    //System.out.println(sarr[sarr.length-1]);
   // if(sarr.length>=2)
   // {
    	System.out.println(" Last two words..."+sarr[sarr.length-2]+" "+sarr[sarr.length-1]);
   // }
   // else
   // {
    	//System.out.println(" Sentence does not contains enough words...");
   // }
		
	}

}
