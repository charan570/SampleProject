package charan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowByArrayList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	// we are taking Xpath of Recruiters from Naukri
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
			Set<String> windows= driver.getWindowHandles();
			// multiple windows ID's
			List<String> tab =new ArrayList(windows);
			
			driver.switchTo().window(tab.get(0));
			System.out.println(driver.getTitle());
			
			driver.close();
			driver.switchTo().window(tab.get(1));
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(tab.get(2));
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(tab.get(3));
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(tab.get(4));
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("Selenium");

		driver.close();
			
		
		
		
	}

}
