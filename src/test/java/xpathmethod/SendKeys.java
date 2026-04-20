package xpathmethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/text-box");
	
	
Actions a = new Actions(driver);

WebElement fullName = driver.findElement(By.id("userName"));
a.click(fullName).sendKeys("Yadhavan").perform();



	




}}
