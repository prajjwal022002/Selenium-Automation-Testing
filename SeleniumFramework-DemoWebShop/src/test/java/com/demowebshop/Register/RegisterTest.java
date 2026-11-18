package com.demowebshop.Register;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ExcelUtility;
import com.demowebshop.generic_utilities.FileUtility;
import com.demowebshop.generic_utilities.ScreenShotUtility;
import com.demowebshop.generic_utilities.WaitUtility;
import com.demowebshop.generic_utilities.javaUtility;
import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;
import com.demowebshop.object_repository.WelcomePage;

public class RegisterTest extends BaseClass{

	@Test(groups= {"Regression"})
	public void RegisterAsNewUser() throws FileNotFoundException, IOException {
		
		//read the data from properties file
		FileUtility fu=new FileUtility();
		String browser = fu.readKeyValueFromPropertyFile("browser");
		String url = fu.readKeyValueFromPropertyFile("applicationUrl");
		
		//Read the Data from Excel File
		ExcelUtility eobj=new ExcelUtility();
		String firstName = eobj.readDataFromSpecificCell("RegisterUser", 1, 1);
		String LastName = eobj.readDataFromSpecificCell("RegisterUser", 1, 2);
		String Gender = eobj.readDataFromSpecificCell("RegisterUser", 1, 3);
		String emailA = eobj.readDataFromSpecificCell("RegisterUser", 1, 4);
		String emailB = eobj.readDataFromSpecificCell("RegisterUser", 1, 5);
		String Password = eobj.readDataFromSpecificCell("RegisterUser", 1, 6);

		//Launch Browser
		WaitUtility waobj=new WaitUtility(driver);
		WelcomePage weobj=new WelcomePage(driver);
		RegisterPage robj=new RegisterPage(driver);
		RegisterResultPage reobj=new RegisterResultPage(driver);
		
		//Java Utility Class
		javaUtility ju=new javaUtility();
		
		weobj.clickOnRegister();
		
		//Registration
        robj.registerAsNewUser(Gender, firstName, LastName, emailA, ju.getrandomNumber(), emailB, Password);
        
        //Verify if Registration is Successful
        Assert.assertTrue(reobj.getSuccessMessage().isDisplayed());
		}
	}

