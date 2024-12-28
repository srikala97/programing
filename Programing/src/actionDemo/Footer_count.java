package actionDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Footer_count {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//2. Limiting webdriver scope----
		WebElement footerSection=driver.findElement(By.id("gf-BIG"));
		//System.out.println(footerSection.findElements(By.tagName("a")).size());
		//3. Again limiting footerSection scope---
		WebElement columndriver=footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//Click on each link in the column and check if the pages are opening---
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerSection.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
		}
		Thread.sleep(5000);
		//4.Get each page title from each window tab---
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		     System.out.println(driver.getTitle());
		}
		
		

	}

}
