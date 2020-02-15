package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Valid_Login_Test {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Valid_Login_Page l=new Valid_Login_Page(driver);
	    l.EnterUserName("admin");
	    l.EnterPassword("manager");
	    l.LoginButton();
	    
	    Thread.sleep(2000);
	    
	    l.EnterUserName("admin1");
	    l.EnterPassword("manager2");
	    l.LoginButton();

	}

}
