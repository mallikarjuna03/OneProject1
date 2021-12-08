package CommonUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser {
	
	public static String ChromedriverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	
	public  static   WebDriver  OpenChromeBrowser()throws Exception
	 {
	     WebDriver driver1 ; 
		 	
		 	 //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		 	System.setProperty("webdriver.chrome.driver",ChromedriverPath);
		 	driver1 =new ChromeDriver();
		 	driver1.manage().window().maximize() ;	
		 	
		    return driver1;
	 }
	
  @Test
  public void CloseBrowser(WebDriver driver)throws Exception
	 {
	  
		driver.quit();	
	 
	 }
}
