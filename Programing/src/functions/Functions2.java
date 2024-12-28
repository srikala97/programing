package functions;

public class Functions2 {

	static int[] addnumbers(int a ,int b)
	{
		int[] results=new int[2];
		results[0]=a+b;
		results[1]=a-b;
		
		return results;
		
	}
	
	public static void main(String [] args)

	{
		int[] results=addnumbers(20,20);
		System.out.println(results[0]);
		System.out.println(results[1]);
		
	}
	
	
	
	
	
	
}
