package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

	@BeforeClass
	public void blackgrapes()
	{
		System.out.println("Black Grapes.....");	
	}
	
	@BeforeSuite
	public void Mango()
	{
		System.out.println("mango......");
	}
	@BeforeTest
	public void Aemo()
	{
		System.out.println("Orange......");
	}
	@Test(groups= {"Smoke"})
	public void Grapes()
	{
		System.out.println("grapes......");
	}
	@AfterTest
	public void Apple()
	{
		System.out.println("Apple......");
	}
	
}
