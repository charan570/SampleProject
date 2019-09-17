package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContinuesMouseOperation {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement signIn= driver.findElement(By.id("nav-link-shopall")); // we have to select the square box of shop all 
		WebElement apv= driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span")); // this will go to  amazon prime video 
		WebElement tvs= driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[4]/a[3]/span[1]"));// this will go to tv shows
		
		Actions chain=new Actions(driver);
		chain.moveToElement(signIn).moveToElement(apv).pause(2000).moveToElement(tvs).click().build().perform();
}
}
