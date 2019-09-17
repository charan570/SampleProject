package charan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Testing Browser\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().deleteAllCookies();

driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://mail.google.com");


// TODO Auto-generated method stub

}
}