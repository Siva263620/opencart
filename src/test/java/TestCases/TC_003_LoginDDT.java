package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {

	
	@Test(dataProvider = "LoginData", dataProviderClass=DataProviders.class)
	void verify_LoginDDT(String email, String Password, String res) {
		
		
		try {
		// HomePage
		HomePage hp =new HomePage(driver);
		
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(email);
		
		lp.setPassword(Password);
		
		lp.clickLoginButton();
		

		MyAccountPage map = new MyAccountPage(driver);
		
		boolean targetPage =map.myAccountTxt();
		
		if(res.equalsIgnoreCase("valid")) {
			
			if(targetPage==true) {
				
				map.click_Logout_Btn();
				Assert.assertTrue(true);	
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(res.equalsIgnoreCase("Invalid")) {
			
			if(targetPage==true) {
				
				map.click_Logout_Btn();
		
				Assert.assertTrue(false);
			}
			else
			{

				Assert.assertTrue(true);

			}
		}
		}catch(Exception e) {
			Assert.fail();
			}
		}
	
		
		
	}

