package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement top = driver.findElement(By.xpath("An iFrame containing the TinyMCE WYSIWYG Editor"));
		
		System.out.println(top.isDisplayed());
		
		driver.switchTo().frame("//span[contains(text(),' this month.')]");
		
		WebElement c  = driver.findElement(By.xpath("//div[@aria-label=\"Close\"]"));
		c.click();
		
		
	WebElement console = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
	
	console.sendKeys("Selenium Frame Handling Practice");
		
	
	driver.switchTo().defaultContent();
		
		
	}

}
