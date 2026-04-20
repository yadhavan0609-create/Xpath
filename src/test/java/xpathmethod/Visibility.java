package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Visibility {
	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://the-internet.herokuapp.com/checkboxes"); // using the facebook  and test webpage, we are going to test the enabled and display and isselected method
		 
		 WebElement login = driver.findElement(By.xpath("//input[@type=\"checkbox\"] [1]"));
		 
		 System.out.println(login.isDisplayed());
		 
		 System.out.println(login.isEnabled());
		 System.out.println(login.isSelected());
		 
		 WebElement logins = driver.findElement(By.xpath("//input[@type=\"checkbox\"] [2]"));
 System.out.println(logins.isDisplayed());
		 
		 System.out.println(logins.isEnabled());
		 System.out.println(logins.isSelected());
		 
		 
	}
	

}
