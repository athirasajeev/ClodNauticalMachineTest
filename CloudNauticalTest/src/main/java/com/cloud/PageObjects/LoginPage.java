package com.cloud.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloud.BaseClass.BaseClass;

public class LoginPage extends BaseClass {

		WebDriver driver;
		@FindBy(id="username")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginbtn;
		@FindBy(xpath="//h1[@class='md:ml-[15px] text-secondary text-xl font-medium leading-6 tracking-wide']")
		WebElement dashboardtext;
		@FindBy(xpath="//div[@id='notistack-snackbar']")
		WebElement message;
		
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver= driver;
			PageFactory.initElements(driver, this);
			
		}
		public WebElement toClickUsername()
		{
			return username;
		}
		public WebElement toClickPassword()
		{
			return password;
		}
		public WebElement ToClickLogin()
		{
			return loginbtn;
		}
		public WebElement togetDashboardText()
		{
			return dashboardtext;
		}
		public WebElement togetmessage()
		{
			return message;
		}
		
		public void loginfun()
		{
			username.click();
			username.sendKeys("08022024");
			password.sendKeys("Tester@2024");
			act.click(driver, loginbtn);
		}
		public void invalidLoginfun()
		{
			username.click();
			username.sendKeys("12345");
			password.sendKeys("tester@2023");
			act.click(driver, loginbtn);
		}
		public String togetAlertText()
		{
			String msg=message.getText();
			return msg;
		}

	

}
