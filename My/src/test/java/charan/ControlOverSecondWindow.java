package charan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlOverSecondWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		String parent =driver.getWindowHandle();
		// opening hdfc im getting an pop up window to close that i used xpath of that
				driver.findElement(By.xpath("//*[@id='parentdiv']/img")).click();
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> Newwind= driver.getWindowHandles();

		for(String child:Newwind)
		{
		
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		}
		}
	}
}
