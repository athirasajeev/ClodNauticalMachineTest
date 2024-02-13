package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cloud.BaseClass.BaseClass;

public class LoginTest extends BaseClass {
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		lp.loginfun();
		Thread.sleep(5000);
		String expected="Dashboard";
		String actual=lp.togetDashboardText().getText();
		//System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	
	  @Test public void invalidLogin() { lp.invalidLoginfun(); String
	  expected="Invalid Username or Password"; String actual=lp.togetAlertText();
	  Assert.assertEquals(actual, expected); }
	 
	
	
	
}
