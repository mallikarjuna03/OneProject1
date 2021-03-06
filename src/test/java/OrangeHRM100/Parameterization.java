package OrangeHRM100;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;
	
//	String UserName="Admin",Password="admin123";
//	String SkillName="Oracle",SkillDescr="Oracle descr";
	
  @Test
  public void Options() {
	  
	  Parameterization para= new Parameterization();
	  para.LunchBrowser();
	  para.OpenOrangeHRM();
	  para.addSkills();
	  	  
  }
  public void LunchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  public void OpenOrangeHRM()
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  public void addSkills()
  {
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  driver.findElement(By.id("menu_admin_Qualifications")).click();
	  driver.findElement(By.id("menu_admin_viewSkills")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("skill_name")).sendKeys("OrangeApple");
	  driver.findElement(By.id("skill_description")).sendKeys("OrangeAppleDescr");
	  driver.findElement(By.id("btnSave")).click();
	   
 }
}
