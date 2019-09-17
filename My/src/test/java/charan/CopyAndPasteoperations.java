package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPasteoperations {
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.google.com/advanced_search");
			driver.findElement(By.id("xX4UFf")).sendKeys("testing");
			driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
			driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
			
			
			driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");

			
			
			
			
			
			
}


}
