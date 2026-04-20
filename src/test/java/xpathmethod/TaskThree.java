package xpathmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		// WebElement name = driver.findElement(By.id("userName"));

	   
	       // JavascriptExecutor js = (JavascriptExecutor) driver;

	      
	       // js.executeScript("arguments[0].value='Yadhavan';", name);

	       // String value = name.getAttribute("value");

	     
	        //System.out.println(value);


        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement submitBtn = driver.findElement(By.id("submit"));

   
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        Thread.sleep(2000); 

        WebElement firstName = driver.findElement(By.id("firstName"));

      
        js.executeScript("arguments[0].scrollIntoView(true);", firstName);

        Thread.sleep(2000);
		
		
}

}
