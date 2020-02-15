package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tst_Grp_DemoB extends Tst_Group_BaseTest
{
	@Test(priority = 4,groups = "sm")
	public void createTask() {
		Reporter.log("Task is Created",true);
	}
	
	@Test(priority = 5, groups = {"sm","reg"})
	public void editTask() {
		Reporter.log("Task is edited",true);
	}
	
	@Test(priority = 6, groups = "reg")
	public void deleteTask() {
		Reporter.log("Task is deleted",true);
	}

}
