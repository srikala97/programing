package google;

import java.util.Scanner;

public class String16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        System.out.println(" Enter string ...");	
        String s1=scan.next();
        System.out.println(" Enter the character....");
        int count=0;
       char ch1=scan.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==ch2)
			{
				count++;
				//System.out.println("given character is present...");
			}
		}
		if(count>0)
		{
			System.out.println("Given charcter is present..");
		}
		else
		{
			System.out.println("Given charcter is not present...");
		}
			
	}

}
