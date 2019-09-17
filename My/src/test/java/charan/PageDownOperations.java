package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownOperations {
	
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Actions action= new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			//driver.findElement(By.linkText("Create Page"));
			driver.findElement(By.linkText("Create Page")).click();
			
} 
}
