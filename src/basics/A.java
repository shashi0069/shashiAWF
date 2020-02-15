package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	static {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}
	    

	public static void main(String[] args) {
		
		WebDriver driver1 =new FirefoxDriver();
		driver.get("https://www.google.com/");
		//Dimension d=new Dimension(600,900);
		//driver.manage().window().setSize(d);
		/*
		 * Point p=new Point(20,30); driver.manage().window().setPosition(p);
		 */
		/*
		 * String title=driver.getTitle(); System.out.println(title);
		 */
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		

	}

}
