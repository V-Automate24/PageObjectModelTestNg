package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class EditLead extends ProjectWrappers {

	public EditLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not EditLead Page", "FAIL");
		}
	}	

	public EditLead editFirstName(String data) throws InterruptedException
	{
		Thread.sleep(1000);
		enterById(prop.getProperty("EditLead.FirstName.Id"),data);
		return this;
	}
	
	
	public ViewLead clickUpdateButton()
	{
		clickByName(prop.getProperty("EditLead.UpdateButton.Name"));
		return new ViewLead(driver, test);
	}
	
         



















}
