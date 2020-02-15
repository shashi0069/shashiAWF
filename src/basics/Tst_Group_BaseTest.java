package basics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tst_Group_BaseTest 
{
	@BeforeMethod(alwaysRun = true)
	public void precondition() {
		Reporter.log("Login th App",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void postcondition() {
		Reporter.log("Logout the App",true);
	}

}
