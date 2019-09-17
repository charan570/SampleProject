package charan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHAndlingComplition {

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
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewBR")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.id("txtbName")).sendKeys("QedgeTech");;
		Thread.sleep(3000);
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		Thread.sleep(3000);
		driver.findElement(By.id("txtAdd2")).sendKeys("maitrivanam");
		driver.findElement(By.id("btn_insert")).click();
		Alert al= driver.switchTo().alert();
		String msg =al.getText();
		al.accept();
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Pass");
			
		}
		else
			if(msg.contains("already exists"))
		{
			 System.out.println("Fail");
		}
		else
			if(msg.contains("please fill"))
			{
				System.out.println("Warning");
		}
		
		
		
		
		
				
	}



}



