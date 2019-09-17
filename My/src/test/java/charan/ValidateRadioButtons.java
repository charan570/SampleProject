package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateRadioButtons {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		for(int k=1;k<2; k++)
		{
			// taking the xpath of radio buttons square
		WebElement tables=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>radiolist= tables.findElements(By.name("group"+k));
		System.out.println("group"+k+ "     :related radio button validation");
		System.out.println(radiolist.size());
		
		for(int i=0;i<radiolist.size();i++)
		{
			radiolist.get(i).click();
			
		}
		// for validation purpose 
		for(int j=0; j<radiolist.size();j++){
			System.out.println(radiolist.get(j).getAttribute("Checked")+ "-----"+radiolist.get(j).getAttribute("value));"));
			
		}
		System.out.println("########");
	}

	}
}
