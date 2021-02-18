package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Retailpageobjj extends Base {
	
	
	public Retailpageobjj() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@title ='iPhone'] ")
	private WebElement iPhoneImage;
	
	public void entervalueinsearchbar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
		
	}
	
	public void ClickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);  
	}
	
}


