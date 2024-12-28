
//Write a prigram on constructor chaining...

package javaPrograms;

public class Constructor2 {

	int a,b,c;
	public Constructor2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public Constructor2(int a,int b,int c)
	{
		this(a,b);
		this.c=c;
	}

	public void Dimensions()
	{
		System.out.println("Length:"+a);
		System.out.println("Breadth:"+b);
		System.out.println("Height:"+c);
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Main Starts...");
		Constructor2 c1=new Constructor2(2,3);
		Constructor2 c2=new Constructor2(2,3,4);
		c1.Dimensions();
		c2.Dimensions();
			
		
	}
	
}
