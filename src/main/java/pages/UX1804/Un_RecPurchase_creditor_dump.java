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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4c75b933-bce3-4426-a49c-026695c92cb2
@TestModellerModule(guid = "4c75b933-bce3-4426-a49c-026695c92cb2")
public class Un_RecPurchase_creditor_dump extends BasePage
{
	public Un_RecPurchase_creditor_dump (WebDriver driver)
	{
		super(driver);
	}




	private By _Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnExportToExcel']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

   
     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}
}