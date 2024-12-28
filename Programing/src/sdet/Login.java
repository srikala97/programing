package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;		
	@BeforeTest	
	@Parameters("url")
	public void SetUp(String url)
	{
		if(url.equalsIgnoreCase("url"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
	
	//driver.get("https://www.freecrm.com");
		
	}
	
	@Test
	public void LoginButton(String urlname)
	{
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("srikalac@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Srikala");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	
	@Test
	
		public void Message()
		{
			System.out.println(driver.findElement(By.cssSelector(".ui.negative.message")).getText());
		}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}



