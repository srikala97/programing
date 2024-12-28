
//Write a program on constrcutor with arguments....

package javaPrograms;

public class Constructor1 {
	
	public Constructor1(int a , int b)
	{
		int c=a+b;
		System.out.println(c);
	}

public static void main(String[] args)
{
	System.out.println("Main starts.....");
	
	Constructor1 c1=new Constructor1(2,3);
	Constructor1 c2=new Constructor1(4,5);
	System.out.println("Main ends...");
	
}
	
	
	
}
