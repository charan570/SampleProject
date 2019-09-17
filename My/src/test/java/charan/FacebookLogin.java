package charan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[]args)
 
	 {
		String Email= "charan.moturi@gmail.com";
		String password= "pragnyab@570";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

		 ChromeDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();

		 driver.manage().deleteAllCookies();
	     driver.get("https://www.facebook.com/");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.findElement(By.id("email")).sendKeys(Email);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.findElement(By.id("pass")).sendKeys(password);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.findElement(By.id("u_0_2")).click();
	     
	        
	   	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     
}
}