package scanner;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args)
	{

Scanner scan=new Scanner(System.in);
System.out.println("Enter string data..");
String c=scan.next();
System.out.println("Enter boolean data...");
boolean d=scan.nextBoolean();
System.out.println("Enter character data... ");
char ch=scan.next().charAt(0);
System.out.println("Enter data are.....");
System.out.println(c);
System.out.println(d);
System.out.println(ch);
		
}		
}
