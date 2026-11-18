package com.demowebshop.login;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ScreenShotUtility;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.WelcomePage;

public class LoginTest extends BaseClass{
	
	@Test(groups= {"Smoke","Regression"})
	public void loginAsValidUser() throws FileNotFoundException, IOException{
		
		WelcomePage wp=new WelcomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		//Click On Login Link
		wp.clickOnLogin();
		
		//Login
		lp.loginAsValidUser(email, password);
		
		//Verify User is able to Login
		Assert.assertEquals(wp.getRegisteredEmailText().getText(),email);
		}
		
	
		}
		
