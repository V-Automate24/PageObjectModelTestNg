package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC003_CreateLead extends ProjectWrappers{

	@BeforeClass
	public void setValues(){
		testCaseName = "TC003_CreateLead";
		testDescription = "Create Lead";
		authors = "Vignesh";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC003";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd,String compName,String firstNmae,String LastName){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadLink()
		.clickCreateLead()
		.enterCompanyName(compName)
		.enterfirstName(firstNmae)
		.enterlstName(LastName)
		.clickSubmitButton()
		.verifyFirstName(firstNmae);
	}
}















