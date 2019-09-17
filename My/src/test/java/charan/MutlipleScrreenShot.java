package charan;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleScrreenShot {
	

		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
				
			{
				String linkName= links.get(i).getText();
				links.get(i).click();
						
				TakesScreenshot ts =(TakesScreenshot)driver;
				File srcFile =ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,new File("C:\\Users\\Tippu\\Desktop\\Assignments\\hui.png"));
				driver.navigate().back();
				
			// if we are going back then in for loop the size will become Zero,  so we need to add everytime the size of links
				links=driver.findElements(By.tagName("a"));
			
			
			}
			
			
			

		}

	}

