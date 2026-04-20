package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		
String next = driver.findElement(By.tagName("body")).getText();

System.out.println(next);

driver.switchTo().parentFrame();
driver.switchTo().defaultContent();

//driver.switchTo().frame("frame-top");
//driver.switchTo().frame("frame-bottom");

//driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));

//String text = driver.findElement(By.tagName("noframes")).getText();
//System.out.println(text);
		
		
		
		
	}

}
