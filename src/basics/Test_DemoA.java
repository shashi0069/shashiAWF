package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_DemoA extends BaseTest
{
     @Test
     public void TestA() {
    	 Reporter.log("TestA",true);
     }
}
