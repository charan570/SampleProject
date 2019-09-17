package charan;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest1 {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		// This comment will give all the links  data available on the website.
		// But links like Phoneno, email, persnoal ifo will not acess it will show empty space in console. 
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
  for(int i=0;i<links.size();i++)
  {
	  // this comment will resolve the issue of the empty space of (personal info) in console. 
	  if(!links.get(i).getText().isEmpty());
	  {
	  System.out.println(links.get(i).getText());
  }
	  }
}
}