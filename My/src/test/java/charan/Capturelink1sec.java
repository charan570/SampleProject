package charan;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Capturelink1sec {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		WebElement header =  driver.findElement(By.className("sw_tb"));
		List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		for(int i=0;i<headerlinks.size();i++)
		{
			System.out.println(headerlinks.get(i).getText());
		}
		
		
	}


}
