package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ResizeOperation {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		                                      // we have to copy the entire Frame Xpath total square
		WebElement rs=driver.findElement(By.xpath("//*[@id='resizable']"));
		Actions resize =new Actions(driver);
		resize.clickAndHold(rs).moveByOffset(400,150).release(rs).build().perform();
		
		
	}
}
