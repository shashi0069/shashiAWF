package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
	static {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Desktop/Table.html");
		WebElement all = driver.findElement(By.xpath("//table[@id='t1']//tbody//tr[1]//td[3]"));
		all.toString();
		
		
		/*
		 * int sum=0; int count=0; for(WebElement alltext:all) { String text =
		 * alltext.getText();
		 * 
		 * try { int n=Integer.parseInt(text);
		 * 
		 * System.out.println(n); count++; sum=sum+n; } catch (Exception e) { // TODO:
		 * handle exception
		 * 
		 * System.out.println(text); }
		 * 
		 * 
		 * 
		 * } System.out.println("Count======"+count);
		 * System.out.print("Sum: ====="+sum);
		 */

	}

}
