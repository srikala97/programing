
//write a program on comparing two strings.....
package collections;

import java.util.Scanner;

public class Twostrings {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string....");
		String s1=scan.next();
		System.out.println("Enter string....");
		String s2=scan.next();
		//int s2=scan.nextInt();
		if(s1.equals(s2))
		{
			System.out.println("Both strings are similiar....");
		}
		else
		{
			System.out.println("Both strings are not similiar....");
		}
	//1.The above program is failed due to Non primitive data type.(s1==s2);
	//2. Non primitive data type is used by equals() method...
	}
	

}
