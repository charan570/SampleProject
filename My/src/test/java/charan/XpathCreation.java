package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCreation {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
	//	Thread.sleep(6000);
// this comment will print all the elements present in the search filed the the Xpath should 
				//take in catageory area 		
		driver.findElement(By.xpath("//a[@id='searchedCat']")).click();
		
// this comment will take the all elements present in search filed and Xpath should be taken for all catagories
		               // here Xpath is taken as MAnually we need to create and  implement the xpath 
	    List<WebElement> list= driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/a  "));
	    	  System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			
  for( WebElement items:list)
  {
	  System.out.println(items.getText());
  }

	/*// if we want to print only one element present in the catageory then
		
	
		   List<WebElement> list= driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/[9]a  "));
		   for( WebElement items:list)
		   {
		 	  System.out.println(items.getText());
		   }*/
	}
}
	