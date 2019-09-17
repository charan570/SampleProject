package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomRadiButtons {

	public static void main(String[] args) {
		 
		// MUltiple Radio Box 
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement tables=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radiolist= tables.findElements(By.tagName("input"));
		System.out.println(radiolist.size());
		
		for(int i=0;i<radiolist.size();i++)
		{
			System.out.println(radiolist.get(i).getAttribute("Checked")+ "-----"+radiolist.get(i).getAttribute("value));"));

			 // this comment will select the radio button what we have need
			/* if(radiolist.get(i).getAttribute("value").equals("cheese"));
				 radiolist.get(i).click();*/
		}


	}

}
