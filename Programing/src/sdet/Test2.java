package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Test2 {	
WebDriver driver;
@BeforeMethod
 @Parameters("url")
public void SetUp(String url)
{
if(url.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
driver=new ChromeDriver(options);
}
else if(url.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.geckodriver.driver","C:\\Users\\srika\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe" );
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
driver = new FirefoxDriver();
}
// driver.get("https://www.freecrm.com/");
}
@Test(priority=1)
 public void Login()
 {
driver.get("https://www.freecrm.com/");
driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("srikalach@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Srikalas");
driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//Verify login
WebElement errorMessage = driver.findElement(By.xpath("//p[contains(text(),'Invalid login')]"));
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
 }
@Test(priority=2)
public void Signup()
{
driver.get("https://www.freecrm.com/");
driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srikala@gmail.com");
WebElement errorMessage=driver.findElement(By.xpath("//ul[@class='list']"));
String actualErrorMessage=errorMessage.getText();
String expectedErrorMessage="Please accept the terms to continue";
if(actualErrorMessage.equals(expectedErrorMessage))
{
System.out.println("success.... ");
}
else
{
System.out.println("Failure...");
}	
}
@AfterMethod
public void tearDown()
{
driver.quit();
}
}
