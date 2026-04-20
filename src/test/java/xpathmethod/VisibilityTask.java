package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityTask {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement c1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		
		
		WebElement c2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
		System.out.println(c1.isDisplayed());
		System.out.println(c1.isEnabled());
		System.out.println(c1.isSelected());
		
		System.out.println("c2="+c2.isSelected());
		
	
		
	}

}
