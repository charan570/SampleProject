package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableworking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.linkText("PIM")).click();
	    driver.findElement(By.linkText("Employee List")).click();
	    
	    //  AUtomating ROWS columns
	    // taking the manual xpath of the Rows
	    List<WebElement> rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
	    System.out.println(rows.size());
	    for(int i=0; i<rows.size();i++)
	    {
	    	//  for column Automating
	    	 List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
	    	 for(int j=0; j<col.size();j++)
	    	 {
	    		// System.out.println(col.get(i).getText());
	    	
	    	    // if we want to specify only one column and one row then 
	  	    System.out.println(driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/[11]/td[3].getText()")));

	    }
	    }
	    
	}

}
