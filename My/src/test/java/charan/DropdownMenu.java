package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMenu {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> droplist =drop.findElements(By.tagName("option"));
		System.out.println("droplist.size()");
	
	for(int i=0;i<droplist.size();i++){
		System.out.println(droplist.get(i).getText());
		
	}
		

}
}