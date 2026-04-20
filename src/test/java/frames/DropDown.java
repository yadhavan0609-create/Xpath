package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
       
       WebElement MultiDropDown = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
       
       //Creating object for select
       
       Select s = new Select(MultiDropDown);
      //System.out.println(s.isMultiple());
       //or use Boolean to print
       boolean b = s.isMultiple();
      System.out.println(b);
       s.selectByIndex(0);
       s.selectByValue("saab");
      s.selectByVisibleText("Audi");
      
    List<WebElement>  d= s.getAllSelectedOptions();
    
    for(WebElement x: d) {
    	
    	System.out.println(x.getText());
    }
    
 System.out.println(s.getFirstSelectedOption());
 
 s.deselectAll();
 
       
	}

}
