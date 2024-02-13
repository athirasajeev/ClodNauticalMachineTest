package com.cloud.BaseClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.cloud.Actions.Action;

import com.cloud.Utilities.ExcelRead;
import com.cloud.PageObjects.HomePage;
//import com.cloud.Utilities.ExtentManager;
import com.cloud.PageObjects.LoginPage;
import com.cloud.PageObjects.TechnicalModule;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

     public class BaseClass {
	public static Properties prop;
	public static LoginPage lp;
	public static HomePage hp;
	public static TechnicalModule tp;


	public static Action act=new Action();
	public String s;
	public String s2;
	

	//loadConfig method is to load the configuration
	public static ThreadLocal<RemoteWebDriver> driver=new ThreadLocal<RemoteWebDriver>();
	@BeforeSuite
	public void loadConfig() {

		try {
			 prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void firstCall() throws IOException {
		launchApp();
		/*
		 * s = ExcelRead.readStringData(2, 1); s2 = ExcelRead.readStringData(2, 2);
		 */
	     lp = new LoginPage(getDriver()); 
	     hp = new HomePage(getDriver()); 
	     tp = new TechnicalModule(getDriver()); 


	   
			


		
	}
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	public void launchApp() {
		
		String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}	
		getDriver().manage().window().maximize();
	    act.implicitWait(getDriver(), 10);
		//PageLoad TimeOuts
		act.pageLoadTimeOut(getDriver(), 30);   
		getDriver().get(prop.getProperty("url"));
		//System.out.println("Hai");
		
	}
	@AfterMethod
	public void endbrowser()
	{
		getDriver().close();
	}
	@AfterSuite
	public void EndGame()
	{
		
		//ExtentManager.endReport();
	}
	
	
	

	
	}
