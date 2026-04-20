package Navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Show {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		
		WebElement showdowroot = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement root = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('input')", showdowroot);
		
		
		root.sendKeys("looo");
		
	}

}
