package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest1 {
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
driver.findElement(By.className("nav-input")).click();






	}




}