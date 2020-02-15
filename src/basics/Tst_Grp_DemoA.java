package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tst_Grp_DemoA  extends Tst_Group_BaseTest
{
   @Test(priority = 1, groups = "sm")
   public void createUser() {
	   Reporter.log("User is Created",true);
   }
   
   @Test(priority = 2, groups = {"sm","reg"})
   public void editUser() {
	   Reporter.log("Edited User",true);
   }
   
   @Test(priority = 3, groups = "reg")
   public void deleteUser() {
	   Reporter.log("User is deleted",true);
   }
}
