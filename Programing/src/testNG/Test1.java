package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void Demo()
	{
		System.out.println("First TestNG program....");
	}
	@BeforeTest
	public void beforeTestSetup()
	{
		System.out.println("Before Test1...");
	}
	@BeforeClass
	public void BeforeclassSetup1()
	{
		System.out.println("Beforeclass1...");
	}
	
}
