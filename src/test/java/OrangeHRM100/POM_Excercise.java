package OrangeHRM100;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class POM_Excercise {
	
	WebDriver driver;
	
  @BeforeTest
  public void TestURL() throws Exception
  {
	  driver = TestBrowser.OpenChromeBrowser();
	  String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	  
  }

  @Test
  public void Nationality() throws Exception 
  {
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		POMLogin L1 = new POMLogin();
		L1.Login_Test(driver);
		L1.Login();
		
		POMNationality N1= new POMNationality();
		N1.Nationality(driver);
		N1.AddNationality();
		
	
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {	
		driver.quit();
	  
  }
}
