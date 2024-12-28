
// How to take a screenshot on the webpage
package actionDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       ChromeOptions options=new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       WebDriver driver=new ChromeDriver(options);
       driver.manage().window().maximize();
       driver.get("https://google.com");
       driver.getTitle();
       
       // Taking of Screenshot
       //1. By using File class we can take screenshot
       //2. Output of the screenshot will always be a file format;
       //3. By FileUtils() we can copy file and place in the any local path ;
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src,new File("C:\\Users\\srika\\screenshot.png"));
       
       
       
	}

}
