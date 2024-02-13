package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cloud.BaseClass.BaseClass;

public class TechnicalModuleTest extends BaseClass{
	@Test
	public void expandVesselPurticulars() throws InterruptedException
	{
		lp.loginfun();
		hp.clickSettings();
		hp.clickTechnical();
		hp.clickVesselPurticulars();
		hp.clickSearch();
		Thread.sleep(3000);
		List<WebElement> allheader= getDriver().findElements(By.cssSelector("//table[@class='w-full border-0 h-auto  bg-table min-w-full']/thead/tr/th"));
	      System.out.println(allheader.size());
	      for(WebElement row:allheader)
	      {
	    	  String value=row.getText();
	    	  System.out.println(value);
	    	  if(value.contains("AADAMS GROUP"))
	    	  {
	         row.click();
	         break;
	         
	    	  }
	      }
			Thread.sleep(3000);
			System.out.println("Hai");

	}

}
