package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement sl=driver.findElement(By.xpath("//*[@id='slider']"));
		Actions slider =new Actions(driver);
		slider.clickAndHold(sl).moveByOffset(200,0).release(sl).build().perform();
		Thread.sleep(2000);
		slider.clickAndHold(sl).moveByOffset(-200,0).release(sl).build().perform();


}
}