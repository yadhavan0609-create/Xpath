package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
       
       WebElement MultiDropDown = driver.findElement(By.tagName("select"));
       
       //Creating object for select
       
       Select s = new Select(MultiDropDown);
       
       List<WebElement> all= s.getAllSelectedOptions();
       
       for(WebElement x : all) {
    	   System.out.println(x.getText());
       }
       
       
       
       
}

}
