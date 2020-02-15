package basics;


import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoC {
	
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data=new Object[2][2];
		data[0][0]="UserA";
		data[0][1]="Ram123";
		data[1][0]="UserB";
		data[1][1]="Ram456";
		
		return data;
		
	}

	@Test(dataProvider = "getdata")
	public void CreateUser(Object un, Object pw) {
		
		Reporter.log(un +"\t"+pw, true);
	}
}
