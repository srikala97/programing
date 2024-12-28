package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
		public void Demo()
		{
			System.out.println("Second TestNG program....");
		}
	@BeforeTest
	public void Demo4()
	{
		System.out.println("Test2 program....before Test......");
	}
	
	@BeforeMethod
	public void Demo1()
	{
		System.out.println("Test2 program....before method......");
		
	}
	@AfterMethod
	public void Demo3()
	{
		System.out.println("Test2 program....After method......");
	}
	@Test(groups= {"Smoke"})
	public void Demo2()
	{
		System.out.println("Test2 program....");
	}
	
	
	
}
