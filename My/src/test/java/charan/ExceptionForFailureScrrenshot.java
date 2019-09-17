package charan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionForFailureScrrenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	try
	{ 
		driver.findElement(By.id("searchDropdownBo"));
	}
	catch(Exception e)
	{
		
	}
	// takes scrren shot an website 
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	File srcFile =ts.getScreenshotAs(OutputType.FILE);
	
	// to copy the file to destination folder
	
	FileUtils.copyFile(srcFile,new File("C:\\Users\\Tippu\\Desktop\\Assignments\\scren.png"));
	
	}

}
