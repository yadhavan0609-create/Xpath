package Navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.findElement(By.name("email")).sendKeys("leo");
		
		driver.findElement(By.name("pass")).sendKeys("leo");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
