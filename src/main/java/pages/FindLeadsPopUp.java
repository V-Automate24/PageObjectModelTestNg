package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeadsPopUp extends ProjectWrappers {

	public FindLeadsPopUp(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads")){
			reportStep("This is not FindLeadsPopUp Page", "FAIL");
		}
	}	

	public FindLeadsPopUp clickFindLeadButn()
	{
		clickByXpath(prop.getProperty("FindLeadsPopUp.FindLead.Xpath"));
		return this;
	}

	public MergeLead clickFirstLeadId() throws InterruptedException
	{
		Thread.sleep(2000);
		clickByXpathNoSnap(prop.getProperty("FindLeadsPopUp.ClickFirstLeadId.xpath"));
		switchToLastWindow();
		return new MergeLead(driver, test);
	}

	public MergeLead clickSecondLeadId()
	{
		clickByXpath(prop.getProperty("FindLeadsPopUp.ClickSecondLeadId.xpath"));
		return new MergeLead(driver, test);
	}

	public FindLeadsPopUp enterLeadId(String data)
	{           	
		enterByXpath(prop.getProperty("FindLeadsPopUp.EnterLeadId.Xpath"), data);
		return this;
	}
















}
