package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M6_Static {
	
	static WebDriver driver;
	//String UserName = "Admin",Password = "admin123";
	//String Nationality = "kelvin";
	
	
  @Test
  public void Login_Test() throws Exception
  {
	  
	  	  
	         M6_Static.OpenChromeBrowser();
	         M6_Static.OpenOrangeHRM();
//	         st.Login(UserName,Password);
//	         st.AddNationality(Nationality);
	         M6_Static.Login();
	         M6_Static.AddNationality();
	         M6_Static.closeBrowser();	    
  }

  public static void OpenChromeBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();	  
  }
  public static void OpenOrangeHRM()
  {
	 String commonURL = "https://opensource-demo.orangehrmlive.com/";
	 driver.get(commonURL); 	
	 
  }
  public static void Login() throws Exception
  {
	findElement(By.id("txtUsername")).sendKeys("Admin"); 
	findElement(By.id("txtPassword")).sendKeys("admin123");
	findElement(By.name("Submit")).click();
  }
  public static void AddNationality() throws Exception
  {
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.name("btnAdd")).click();
	findElement(By.name("nationality[name]")).sendKeys("Nataraj");
	findElement(By.className("savebutton")).click();	  
  }
  
  public static void closeBrowser()
  {
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
