package charan;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
 public static void main(String[]args)
 
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

	 ChromeDriver driver = new ChromeDriver();

	 driver.manage().window().maximize();

	 driver.manage().deleteAllCookies();
     driver.get("https://www.amazon.in/");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harrypotter");
     driver.findElement(By.className("nav-input")).click();
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     driver.close();
     
 }
 

}
