package OrangeHRM100;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_HRM_tagname_Locator {
	
	WebDriver driver;
	
  @Test
  public void NewTest1() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://opensource-demo.orangehrmlive.com//");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input#btnLogin.button")).click(); 
		
		
		//list of hyperlinks	
		
		List<WebElement>links5= driver.findElements(By.tagName("a"));
		int link_count = links5.size();
		System.out.println("number of hyperlinks in home page : " +link_count);

  }
}
