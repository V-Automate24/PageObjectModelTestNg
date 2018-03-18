package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import pages.MyLead;
import pages.ViewLead;
import wrappers.ProjectWrappers;

public class TC006_DeleteLead extends ProjectWrappers{

	@BeforeClass
	public void setValues(){
		testCaseName = "TC006_DeleteLead";
		testDescription = "Delete Lead";
		authors = "Vignesh";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC006";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd,String firstName,String ErrorMsg) throws InterruptedException{
		//LoginPage flp = new LoginPage(driver, test);
		String resultingLead = null;
		
		FindLead flp = new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadLink()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadBtn();
		
		resultingLead = flp.captureFirstLead();
		flp.clickFirstLead()
	    .clickDeleteButton()
		.clickFindLead()
		.enterLeadId(resultingLead)
		.clickFindLeadBtn()
		.verifyErrorMsg(ErrorMsg);
		
	}
}















