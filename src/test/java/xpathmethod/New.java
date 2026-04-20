package xpathmethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
public static void main(String[] args) throws IOException {
	
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 
	 WebElement h = driver.findElement(By.xpath("//div[text()='Brands in Spotlight']"));
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
		js.executeScript("arguments[0].scrollIntoView(false)", h);
	 
	 
	 
		js.executeScript("arguments[0].setAttribute('style','Background: green;border:2px solid black')", h);
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File ("C:\\Users\\yadhavan'\\eclipse-workspace\\xpathmethod\\target.homepage.png");
		FileUtils.copyDirectory(src, target);
		
		
		
		
		
		
		
		
}
}
