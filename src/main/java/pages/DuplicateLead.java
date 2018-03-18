package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class DuplicateLead extends ProjectWrappers {

	public DuplicateLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Duplicate Page", "FAIL");
		}
	}	

	
public DuplicateLead enterDuplicateFirstName(String data)
{
	enterByXpath(prop.getProperty("DuplicateLead.FirstName.Xpath"), data);
	return this;
}


public ViewLead clickSubmitButton()
{
	clickByXpath(prop.getProperty("DuplicateLead.SubmitButton.Xpath"));
	return new ViewLead(driver, test);
}





}
