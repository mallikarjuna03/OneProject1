package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_HRM_Locators {
	
	WebDriver driver;
	
  @Test
  public void NewTest1() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://opensource-demo.orangehrmlive.com//");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin.button")).click(); 
		//right click on login>inspect>click arrow button on right side>place a cursor at login button>type it as a code
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		//right click on Admin>inspect>right side three dots>rightclick>copy>copy xpath.
		driver.findElement(By.linkText("Nationalities")).click();
        //where ever webelement start with <a anchor tag is there there u hv to use linktext
		//u hv to use ending words as a anchor tag as a webelement
		//mostly it can be used to Static(value will not be change) webelement only
		//partialLinkText also used to start with anchor tag,but u hv to take partial element only
		//partialLinkText is used to dynamic(value will change) web element only
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.name("nationality[name]")).sendKeys("Onlyone");
		driver.findElement(By.className("savebutton")).click();
		//where class element is there that is called className
		

  }
}
