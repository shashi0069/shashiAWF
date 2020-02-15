package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Poi {
	static {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	}

	public static void main(String[] args) throws Exception {
		
		//WebDriver driver=new FirefoxDriver();
	    File f=new File("C:\\Users\\hp\\Desktop\\a.xlsx");
		FileInputStream file=new FileInputStream(f);
		
		
		Workbook wb=WorkbookFactory.create(file);
		
		Sheet sh=wb.getSheet("Sheet1");
		
		Row r=sh.getRow(4);
		
		short cc = r.getLastCellNum();
		System.out.println(cc);
		
		
		  int rc = sh.getLastRowNum();
		  System.out.println(rc);
		 
		
		
		/*
		 * Row r=sh.getRow(0);
		 * 
		 * Cell c=r.getCell(0);
		 * 
		 * String data=c.toString();
		 * 
		 * System.out.println(data);
		 */
		

	}

}
