package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import pages.MyLead;
import wrappers.ProjectWrappers;

public class TC007_DuplicateLead extends ProjectWrappers{

	@BeforeClass
	public void setValues(){
		testCaseName = "TC007_DuplicateLead";
		testDescription = "Duplicate Lead";
		authors = "Vignesh";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC007";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd,String firstName,String Email) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadLink()
		.clickFindLead()
	    .clickEmailLink()
	    .enterEmailAddress(Email)
	    .clickFindLeadBtn()
	    .clickFirstLead()
	    .clickDuplicateLeadButn()
	    .enterDuplicateFirstName(firstName)
	    .clickSubmitButton()
	    .verifyUpdatedFirstName(firstName);
	    
	    
	    
		
	}
}















