package scanner;
import java.util.Scanner;
public class Program3 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1st string...");
	String s1=scan.next();
	System.out.println("Enter 2nd String...");
	String s2=scan.next();
	if(s1.equals(s2))
	{
		System.out.println("Both strings are similar...");
	}
	
	else
	{
		System.out.println("Both strings are not similar....");
	}	
		
	}

}
