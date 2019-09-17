package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClasstest {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement drop = driver.findElement(By.id("searchDropdownBox"));
	Select sl= new Select(drop);
	// we are selecting an elenent from drop down at a time we can select only one method
	
	// sl.selectByIndex(23);
	
    // or another method
	// sl.selectByVisibleText("Amazon Pantry");
	 // or another method
	//sl.selectByValue("search-alias=beauty");
	//  capturing all elements from Drop down
	 
/* List< WebElement> droplist= sl.getOptions();
 System.out.println(droplist.size());
 
 // using for each loop
  for (WebElement element : droplist)
  {
  
  System.out.println(element.getText());
  }*/
	
  // for printing the foirst selected item in console
  // System.out.println(sl.getFirstSelectedOption().getText());

   // if we want to select multiple elements from dropdown and print size and names
   
   sl.selectByVisibleText("Industrial & Scientific");
   List< WebElement> allItems= sl.getAllSelectedOptions();
   System.out.println(allItems.size());
   for (WebElement element : allItems)
   {
   
   System.out.println(element.getText());
   }
}
}