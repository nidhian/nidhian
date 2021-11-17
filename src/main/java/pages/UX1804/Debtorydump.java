package pages.UX1804;

import pages.BasePage;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ef8ab22f-2f6b-445b-a840-a05ab02dc8c4
@TestModellerModule(guid = "ef8ab22f-2f6b-445b-a840-a05ab02dc8c4")
public class Debtorydump extends BasePage
{
	public Debtorydump (WebDriver driver)
	{
		super(driver);
	}


	
	private By Date_EnterElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Click_SearchbtnElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");



	private By Dump1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnExportToExcel']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportDebtors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportDebtors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportDebtors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   //public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100890";
//
//        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100890")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

      
	/**
 	 * Enter Date_Enter
     * @name Enter Date_Enter
     */
 	public void Enter_Date_Enter(String Date_Enter)
 	{
 	    
 		WebElement elem = getWebElement(Date_EnterElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_Enter", "Enter_Date_Enter failed. Unable to locate object: " + Date_EnterElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_Enter", "Enter_Date_Enter failed. Unable to locate object: " + Date_EnterElem.toString());

 			Assert.fail("Unable to locate object: " + Date_EnterElem.toString());
         }

 		elem.sendKeys(Date_Enter);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date_Enter " + Date_Enter);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date_Enter " + Date_Enter);
 	}

     
	/**
 	 * Click Click_Searchbtn
     * @name Click Click_Searchbtn
     */
	public void Click_Click_Searchbtn()
	{
        
		WebElement elem = getWebElement(Click_SearchbtnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Searchbtn", "Click_Click_Searchbtn failed. Unable to locate object: " + Click_SearchbtnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Searchbtn", "Click_Click_Searchbtn failed. Unable to locate object: " + Click_SearchbtnElem.toString());

			Assert.fail("Unable to locate object: " + Click_SearchbtnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Searchbtn");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Searchbtn");
	}

     
	
	/**
 	 * Click Dump1
     * @name Click Dump1
     */
	public void Click_Dump1()
	{
        
		WebElement elem = getWebElement(Dump1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dump1", "Click_Dump1 failed. Unable to locate object: " + Dump1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dump1", "Click_Dump1 failed. Unable to locate object: " + Dump1Elem.toString());

			Assert.fail("Unable to locate object: " + Dump1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Dump1");

		TestModellerLogger.PassStep(m_Driver, "Click_Dump1");
	}
}