package xpathmethod;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandles {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	WebElement s = driver.findElement(By.name("q"));
	
	s.sendKeys("sumsung mobiles");
	s.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("(//li[@class=\"DTBslk\"])[1]")).click();
	

	//driver.findElement(By.xpath("(//li[text() ='256 GB ROM']) [1]")).click();
	
	String pwin= driver.getWindowHandle();
	Set<String> allwin = driver.getWindowHandles();
	
	
	for(String x: allwin) {
		if(!pwin.equals(x)) {
			driver.switchTo().window(x);
		}
	}
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement buy = driver.findElement(By.xpath("//div[text()='Buy now']"));
	
	js.executeScript("arguments[0].scrollIntoView(true);", buy);
	
	buy.click();
	
}
}
