package charan;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HeaderPresentLinks {
		public static  void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			
			List<WebElement> links =  driver.findElements(By.tagName("a"));
			
			
			 for(int i=0;i<links.size();i++)
			  {
				  // this comment will resolve the issue of the empty space of (personal info) in console. 
				  if(links.get(i).getText().equals("Todays's Deals"))
				  {
				               links.get(i).click();
				  }
			  }
	}
	}