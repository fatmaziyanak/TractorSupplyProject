package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class HomePage extends BaseClass{
	//public WebElement closeAlertLanding=driver.findElement(By.xpath("//*[local-name()='svg' and @id='closeIconSvg']"));
	
	//public WebElement searchBox=driver.findElement(By.xpath("//input[@name='headerSearch']"));
	//public WebElement searchBoxMagnifier=driver.findElement(By.xpath("//button[@aria-label='Search']"));
	
	@FindBy(xpath="//input[@name='headerSearch']")
	public WebElement searchBox;
	
	@FindBy (xpath="//button[@aria-label='Search']")
	public WebElement searchBoxMagnifier;
	
	
	@FindBy (xpath="//span[contains(text(),'Welcome!')]")
	public WebElement welcomeText;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
