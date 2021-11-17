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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5388f18-ca7f-453c-86a3-6428adc5fd9e
@TestModellerModule(guid = "e5388f18-ca7f-453c-86a3-6428adc5fd9e")
public class test4 extends BasePage
{
	public test4 (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expen_leftmenu2Elem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52444&CompanyCode=13236']");

	private By New_btn2Elem = By.xpath("//DIV[@class='dropdown dashOpt-e search_filter_each open']/A[@class='text-white']");

	private By UnprocessedReceipts2Elem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/ul/li[10]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=52444&CompanyCode=13236");
	}

     
//	/**
// 	 * AssertUrl
//     * @name AssertUrl
//     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Expen_leftmenu2
     * @name Click Expen_leftmenu2
     */
	public void Click_Expen_leftmenu2()
	{
        
		WebElement elem = getWebElement(Expen_leftmenu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expen_leftmenu2", "Click_Expen_leftmenu2 failed. Unable to locate object: " + Expen_leftmenu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expen_leftmenu2", "Click_Expen_leftmenu2 failed. Unable to locate object: " + Expen_leftmenu2Elem.toString());

			Assert.fail("Unable to locate object: " + Expen_leftmenu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expen_leftmenu2");

		TestModellerLogger.PassStep(m_Driver, "Click_Expen_leftmenu2");
	}

     
	/**
 	 * Click New btn2
     * @name Click New btn2
     */
	public void Click_New_btn2()
	{
        
		WebElement elem = getWebElement(New_btn2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_btn2", "Click_New_btn2 failed. Unable to locate object: " + New_btn2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_btn2", "Click_New_btn2 failed. Unable to locate object: " + New_btn2Elem.toString());

			Assert.fail("Unable to locate object: " + New_btn2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_btn2");

		TestModellerLogger.PassStep(m_Driver, "Click_New_btn2");
	}

     
	/**
 	 * Click UnprocessedReceipts2
     * @name Click UnprocessedReceipts2
     */
	public void Click_UnprocessedReceipts2()
	{
        
		WebElement elem = getWebElement(UnprocessedReceipts2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_UnprocessedReceipts2", "Click_UnprocessedReceipts2 failed. Unable to locate object: " + UnprocessedReceipts2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_UnprocessedReceipts2", "Click_UnprocessedReceipts2 failed. Unable to locate object: " + UnprocessedReceipts2Elem.toString());

			Assert.fail("Unable to locate object: " + UnprocessedReceipts2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_UnprocessedReceipts2");

		TestModellerLogger.PassStep(m_Driver, "Click_UnprocessedReceipts2");
	}
}