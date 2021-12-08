package OrangeHRM100;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	
	WebDriver driver;
	
  @Test
  public void doubleClick()  throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");	
	  
	   findElement(By.id("txtUsername")).sendKeys("Admin");		
	   findElement(By.name("txtPassword")).sendKeys("admin123");
	   findElement(By.cssSelector("input#btnLogin.button")).click();
	   
	   //doubleClick() operation
	   WebElement Copy = findElement(By.id("menu_admin_viewAdminModule"));
	   Actions actions = new Actions(driver);
	   actions.doubleClick(Copy).perform();
	 
	   //mouse hover or moveToElement();
	     //WebElement Admin = findElement(By.id("menu_admin_viewAdminModule"));
	     //WebElement User_Management = fineElement(By.id("))
	     //Actions actions = new Actions(driver);
		 //actions.moveToElement(Admin).
		 //moveToElement(User_Management).
		 //moveToElement(Users).click().build().perform();
  }
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
