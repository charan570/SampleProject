package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheInfoInSearch {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("h");
        Thread.sleep(2000);
   List<WebElement> list= driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
   
   for( WebElement Items:list)
   {
 	  System.out.println(Items.getText());
   }

		
	}
}
