package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		WebElement tables = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
		// System.out.println(tables.getText());
		
	    List<WebElement> rows = tables.findElements(By.tagName("tr"));
	    
	    // to locate the rows by one by one
	    
	   for(int i=0; i<rows.size();i++) {
		   
		   WebElement row= rows.get(i);
		   
		   
		   List<WebElement> tdata = row.findElements(By.tagName("th"));
		   
		   for(int j=0;j<tdata.size();j++) {
			   
			   WebElement data = tdata.get(j);
			   System.out.println(data.getText());
			   
		   }
	   }		
		
		
		
		
		
	}

}
