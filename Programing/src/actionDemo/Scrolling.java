package actionDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		scroll.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=100");
		//document.querySelector(".tableFixHead").scrollTop=100

		//Adding of the 4th column values from the table
		List<WebElement> count=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<count.size();i++)
		{
			sum=sum+Integer.parseInt(count.get(i).getText());
		}
		int total=0;
		//System.out.println(sum);
		
		total=total+Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum,total);
	}

}
