package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLead extends ProjectWrappers {

	public FindLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not FindLeads Page", "FAIL");
		}
	}	
	
	public FindLead enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FindLead.FirstName.xpath"), data);
		return this;
	}
	
	public FindLead clickFindLeadBtn() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.FindLead.Xpath"));
		Thread.sleep(1000);
		return this;
	}
	
	public ViewLead clickFirstLead()
	{
		clickByXpath(prop.getProperty("FindLead.ClickFirstLeadId.xpath"));
		return new ViewLead(driver, test);
	}
	
	public FindLead clickFindLeadButn()
	{
		clickByXpath(prop.getProperty("FindLead.FindLeads.Xpath"));
		return this;
	}
 
    public FindLead enterLeadId(String leadId)
    {           	
    	enterByXpath(prop.getProperty("FindLead.EnterLeadID.Xpath"), leadId);
		return this;
    }

  //Lead ID Capturing
    public String captureFirstLead()
	{
    	String leadId = null;
		leadId = getTextByXpath(prop.getProperty("FindLead.FirstResultingLead.Xpath"));
		System.out.println(leadId);
		return leadId;
	}


    public FindLead verifyErrorMsg(String errorMsg)
	{
		verifyTextByXpath(prop.getProperty("Findlead.ErrorMsg.Xpath"), errorMsg);
		return this;
	}



public FindLead clickEmailLink()
{
	clickByLink(prop.getProperty("FindLead.Email.Link"));
	return this;
}

public FindLead enterEmailAddress(String data)
{
	enterByName(prop.getProperty("FindLead.EmailAddress.Name"), data);
	return this;
}




}
