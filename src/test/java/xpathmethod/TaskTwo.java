package xpathmethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	
	Alert ar = driver.switchTo().alert();
	
	ar.accept();
	ar.sendKeys("Go on");
	Thread.sleep(1000);
	
	String result = driver.findElement(By.id("result")).getText();


    
   System.out.println(result);
		
		
	}

}
