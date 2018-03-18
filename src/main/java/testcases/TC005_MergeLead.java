package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC005_MergeLead extends ProjectWrappers{

	@BeforeClass
	public void setValues(){
		testCaseName = "TC005_MergeLead";
		testDescription = "Merge Lead";
		authors = "Vignesh";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC005";		
	}

	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd,String LeadId) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadLink()
		.clickMergeLead()
		.clickMergePopupButton1()
		.enterLeadId(LeadId)
		.clickFindLeadButn()
		.clickFirstLeadId()
		.clickMergePopupButton2()
		.enterLeadId(LeadId)
		.clickFindLeadButn()
		.clickSecondLeadId()
		.clickMergeButton();
	
	}
}















