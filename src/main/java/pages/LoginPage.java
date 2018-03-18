package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class LoginPage extends ProjectWrappers {

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Leaftaps - TestLeaf Automation Platform")){
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public LoginPage typeUserName(String data){
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;
	}

	public LoginPage typePassword(String data){
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}

	public HomePage clickLogin(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage(driver,test);
	}
	
	
	public LoginPage clickLoginForFailure(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
	}
	
	public LoginPage verifyErrorMsg(String text){
		verifyTextContainsById(prop.getProperty("Login.Error.Id"), text);
		return this;
	}

	public String captureFirstLead() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDeleteLeadId() {
		// TODO Auto-generated method stub
		return null;
	}





//Lead ID Capturing
/*	 public String captureFirstLead()
		{
			leadId = getTextByXpath(prop.getProperty("FindLead.FirstResultingLead.Xpath"));
			System.out.println(leadId);
			return leadId;
		}

*/











}
