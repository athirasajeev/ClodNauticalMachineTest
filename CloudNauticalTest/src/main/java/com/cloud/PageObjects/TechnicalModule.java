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
	
	public TechnicalModule(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement togetHeaders()
	{
		return allheader;
	}
	public void toClickHeader()
	{
		act.click(driver, allheader);
	}

}
