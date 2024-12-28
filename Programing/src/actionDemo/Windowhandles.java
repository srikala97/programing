package actionDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();  //ParentID, ChildID
		
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String Parentid=it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//System.out.println(emailId);
		driver.switchTo().window(Parentid);
		driver.findElement(By.id("username")).sendKeys("Srikala");
	}

}
