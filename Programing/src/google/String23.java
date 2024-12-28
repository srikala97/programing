package google;

import java.util.Scanner;

public class String23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence...");
        String s1=scan.nextLine();
        System.out.println("Enter the word..");
        String s2=scan.next();
        /*if(s1.contains(s2))
        {
        	System.out.println("Given word is present");
        }
        else
        {
        	System.out.println("Given word is not present..");
        }
        */
        int count=0;
		String[] sarry=s1.split(" ");
		for(int i=0;i<sarry.length-1;i++)
		{
			if(s1.equals(sarry[i]))
			{
				count++;
				break;
			}
			
		}
        
        if(count>0)
        {
        	System.out.println("Given word is present");
        }
        else
        {
        	System.out.println("Given word is not present..");
        }
        
		
		
	}

}
