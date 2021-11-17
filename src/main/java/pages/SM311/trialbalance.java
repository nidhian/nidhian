package pages.SM311;

import pages.BasePage;
import pages.Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d913fcd8-7780-4da3-8a26-7c430c7405ae
@TestModellerModule(guid = "d913fcd8-7780-4da3-8a26-7c430c7405ae")
public class trialbalance extends BasePage
{
	public trialbalance (WebDriver driver)
	{
		super(driver);
	}


	
	private By Advisortl1Elem = By.xpath("//BUTTON[@data-toggle='dropdown']");

	private By TrialbalanceEntry2Elem = By.xpath("//A[contains(text(),'Trial Balance Entry')]");

	private By ctl00cPHFileUpload_csv1Elem = By.xpath("//label[normalize-space()= 'Upload CSV:']/../div/input");

	private By Upload_button3Elem = By.xpath("//label[normalize-space()= '']/../div/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ImportTrialBalance.aspx?FYCode=117354&CompanyCode=17017")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Advisortl1
     * @name Click Advisortl1
     */
	public void Click_Advisortl1()
	{
        
		WebElement elem = getWebElement(Advisortl1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advisortl1", "Click_Advisortl1 failed. Unable to locate object: " + Advisortl1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advisortl1", "Click_Advisortl1 failed. Unable to locate object: " + Advisortl1Elem.toString());

			Assert.fail("Unable to locate object: " + Advisortl1Elem.toString());
        }
jsExec.executeScript("arguments[0].click()", elem);
	//	//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Advisortl1");

		TestModellerLogger.PassStep(m_Driver, "Click_Advisortl1");
	}

     
	/**
 	 * Click TrialbalanceEntry2
     * @name Click TrialbalanceEntry2
     */
	public void Click_TrialbalanceEntry2()
	{
        
		WebElement elem = getWebElement(TrialbalanceEntry2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_TrialbalanceEntry2", "Click_TrialbalanceEntry2 failed. Unable to locate object: " + TrialbalanceEntry2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_TrialbalanceEntry2", "Click_TrialbalanceEntry2 failed. Unable to locate object: " + TrialbalanceEntry2Elem.toString());

			Assert.fail("Unable to locate object: " + TrialbalanceEntry2Elem.toString());
        }

		elem.click();
		Library.Switchwindow(3, m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_TrialbalanceEntry2");

		TestModellerLogger.PassStep(m_Driver, "Click_TrialbalanceEntry2");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload_csv1
     * @name Enter ctl00$cPH$FileUpload_csv1
     */
 	public void Enter_ctl00cPHFileUpload_csv1(String ctl00cPHFileUpload_csv1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFileUpload_csv1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_csv1", "Enter_ctl00cPHFileUpload_csv1 failed. Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload_csv1", "Enter_ctl00cPHFileUpload_csv1 failed. Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFileUpload_csv1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHFileUpload_csv1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload_csv1 " + ctl00cPHFileUpload_csv1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload_csv1 " + ctl00cPHFileUpload_csv1);
 	}

     
	/**
 	 * Click Upload_button3
     * @name Click Upload_button3
     */
	public void Click_Upload_button3()
	{
        
		WebElement elem = getWebElement(Upload_button3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_button3", "Click_Upload_button3 failed. Unable to locate object: " + Upload_button3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_button3", "Click_Upload_button3 failed. Unable to locate object: " + Upload_button3Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_button3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_button3");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_button3");
	}
}