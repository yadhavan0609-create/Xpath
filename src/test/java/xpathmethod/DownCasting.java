package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownCasting {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement search= driver.findElement(By.xpath("(//input[@class=\"nw1UBF v1zwn25\"]) [1]"));
		js.executeScript("arguments[0].setAttribute('value','shirt')",search);
		
		//Object h = js.executeScript("arguments[0].Click", search);
		//System.out.println(h);
		
		//scroll down and scroll up
		
		
	}

}
