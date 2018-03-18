package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MergeLead extends ProjectWrappers {

	public MergeLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not MergeLead Page", "FAIL");
		}
	}	

         public FindLeadsPopUp clickMergePopupButton1() throws InterruptedException
         {
        	 clickByXpath(prop.getProperty("MergeLead.MergePopupButton1.Xpath"));
        	 switchToLastWindow();
        	 Thread.sleep(1000);
        	 return new FindLeadsPopUp(driver, test);
         }

         public FindLeadsPopUp clickMergePopupButton2()
         {   
        	 //switchToParentWindow();
        	 clickByXpath(prop.getProperty("MergeLead.MergePopupButton2.Xpath"));
        	 switchToLastWindow();
        	 return new FindLeadsPopUp(driver, test);
         }
         public ViewLead clickMergeButton()
         {
        	 clickByXpath(prop.getProperty("MergeLead.MergeButton.Link"));
        	 acceptAlert();
        	 return new ViewLead(driver, test);
         }
















}
