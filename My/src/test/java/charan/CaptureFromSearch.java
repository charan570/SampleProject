package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureFromSearch {
	

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("S");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));
		for(WebElement items:list)
			System.out.println(items.getText());

}
}