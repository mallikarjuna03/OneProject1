package OrangeHRM100;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orange_HRM_dropdown {
	
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
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.linkText("Organization")).click();
		driver.findElement(By.partialLinkText("Locations")).click();
		
		/*to complete dropdown element by three ways those are	
		2.SelectByVisibleText -- Just enter the whatever the data shows on a dropdown
		3.SelectByIndex -- mention the value by identify the serial number
		1.SelectByValue -- rightclick on dropdown box > Inspect > rightside three dots > copy > copy element > paste in a notepad >observe the value 
		*/
		Select dropdown1=new Select(driver.findElement(By.id("searchLocation_country")));
		//dropdown1.selectByVisibleText("India");
		//dropdown1.selectByIndex(35);
		dropdown1.selectByValue("UG");
		
		//for printing the dropdown values on console
		
		List<WebElement> elements=dropdown1.getOptions();
		
		for(WebElement element:elements)
		{		
	    System.out.println(element.getText());
		}
				 
  }
}
