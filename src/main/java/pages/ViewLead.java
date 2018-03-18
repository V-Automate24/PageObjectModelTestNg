package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class ViewLead extends ProjectWrappers {

	public ViewLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not ViewLead Page", "FAIL");
		}
	}	

	public ViewLead verifyFirstName(String data)
	{
		verifyTextContainsById(prop.getProperty("ViewLead.FirstName.Id"), data);
		return this;
	}


	public EditLead clickEditLeadButn()
	{
		clickByXpath(prop.getProperty("ViewLead.Editbutton.Xpath"));
		return new EditLead(driver, test);
	}

	public ViewLead verifyUpdatedFirstName(String data)
	{
		verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), data);
		return this;
	}


	public ViewLead getDeleteLeadId()
	{
		String CompanyName = getTextById(prop.getProperty("ViewLead.GetCompanyNameandID.Id"));
		String[] parts = CompanyName.split("\\(");
		leadId = parts[1]; // 18);
		leadId = leadId.replace(")", "");
		System.out.println(leadId);
		return this;
	}

	public MyLead clickDeleteButton()
	{
		clickByLink(prop.getProperty("ViewLead.DeleteButton.Link"));
		return new MyLead(driver, test);
	}


public DuplicateLead clickDuplicateLeadButn()
{
	clickByLink(prop.getProperty("ViewLead.DuplicateButton.Link"));
	return new DuplicateLead(driver, test);
	
}
/*
public ViewLead verifyupdatedFirstName(String data)
{
	verifyTextContainsById(prop.getProperty("ViewLead.GetFirstname.Id"), data);
	return this;
}*/








}
