package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	
	WebDriver driver;
	
  @Test
  public void NewTest1() {
	  
	          System.setProperty("webdriver.gecko.driver","C:\\FirefoxDriver\\Firefox.exe"); 
	          // Setting system properties of FirefoxDriver
			  WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			  driver.get("https://www.google.com/");  
			

  }
}
