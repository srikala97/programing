package sdet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Logins {
	

	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.freecrm.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("srikalach@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Srikalas");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		//Verify error Message...
		WebElement errorMessage=driver.findElement(By.xpath("//p[normalize-space()='Invalid login']"));
		String actualErrorMessage=errorMessage.getText();
		String expectedErrorMessage="Invalid login";
		if(actualErrorMessage.equals(expectedErrorMessage))
		{
			System.out.println("Invalid credentials.... ");
		}
		else
		{
			System.out.println("Successfully Login....");

		}
		
		
		//Close the Browser
		driver.quit();
			
		
	}

}
