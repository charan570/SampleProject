package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWishList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement hello= driver.findElement(By.id("nav-link-accountList")); // we have to select the square box 
		WebElement action= driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span")); // this will go to Your wish list 
		
		Actions mouse=new Actions(driver);
		mouse.moveToElement(hello).build().perform();
		mouse.moveToElement(action).click().build().perform();
	
		
	
	}
	
}
