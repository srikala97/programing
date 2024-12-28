package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			System.out.println("Is Disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");


		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
       // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
       // driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		

	}

}
