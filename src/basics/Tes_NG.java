package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tes_NG 
{
   @Test(invocationCount = 3)
   public void Demo() {
	   Reporter.log("Hii",true);
   }
}
