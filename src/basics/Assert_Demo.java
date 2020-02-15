package basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Demo 
{
	@Test
	public void TitleVerify(){
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement lgBT = driver.findElement(By.name("keywords"));
		boolean v = lgBT.isDisplayed();
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(v);
		
		
		driver.close();
		sa.assertAll();
	}
	
	

}
