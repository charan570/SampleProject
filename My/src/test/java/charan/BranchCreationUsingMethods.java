package charan;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class BranchCreationUsingMethods {
		WebDriver driver;
		String res;
		
	
		
		
		// To launch Application
		public String appLaunch(String url)
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Testing Browser\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			if(driver.findElement(By.id("txtuId")).isDisplayed())
							{
				res= "pass";
				
			}else
			{
				res= "fail";
			}
			return res;
		}
			
			 
			// to Login into App 
		
		public String appLogin(String userName ,String password)
		{
			
			driver.findElement(By.id("txtuId")).sendKeys(userName);
			driver.findElement(By.id("txtPword")).sendKeys(password);
			driver.findElement(By.id("login")).click();
			return null;
			
			
			
		}
	     // creating the branch after login
		public String appBranchcreate(String branchName,String address ) throws Exception
		{
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("BtnNewBR")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("txtbName")).sendKeys(branchName);
			Thread.sleep(3000);
			driver.findElement(By.id("txtAdd1")).sendKeys(address);
			Thread.sleep(3000);
			driver.findElement(By.id("txtAdd2")).sendKeys("Nagasuri plaza");
			Thread.sleep(3000);
			driver.findElement(By.id("txtadd3")).sendKeys("opposite to Maithrivihar");
			Thread.sleep(3000);
			driver.findElement(By.id("txtArea")).sendKeys("Ameerpet");
			Thread.sleep(3000);
			driver.findElement(By.id("txtZip")).sendKeys("50005");
			Thread.sleep(2000);
			Select country =new Select(driver.findElement(By.id("lst_counrtyU")));
			country.selectByIndex(1);
			Thread.sleep(2000);
			Select state =new Select(driver.findElement(By.id("lst_stateI")));
			state.selectByIndex(1);
			Thread.sleep(2000);
			Select city =new Select(driver.findElement(By.id("lst_cityI")));
			city.selectByIndex(1);
			Thread.sleep(2000);
			driver.findElement(By.id("btn_insert")).click();
			if(driver.findElement(By.xpath("//*[@id='Form1']/div/table/tbody/tr/td/table/tbody/tr[3]/td/strong")).isDisplayed())
			{
                       res= "pass";

                          }else
                             {
                               res= "fail";
                              }
                               return res;
          }
		
			
			
			
			// to logout from Application
		public String appLogout()
		{
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[3]/a/img")).click();
			if(driver.findElement(By.id("txtuId")).isDisplayed())
			{
				res= "pass";
				
			}else
			{
				res="fail";
			}
			return res;
		
		}
			public static void main(String[] args) throws Exception {
				BranchCreationUsingMethods app= new BranchCreationUsingMethods();
				String results= app.appLaunch("http://primusbank.qedgetech.com/");
				
				app.appLogin("Admin","Admin" );
				app.appBranchcreate("QedgeTech", "Flat no 204");
				app.appLogout();
						
			}
			
					
		}






