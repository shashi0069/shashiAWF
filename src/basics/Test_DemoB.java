package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_DemoB extends BaseTest
{
	@Test
	public void TestB() {
		Reporter.log("TestB",true);
	}
	
	@Test
	public void TestC() {
		Reporter.log("TestC",true);
	}

}
