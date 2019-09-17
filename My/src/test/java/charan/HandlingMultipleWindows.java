package charan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	// we are taking Xpath of Recruiters from Naukri
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
		Set<String> windows= driver.getWindowHandles();
		for(String child:windows)
			
		{
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			if(!driver.getTitle().contains("HR Manager"))
			{
				driver.close();
			}
			
			
		}

		
		
		
		
		
		
		
}
}