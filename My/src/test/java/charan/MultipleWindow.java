package charan;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		// main windows
		String parent =driver.getWindowHandle();
		// opening hdfc im getting an pop up window to close that i used xpath of that
		driver.findElement(By.xpath("//*[@id='parentdiv']/img")).click();
		// this id is about Login
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> Newwind= driver.getWindowHandles();

		for(String child:Newwind)
		{
			// 1. this will print all the windows 
			/*System.out.println(child);*/
			// OR
			// 2. If we want to focus on one by one windows then instaed of above SOP we have to write this
			driver.switchTo().window(child);
			//OR
			// if we want to close all the windows except 1 i.e, what we required then 
			if(!driver.getTitle().equals("Continue to NetBanking"))
			{
				driver.close();
			}
			
			// this comments will apply to 1,2 s
			/*// if we want to get the title
			System.out.println(driver.getTitle());
			// for closing the window
			driver.close();*/
		}

	}

}
