package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BraanchcreationPrimus {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
     // creating the branch after login
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();;
		Thread.sleep(3000);
		driver.findElement(By.id("txtbName"));
		Thread.sleep(3000);
		driver.findElement(By.id("txtAdd1"));
		Thread.sleep(3000);
		driver.findElement(By.id("txtAdd2"));
		
		
		
		
				
	}



}
