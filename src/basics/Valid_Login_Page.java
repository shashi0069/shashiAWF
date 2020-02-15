package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Valid_Login_Page 
     { 
	 @FindBy(id="username")
	 private WebElement UnBT;
	 
	 
	 @FindBy(name="pwd")
	 private WebElement PwBT;
	 
	 
	 @FindBy(xpath = "//div[text()='Login ']")
	 private WebElement LgBT;
	 
	 
	 public Valid_Login_Page(WebDriver driver) 
	 {
		PageFactory.initElements(driver,this); 
	 }
	 
	 
	 public void EnterUserName(String un) {
		 UnBT.sendKeys(un);
	 }
	 
	 public void EnterPassword(String pw) 
	 {
		 PwBT.sendKeys(pw); 
	 }
	 
	 public void LoginButton() {
		 LgBT.click();
	 }
	 


}
