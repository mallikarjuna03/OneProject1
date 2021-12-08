package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Open {
	
	WebDriver driver;
	
  @Test
  public void NewTest1() throws Exception
  {
	  
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.amazon.com//");
		Thread.sleep(6000);
	
		findElement(By.id("nav-link-accountList-nav-line-1")).click();
		findElement(By.id("ap_email")).sendKeys("9550193668");
		findElement(By.id("continue")).click();
		findElement(By.id("ap_password")).sendKeys("malli@668");
		findElement(By.id("signInSubmit")).click();
		findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		findElement(By.id("nav-search-submit-button")).click();	
		
  }
  public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid black'", elem);
	 
		}
		
		return elem;
	}
}
