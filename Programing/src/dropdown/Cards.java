package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cards {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#//");
		List<WebElement> names=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i).getText();
			
		if(name.contains("Cucumber"))
				{
			//Click to ADD TO CART
			      driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
				}
		}
	}

}
