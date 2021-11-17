package tests.TicketId3821;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6d700a00-b647-46cb-b41a-12e1bb2204a5
@TestModellerModule(guid = "6d700a00-b647-46cb-b41a-12e1bb2204a5")
public class clientbankct extends BasePage
{
	public clientbankct (WebDriver driver)
	{
		super(driver);
	}


	
	private By Reportsmenu_4Elem = By.xpath("//A[@href='AdminReports.aspx']");

	private By Client_Bnk_Act_linkElem = By.xpath("//A[contains(text(),'Client Bank Accounts')]");

	private By Client_Name2Elem = By.xpath("//label[contains(.,'Client Name:')]/../div/input");

	private By Client_Type2Elem = By.xpath("//label[contains(.,'Client Type:')]/../div/select");

	private By Without_FeedsElem = By.xpath("//label[contains(.,'Without Feeds:')]/../div/select");

	private By Unre_TranElem = By.xpath("//label[contains(.,'Unreconciled Transactions:')]/../div/select");

	private By Update_bttnElem = By.xpath("//label[contains(.,'')]/../div/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/ReportClientBankAccounts.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Reportsmenu_4
     * @name Click Reportsmenu_4
     */
	public void Click_Reportsmenu_4()
	{
        
		WebElement elem = getWebElement(Reportsmenu_4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reportsmenu_4", "Click_Reportsmenu_4 failed. Unable to locate object: " + Reportsmenu_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reportsmenu_4", "Click_Reportsmenu_4 failed. Unable to locate object: " + Reportsmenu_4Elem.toString());

			Assert.fail("Unable to locate object: " + Reportsmenu_4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reportsmenu_4");

		TestModellerLogger.PassStep(m_Driver, "Click_Reportsmenu_4");
	}

     
	/**
 	 * Click Client Bnk Act_link
     * @name Click Client Bnk Act_link
     */
	public void Click_Client_Bnk_Act_link()
	{
        
		WebElement elem = getWebElement(Client_Bnk_Act_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Client_Bnk_Act_link", "Click_Client_Bnk_Act_link failed. Unable to locate object: " + Client_Bnk_Act_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Client_Bnk_Act_link", "Click_Client_Bnk_Act_link failed. Unable to locate object: " + Client_Bnk_Act_linkElem.toString());

			Assert.fail("Unable to locate object: " + Client_Bnk_Act_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Client_Bnk_Act_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Client_Bnk_Act_link");
	}

      
	/**
 	 * Enter Client_Name2
     * @name Enter Client_Name2
     */
 	public void Enter_Client_Name2(String Client_Name2)
 	{
 	    
 		WebElement elem = getWebElement(Client_Name2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_Name2", "Enter_Client_Name2 failed. Unable to locate object: " + Client_Name2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_Name2", "Enter_Client_Name2 failed. Unable to locate object: " + Client_Name2Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_Name2Elem.toString());
         }

 		elem.sendKeys(Client_Name2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Name2 " + Client_Name2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Name2 " + Client_Name2);
 	}

    
	/**
 	 * Select Client_Type2
     * @name Select Client_Type2
     */
    public void Select_Client_Type2(String Client_Type2)
 	{
 	    
 		WebElement elem = getWebElement(Client_Type2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Client_Type2", "Select_Client_Type2 failed. Unable to locate object: " + Client_Type2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Client_Type2", "Select_Client_Type2 failed. Unable to locate object: " + Client_Type2Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_Type2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Client_Type2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Client_Type2 " + Client_Type2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Client_Type2 " + Client_Type2);
 	}

    
	/**
 	 * Select Without_Feeds
     * @name Select Without_Feeds
     */
    public void Select_Without_Feeds(String Without_Feeds)
 	{
 	    
 		WebElement elem = getWebElement(Without_FeedsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Without_Feeds", "Select_Without_Feeds failed. Unable to locate object: " + Without_FeedsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Without_Feeds", "Select_Without_Feeds failed. Unable to locate object: " + Without_FeedsElem.toString());

 			Assert.fail("Unable to locate object: " + Without_FeedsElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Without_Feeds);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Without_Feeds " + Without_Feeds);

 		TestModellerLogger.PassStep(m_Driver, "Select_Without_Feeds " + Without_Feeds);
 	}

    
	/**
 	 * Select Unre_Tran
     * @name Select Unre_Tran
     */
    public void Select_Unre_Tran(String Unre_Tran)
 	{
 	    
 		WebElement elem = getWebElement(Unre_TranElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Unre_Tran", "Select_Unre_Tran failed. Unable to locate object: " + Unre_TranElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Unre_Tran", "Select_Unre_Tran failed. Unable to locate object: " + Unre_TranElem.toString());

 			Assert.fail("Unable to locate object: " + Unre_TranElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Unre_Tran);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Unre_Tran " + Unre_Tran);

 		TestModellerLogger.PassStep(m_Driver, "Select_Unre_Tran " + Unre_Tran);
 	}

     
	/**
 	 * Click Update_bttn
     * @name Click Update_bttn
     */
	public void Click_Update_bttn()
	{
        
		WebElement elem = getWebElement(Update_bttnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_bttn", "Click_Update_bttn failed. Unable to locate object: " + Update_bttnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_bttn", "Click_Update_bttn failed. Unable to locate object: " + Update_bttnElem.toString());

			Assert.fail("Unable to locate object: " + Update_bttnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Update_bttn");

		TestModellerLogger.PassStep(m_Driver, "Click_Update_bttn");
	}
}