package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownoneByone {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");
			driver.findElementByLinkText("REGISTER").click();
		    WebElement country= driver.findElementByTagName("country");
		    List<WebElement> countrylist = country.findElements(By.tagName("option"));
		    System.out.println(countrylist.size());
		    for(int i=0;i<countrylist.size();i++)
		    {
		    	countrylist.get(i).click();
		
		    
		   // validating wether all the elements in country fieldworking r not
		    	if(countrylist.get(i).isSelected());
		    	{
		    	System.out.println(countrylist.get(i).getText()+"    :is Selected");
		    	}
		    	/*else
		    	{
		    	System.out.println(countrylist.get(i).getText()+ "    :is selected");
		    	
		    	}*/
		    }
		    
		    
		 		
		    
		}
		
		

	

}
