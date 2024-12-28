package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Static {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with SELECT Tag//
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.print(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.print(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.print(dropdown.getFirstSelectedOption().getText());

		
	}

}
