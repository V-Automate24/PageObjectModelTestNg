package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC004_EditLead extends ProjectWrappers{

	@BeforeClass
	public void setValues(){
		testCaseName = "TC004_EditLead";
		testDescription = "Edit Lead";
		authors = "Vignesh";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC004";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd,String firstName,String UpdatedName) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadLink()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadBtn()
		.clickFirstLead()
		.clickEditLeadButn()
		.editFirstName(UpdatedName)
		.clickUpdateButton()
		.verifyUpdatedFirstName(UpdatedName);
	
	}
}















