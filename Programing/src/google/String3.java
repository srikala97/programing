package google;

import java.util.ArrayList;
import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner(System.in);
	System.out.println("Enter String ...");
	String s=scan.next();
	String s1="aeiou";
	int count=0;
	ArrayList<Character> vowels= new ArrayList<Character>();
	for(int i=0;i<s1.length();i++)
	{
	vowels.add(s1.charAt(i));
	}
	for(int i=0;i<s.length();i++)
	{
		if(vowels.contains(s.charAt(i)))
		{
			count++;
		}
	}
		
	System.out.println(count);
	}

}
