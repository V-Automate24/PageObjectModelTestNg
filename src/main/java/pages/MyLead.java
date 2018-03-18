package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyLead extends ProjectWrappers {

	public MyLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not MyLeads Page", "FAIL");
		}
	}	

	public CreateLead clickCreateLead()
	{
		clickByLink(prop.getProperty("MyLead.CreateLead.Link"));
		return new CreateLead(driver,test);
	}

	public FindLead clickFindLead()
	{
		clickByLink(prop.getProperty("MyLead.FindLead.Link"));
		return new FindLead(driver,test);
	}



	public MergeLead clickMergeLead()
	{
		clickByLink(prop.getProperty("MyLead.MergeLead.Link"));
		return new MergeLead(driver, test);
	}

















}
