package xpathmethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

		 public static void main(String[] args) {

		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		      
		        driver.get("https://the-internet.herokuapp.com/windows");

		       
		        driver.manage().window().maximize();

		       
		        String parent = driver.getWindowHandle();
		        System.out.println("Parent ID: " + parent);

		      
		        driver.findElement(By.linkText("Click Here")).click();

		      
		        Set<String> windows = driver.getWindowHandles();

		      
		        for (String w : windows) {
		            if (!w.equals(parent)) {
		                driver.switchTo().window(w);

		            
		                String text = driver.findElement(By.tagName("h3")).getText();
		                System.out.println("Child Text: " + text);
		            }
		        }

		      
		        driver.switchTo().window(parent);

		      
		        String title = driver.getTitle();
		        System.out.println("Parent Title: " + title);

		        if (title.equals("The Internet")) {
		            System.out.println("Title Verified ✅");
		        } else {
		            System.out.println("Title Not Verified ❌");
		        }

		    }
		}


