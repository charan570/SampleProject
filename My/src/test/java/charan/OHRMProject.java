package charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMProject
{
	WebDriver driver;
	String res;
//Launching Orange HRM Application
	public String appLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//validate
		if (driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		
		return res;
	}
	
	//Login into Orange HRM Application
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		//validation
		if (driver.findElement(By.linkText("PIM")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		
		return res;
		
	}
	
	//Logout from Orange HRM Application
	public String appLogout() throws Exception
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//validate
		if (driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
				
		return res;
	}
	//Close the Orange HRM Application
	public void appClose()
	{
		driver.close();
	}
	
	// Employee crteation in  Orange HRM Application
	 	public String employeeCreation(String firstName ,String lastName)
	 	 {
		 driver.findElement(By.linkText("PIM")).click();
		 driver.findElement(By.linkText("Add Employee")).click();
		 
		 driver.findElement(By.id("firstName")).sendKeys(firstName);
		 driver.findElement(By.id("lastName")).sendKeys(lastName);
		 
		 driver.findElement(By.id("btnSave")).click();
		 //validation
		 
		 if (driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).isDisplayed())
		 {
			res="Pass";
		 }else
		 {
			res="Fail";
		 }
					
		return res;
	 }
	public static void main(String[] args) throws Exception 
	{
		OHRMProject app=new OHRMProject();
		app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appLogin("Admin", "Qedge123!@#");
		app.employeeCreation("Saicharan", "Qedge123");
		app.appLogout();
		app.appClose();
		
	}
	
	
}
