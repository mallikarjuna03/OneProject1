package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail_Login {
	
	WebDriver driver;
	
  @Test
  public void NewTest1() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://accounts.google.com//");
		
		driver.findElement(By.id("identifierId")).sendKeys("arunkumartadela@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
  }
}
