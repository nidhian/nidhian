package pages.UX1804;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4c75b933-bce3-4426-a49c-026695c92cb2
@TestModellerModule(guid = "4c75b933-bce3-4426-a49c-026695c92cb2")
public class Un_RecPurchase_creditor extends BasePage
{
	public Un_RecPurchase_creditor (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHFiltertxtDateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Search_Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _395000_Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div[2]/div/table/tbody/tr[6]/td[5]/b/span");




	
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
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportCreditors.aspx?FYCode=53468&CompanyCode=13236&menuid=0&st=&at=&dd=-1&do=%3E&A=False&R=False&pt=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPHFilter$txtDateTo
     * @name Enter ctl00$cPHFilter$txtDateTo
     */
 	public void Enter_ctl00cPHFiltertxtDateTo(String ctl00cPHFiltertxtDateTo)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtDateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtDateTo", "Enter_ctl00cPHFiltertxtDateTo failed. Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtDateTo", "Enter_ctl00cPHFiltertxtDateTo failed. Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtDateToElem.toString());
         }

 		elem.sendKeys(ctl00cPHFiltertxtDateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtDateTo " + ctl00cPHFiltertxtDateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtDateTo " + ctl00cPHFiltertxtDateTo);
 	}

     
	/**
 	 * Click Search 
     * @name Click Search 
     */
	public void Click_Search_()
	{
        
		WebElement elem = getWebElement(Search_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

			Assert.fail("Unable to locate object: " + Search_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_");
	}

     
	/**
 	 * Click  £3,950.00 
     * @name Click  £3,950.00 
     */
	public void Click__395000_()
	{
        
		WebElement elem = getWebElement(_395000_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__395000_", "Click__395000_ failed. Unable to locate object: " + _395000_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__395000_", "Click__395000_ failed. Unable to locate object: " + _395000_Elem.toString());

			Assert.fail("Unable to locate object: " + _395000_Elem.toString());
        }

		 elem.click();
		 addashboard_4 ad=new  addashboard_4(m_Driver);
		 String comparison1=ad.unsalevalue1();
		 System.out.println("Unrec Purchase amt in dashboard:" +comparison1);
		 
		 WebElement elem1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div[2]/div/table/tbody/tr[6]/td[5]/b/span"));
		 String text2=elem1.getText();
		 System.out.println("unreconciled amount in CRtor report :" +text2);
		 SoftAssert st=new SoftAssert();
		 st.assertEquals(comparison1, text2);
		 st.assertAll();
          	

		ExtentReportManager.passStep(m_Driver, "Click__395000_");

		TestModellerLogger.PassStep(m_Driver, "Click__395000_");
	}

}