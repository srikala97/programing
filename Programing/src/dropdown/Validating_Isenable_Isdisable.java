package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Validating_Isenable_Isdisable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		

	}

}
