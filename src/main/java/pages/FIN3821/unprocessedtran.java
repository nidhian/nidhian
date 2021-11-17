package pages.FIN3821;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b691dde6-0e75-4110-b625-1e2640aad613
@TestModellerModule(guid = "b691dde6-0e75-4110-b625-1e2640aad613")
public class unprocessedtran extends BasePage
{
	public unprocessedtran (WebDriver driver)
	{
		super(driver);
	}


	
	private By Unprocessed_Trans_ReprtElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/table/tbody/tr[18]/td/a");

	private By Reports3_menuElem = By.xpath("//A[@href='AdminReports.aspx']");

	private By unprocessed_trns_rpt_linkElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/ReportUnprocessedTran.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/ReportUnprocessedTran.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/ReportUnprocessedTran.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AgentUI/ReportUnprocessedTran.aspx";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AgentUI/ReportUnprocessedTran.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Unprocessed_Trans_Reprt
     * @name Click Unprocessed_Trans_Reprt
     */
	public void Click_Unprocessed_Trans_Reprt()
	{
        
		WebElement elem = getWebElement(Unprocessed_Trans_ReprtElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unprocessed_Trans_Reprt", "Click_Unprocessed_Trans_Reprt failed. Unable to locate object: " + Unprocessed_Trans_ReprtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unprocessed_Trans_Reprt", "Click_Unprocessed_Trans_Reprt failed. Unable to locate object: " + Unprocessed_Trans_ReprtElem.toString());

			Assert.fail("Unable to locate object: " + Unprocessed_Trans_ReprtElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Unprocessed_Trans_Reprt");

		TestModellerLogger.PassStep(m_Driver, "Click_Unprocessed_Trans_Reprt");
	}

     
	/**
 	 * Click Reports3_menu
     * @name Click Reports3_menu
     */
	public void Click_Reports3_menu()
	{
        
		WebElement elem = getWebElement(Reports3_menuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports3_menu", "Click_Reports3_menu failed. Unable to locate object: " + Reports3_menuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports3_menu", "Click_Reports3_menu failed. Unable to locate object: " + Reports3_menuElem.toString());

			Assert.fail("Unable to locate object: " + Reports3_menuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reports3_menu");

		TestModellerLogger.PassStep(m_Driver, "Click_Reports3_menu");
	}

     
	/**
 	 * Click unprocessed_trns_rpt_link
     * @name Click unprocessed_trns_rpt_link
     */
	public void Click_unprocessed_trns_rpt_link()
	{
        
		WebElement elem = getWebElement(unprocessed_trns_rpt_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_unprocessed_trns_rpt_link", "Click_unprocessed_trns_rpt_link failed. Unable to locate object: " + unprocessed_trns_rpt_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_unprocessed_trns_rpt_link", "Click_unprocessed_trns_rpt_link failed. Unable to locate object: " + unprocessed_trns_rpt_linkElem.toString());

			Assert.fail("Unable to locate object: " + unprocessed_trns_rpt_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_unprocessed_trns_rpt_link");

		TestModellerLogger.PassStep(m_Driver, "Click_unprocessed_trns_rpt_link");
	}
}