package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckBoximp {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.echoecho.com/htmlforms09.htm");
	WebElement tables=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement> Checklist= tables.findElements(By.tagName("input"));
	System.out.println(Checklist.size());
	
	for(int i=0;i<Checklist.size();i++)
	{
		// this comment will check all the check boxes selected from Xpath
		Checklist.get(i).click();
	
	
	//or
	//  if we want to click only on one check box from all 
	
	// if(Checklist.get(i).getAttribute("value").equals(("cheese");
	// Checklist.get(i).click();
	// OR
	
	// If we want to check which check box is checked and which are not in console then 
	
	System.out.println(Checklist.get(i).getAttribute("Checked")+ "-----"+Checklist.get(i).getAttribute("value));"));
	
	
	}
	
	
	
	
	
	
	
	
	
}
	
	
}