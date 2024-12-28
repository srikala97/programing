package actionDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calenadarevents {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		//April 9
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		//List<WebElement> count=driver.findElements(By.cssSelector(".flatpickr-day "));
		
		
	}

}
