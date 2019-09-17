package charan;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNolinks {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
  for(WebElement element:links)
  {
	  System.out.println(element.getText());
  }
}
}