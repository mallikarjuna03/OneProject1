package Advanced_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Relative_Xpath {
	WebDriver driver;
	
  @Test
  public void Absoulute() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	  //relative Xpath
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
  }


}
