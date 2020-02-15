package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
  {
	private WebElement UnBT;
	private WebElement PwBT;
	private WebElement lgBT;
	

	//Initialization
	public LoginPage(WebDriver driver) throws InterruptedException 
	{
		UnBT=driver.findElement(By.id("username"));
		PwBT=driver.findElement(By.name("pwd"));
		lgBT=driver.findElement(By.xpath("//div[text()='Login ']"));	
		
	}
	
	//utilization
	
	public void Username(String un) {
		UnBT.sendKeys(un);
	}
	public void Password(String pw) {
		PwBT.sendKeys(pw);
	}
	
	public void loginButton() {
		lgBT.click();
	}
	
   
	
	

}
