package charan;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearch{
	
 public static void main(String[]args)
 
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

	 ChromeDriver driver = new ChromeDriver();

	 driver.manage().window().maximize();

	 driver.manage().deleteAllCookies();
     driver.get("https://in.yahoo.com/");
     driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
     driver.findElement(By.id("uh-search-button")).click();
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
   
     
 }
 

}
