package com.cloud.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloud.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	WebDriver driver;
	@FindBy(xpath="//h1[@class='md:ml-[15px] text-secondary text-xl font-medium leading-6 tracking-wide']")
	WebElement dashboardtext;
	@FindBy(xpath="//span[@data-testid='explorer']")
	WebElement Explorer;
	@FindBy(css="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")
	WebElement Technical;
	@FindBy(css="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > p:nth-child(2) > span:nth-child(1)")
	WebElement VesselPurticulars;
	@FindBy(xpath="//div[contains(text(),'Search')]")
	WebElement search;
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement togetDashboardText()
	{
		return dashboardtext;
	}
	public WebElement toExplorer()
	{
		return Explorer;
	}
	public WebElement toTechnical()
	{
		return Technical;
	}
	public void clickSettings()
	{
		act.click(driver, Explorer);
	}
	public void clickTechnical()
	{
		act.click(driver, Technical);
	}
	public void clickVesselPurticulars()
	{
		act.click(driver, VesselPurticulars);
	}
	public void clickSearch()
	{
		act.click(driver, search);
	}

}
