package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePage {

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver){
		
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement txtMyAccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btn_logout;
	
	
	public boolean myAccountTxt() {
	try {
	 return txtMyAccount.isDisplayed();
	}catch(Exception e) {
	 return (false);
	}
	
 	
	}	

	public void click_Logout_Btn() {
		
		btn_logout.click();
		
	}
}
