package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class M8_EmailableReport {
	
	
   WebDriver driver;

  @Test
  public void Test10() throws Exception {
	  
	  
	 driver = TestBrowser.OpenChromeBrowser();
	 String TestURL = "https://opensource-demo.orangehrmlive.com/";
	 
	 driver.get(TestURL);
	  Reporter.log("Pass - Open_OrangeHRM");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  Reporter.log("Pass - Enter User Name");
	  
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  Reporter.log("Pass - Password");
	  
	  driver.findElement(By.name("Submit")).click();
	  Reporter.log("Pass - Click login");
	  
	  driver.close();
	  
  }
}
	  
	 
	  
	  
	  
	  
	  
	  
	  
//	  driver = TestBrowser.OpenChromeBrowser();
//		
//		String TestURL = "https://opensource-demo.orangehrmlive.com/";
//		
//		driver.get(TestURL);
//	    Reporter.log("Pass- open Orangehrm1");
//	    
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		Reporter.log("Pass- Enter User Name1");
//		
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
//		Reporter.log("Pass- Enter Password1");
//		
//		driver.findElement(By.name("Submit")).click();
//		Reporter.log("Pass- Click on Signin1");
//		
//		driver.close();
 
