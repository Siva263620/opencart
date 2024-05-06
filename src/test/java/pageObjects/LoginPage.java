package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement setEmail;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement setPassword;
	
	@FindBy(xpath="//input[@value='Login']") 
	WebElement loginBtn;
	
	
		public void setEmail(String email) {
			
			setEmail.sendKeys(email);
			
		}
	
		public void setPassword(String password) {
				
			setPassword.sendKeys(password);
				
			}
		
		public void clickLoginButton() {
			
			loginBtn.click();
	
}
	
}
