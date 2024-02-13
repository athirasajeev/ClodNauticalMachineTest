package com.cloud.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloud.BaseClass.BaseClass;

public class TechnicalModule extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="//table[@class='w-full border-0 h-auto  bg-table min-w-full']/thead/tr/th")
	WebElement allheader;
	@FindBy(xpath="//a[.='ALPHA SHIP']")
	WebElement row;
	@FindBy(css="main div div div:nth-child(2) p:nth-child(1)")
	WebElement TechnicalTab;
	
	public TechnicalModule(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement togetHeaders()
	{
		return allheader;
	}
	public WebElement toClickRow()
	{
		return row;
	}
	public WebElement toClickTechTab()
	{
		return TechnicalTab;
	}
	public void toClickHeader()
	{
		act.click(driver, allheader);
	}
	public void clickRow()
	{
		act.click(driver, row);
	}
	public void clickTechnicalTab()
	{
		act.click(driver, TechnicalTab);
	}
	

}
