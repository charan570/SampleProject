package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureOnelink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement header =  driver.findElement(By.id("nav-xshop"));
		List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		for(int i=0;i<headerlinks.size();i++)
		{
			System.out.println(headerlinks.get(i).getText());
		}
		
		
	}

}
