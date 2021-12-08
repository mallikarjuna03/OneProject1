package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class M7_DataProvider_lab1 {
	

	static WebDriver driver;

//	String UserName = "Admin",Password = "admin123";
//	String Nationality = "kelvin";
	
	
 @DataProvider(name = "Google")	
  public static Object[][] Case1() throws Exception{
	 return new Object[][]
	 {	
		 {"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Capacity1"},
		 {"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Capacity2"}
	 };
			 
  }
  @Test(dataProvider ="Google")
  public void Case1(String TestURL,String Username, String Password,String Nationality) throws Exception
  {
	driver = TestBrowser.OpenChromeBrowser();  	    	  
	driver.get(TestURL);
	 
  
	findElement(By.id("txtUsername")).sendKeys("Admin"); 
	findElement(By.id("txtPassword")).sendKeys("admin123");
	findElement(By.name("Submit")).click();
  
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.name("btnAdd")).click();
	findElement(By.name("nationality[name]")).sendKeys(Nationality);
	findElement(By.className("savebutton")).click();
	
	WebElement Element1 = findElement(By.linkText(Nationality));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", Element1);
  
  
	  driver.quit();
  }
  public static WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
}

