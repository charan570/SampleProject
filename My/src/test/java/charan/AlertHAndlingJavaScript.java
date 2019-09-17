package charan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHAndlingJavaScript {
	
	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		// here we are handling the javascript box, without entering username and password if we click login then 
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
	}

}
