package TestCases;

import org.testng.annotations.Test;

import com.cloud.BaseClass.BaseClass;

public class HomeTest extends BaseClass {
@Test(priority=2)
public void toSearch() throws InterruptedException
{
	lp.loginfun();
	hp.clickSettings();
	hp.clickTechnical();
	hp.clickVesselPurticulars();
	hp.clickSearch();
	Thread.sleep(3000);
}
}
