package functions;

public class Functions7 {

	
	boolean Even(int a)
	{
		return a%2==0;
	}
	
	public static void main(String[] args)
	{
		Functions7 fo1=new Functions7();
		//fo1.Even(7);
		boolean results=fo1.Even(8);
		System.out.println(results);
		
	}
	
	
}
