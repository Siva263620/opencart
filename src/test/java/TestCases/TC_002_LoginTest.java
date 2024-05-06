package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	@Test(groups={"regression","master"})
	void verify_Login() {
		
		
		
		// HomePage
		HomePage hp =new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(p.getProperty("email"));
		
		lp.setPassword(p.getProperty("password"));
		
		lp.clickLoginButton();
		
		//MyAccountPage
		
		MyAccountPage map = new MyAccountPage(driver);
		
		boolean targetPage =map.myAccountTxt();	
		
		if(targetPage==true) {
			
			Assert.assertTrue(true);
			
		}
		else {
			
			Assert.fail();
		}
		
		
		
	
	
	
	}	
}
