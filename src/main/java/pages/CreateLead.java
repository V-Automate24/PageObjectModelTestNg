package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class CreateLead extends ProjectWrappers {

	public CreateLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}	

	public CreateLead enterCompanyName(String compName)
	{
		enterByXpath(prop.getProperty("CreateLead.CompName.Xpath"), compName);
		return this;
	}

	public CreateLead enterfirstName(String firstName)
	{
		enterByXpath(prop.getProperty("CreateLead.FirstName.Xpath"), firstName);
		return this;
	}
	public CreateLead enterlstName(String lastName)
	{
		enterByXpath(prop.getProperty("CreateLead.LastName.Xpath"), lastName);
		return this;
	}
	
	public ViewLead clickSubmitButton()
	{
		clickByXpath(prop.getProperty("CreateLead.SubmitButton.Xpath"));
		return new ViewLead(driver, test);
	}



















}
