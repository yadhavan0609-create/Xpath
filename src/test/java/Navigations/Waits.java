package Navigations;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.facebook.com/");
		
			Wait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(30))
					.ignoring(NoSuchElementException.class);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		
		//email.sendKeys("leo");
		
		
		driver.findElement(By.name("email")).sendKeys("leo");
		
		driver.findElement(By.name("pass")).sendKeys("leo");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		
	}

}
