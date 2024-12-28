package object;

public class Program27 extends Thread {
	
	
	public Program27(String tname)
	{
		super(tname);
	}
	
	@Override
	public void run()
	{
		System.out.println("Hello...." +Thread.currentThread().getName());
	}

}
