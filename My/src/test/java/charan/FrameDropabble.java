package charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDropabble {

	public static void main(String[] args) {
		
			
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	/*			
		// By using Index Methos
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		// Giving Focus to particular frame
		driver.switchTo().frame(0);*/
		
//		//  OR by using String MEthos
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
//		 // Or by using WebElement
//			WebElement frame1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
//			driver.switchTo().frame(1);

   
		// creating the drop operation after any one method 
				
		WebElement drg= driver.findElement(By.id("draggable"));
		WebElement drp= driver.findElement(By.id("droppable"));

		Actions dad =new Actions(driver);
		dad.dragAndDrop(drg,drp).build().perform();
		// giving focus on Default page
		
		driver.switchTo().defaultContent();
		
	}

}
