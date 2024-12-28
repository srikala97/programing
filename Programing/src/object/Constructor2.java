package object;

public class Constructor2 {

	int r;
	static double pi=3.14;
	public Constructor2()
	{
		this.r=5;
	}
	
	public void getarea()
	{
		double area=pi*this.r*this.r;
		System.out.println(" Area of circel..." +area);
	}
	
	
	public static void main(String args[])
	{
		Constructor2 c1=new Constructor2();
		c1.getarea();
		
		
	}
	
	
	
}
