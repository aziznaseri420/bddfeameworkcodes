package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class retailpageobj extends Base{
	
	public retailpageobj() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@title ='iPhone'] ")
	private WebElement iPhoneImage;
	
	// WebElement
	
	
	public void enterValueTosearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}
	
	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
		
	}
	public boolean IphpnImageisDisplayed() {
		if(iPhoneImage.isDisplayed())
			return true; 
		else
			return false;
		
	}
	
	// we need to create Methods to perform on each WebElement.
		public void clickOnRegister() {
			WebDriverUtility.clickOnElement(registerOption);
		}
		public void enterFirstName(String fName) {
			WebDriverUtility.enterValue(firstNameField, fName);
		}
		public void enterLastName(String lName) {
			WebDriverUtility.enterValue(lastNameField, lName);
		}
		public void enterEmail(String email) {
			WebDriverUtility.enterValue(emailField, email);
		}
		public void enterTelephone(String phoneNumber) {
			WebDriverUtility.enterValue(telephoneField, phoneNumber);
		}
		public void enterPassword(String password) {
			WebDriverUtility.enterValue(passwordField, password);
		}
		public void enterConfirmPassword(String confirmPassword) {
			WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
		}
		public void subscribe(String valueOfSubscribe) {
			if (valueOfSubscribe.equalsIgnoreCase("yes")) {
				if (!yesSubscribeButton.isSelected())
					WebDriverUtility.clickOnElement(yesSubscribeButton);
			} else
				WebDriverUtility.clickOnElement(noSubscribeButton);
		}
		public void CheckPrivacyPolicy() {
			if (privacyPolicyCheckBox.isDisplayed()) {
				privacyPolicyCheckBox.click();
			}
		}
		public void clickOnContinueButton() {
			WebDriverUtility.clickOnElement(continueButton);
		}
		public boolean RegistrationOutcome() {
			boolean successMessage = accountCreatedMessage.isDisplayed();
			return successMessage;
		}
		
		@FindBy(xpath= "dfsdfsdf");
		private WebElement

}


