package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.google.com/");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions right= new Actions(driver);
		
		/*// if we want to open the Gmail directly then we have to use this command
		
		right.contextClick(gmail).sendKeys("w").build().perform();*/
		
		// if we want to open gmail in incognito window tab, by keyboard like then we have to check the Arrow down
		 //position where it is located then that many time we have to click arrow down
		
		right.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
		
	}
	

}
