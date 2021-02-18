package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class desktopspageobj extends Base {
	
	public desktopspageobj() {
		
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath= "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	   private WebElement Desktops; 
	
	@FindBy(xpath= "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
	   private WebElement Mac; 
	
	
	
	

}
