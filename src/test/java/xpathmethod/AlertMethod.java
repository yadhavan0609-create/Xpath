package xpathmethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
	Thread.sleep(1000); 
	
	driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
	Thread.sleep(1000); 
	
	 Alert a = driver.switchTo().alert(); // first need to switch the alert
	 Thread.sleep(1000); // it slows the alert time
	 
	 a.sendKeys("I am BatMan");
	// a.accept();
	
	//a.dismiss();
	
}
}
