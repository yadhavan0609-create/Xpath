package xpathmethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/s?k=join+amazon+prime&adgrpid=1327112148528381&hvadid=82944775541359&hvbmt=bb&hvdev=c&hvlocphy=158564&hvnetw=o&hvqmt=b&hvtargid=kwd-82945393014646%3Aloc-90&hydadcr=5626_2377281&mcid=3861a9d242543041b997efa1f39279d3&msclkid=986d44c23ffb127c17f72d1bfc554b74&tag=msndeskstdin-21&ref=pd_sl_9ntprzamt3_b");
	driver.manage().window().maximize();
	
	//Thread.sleep(100);
	
	String T = driver.getTitle();
	
	System.out.println(T);
	
	String C= driver.getCurrentUrl();
	
	System.out.println(C);
	
	WebElement login = driver.findElement(By.xpath("//h2[text()='Related searches']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)", login);
	
	//Thread.sleep(1000);
	
	WebElement top = driver.findElement(By.xpath("//h2[text()='Results']"));
	
	js.executeScript("arguments[0].scrollIntoView(false)", top);
	
	//WebElement S = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
	
	//js.executeScript("arguments[0].setAttribute('value','Bottle')", S);
	
//	ScreenShots
	
	// highlight the Element
	
	js.executeScript("arguments[0].setAttribute('style','Background: yellow;border:2px solid red')", top);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
File src= ts.getScreenshotAs(OutputType.FILE);

File target = new File("C:\\Users\\yadhavan'\\eclipse-workspace\\xpathmethod\\target.take.png");
FileUtils.copyDirectory(src, target);
	
}

}
