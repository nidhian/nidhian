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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d7a05ca1-6684-4f0c-8f54-60cc2421f3b4
@TestModellerModule(guid = "d7a05ca1-6684-4f0c-8f54-60cc2421f3b4")
public class withoutuser extends BasePage
{
	public withoutuser (WebDriver driver)
	{
		super(driver);
	}


	
	private By Agent_ReportsElem = By.xpath("//A[@href='AdminReports.aspx']");

	private By Businesses__without__usersElem = By.xpath("//A[contains(text(),'Businesses without users')]");

	private By Client_Name1Elem = By.xpath("//label[contains(.,'Total Users:')]/../div/input");

	private By Search__btnnElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By user_countElem = By.xpath("//INPUT[@type='text']");

	private By _SaveElem = By.xpath("//BUTTON[contains(text(),'Save')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100733");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100733");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100733");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100733";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100733")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Agent_Reports
     * @name Click Agent_Reports
     */
	public void Click_Agent_Reports()
	{
        
		WebElement elem = getWebElement(Agent_ReportsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agent_Reports", "Click_Agent_Reports failed. Unable to locate object: " + Agent_ReportsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agent_Reports", "Click_Agent_Reports failed. Unable to locate object: " + Agent_ReportsElem.toString());

			Assert.fail("Unable to locate object: " + Agent_ReportsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Agent_Reports");

		TestModellerLogger.PassStep(m_Driver, "Click_Agent_Reports");
	}

     
	/**
 	 * Click Businesses_ without_ users
     * @name Click Businesses_ without_ users
     */
	public void Click_Businesses__without__users()
	{
        
		WebElement elem = getWebElement(Businesses__without__usersElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Businesses__without__users", "Click_Businesses__without__users failed. Unable to locate object: " + Businesses__without__usersElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Businesses__without__users", "Click_Businesses__without__users failed. Unable to locate object: " + Businesses__without__usersElem.toString());

			Assert.fail("Unable to locate object: " + Businesses__without__usersElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Businesses__without__users");

		TestModellerLogger.PassStep(m_Driver, "Click_Businesses__without__users");
	}

      
	/**
 	 * Enter Client_Name1
     * @name Enter Client_Name1
     */
 	public void Enter_Client_Name1(String Client_Name1)
 	{
 	    
 		WebElement elem = getWebElement(Client_Name1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_Name1", "Enter_Client_Name1 failed. Unable to locate object: " + Client_Name1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_Name1", "Enter_Client_Name1 failed. Unable to locate object: " + Client_Name1Elem.toString());

 			Assert.fail("Unable to locate object: " + Client_Name1Elem.toString());
         }

 		elem.sendKeys(Client_Name1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Name1 " + Client_Name1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Name1 " + Client_Name1);
 	}

     
	/**
 	 * Click Search _btnn
     * @name Click Search _btnn
     */
	public void Click_Search__btnn()
	{
        
		WebElement elem = getWebElement(Search__btnnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search__btnn", "Click_Search__btnn failed. Unable to locate object: " + Search__btnnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search__btnn", "Click_Search__btnn failed. Unable to locate object: " + Search__btnnElem.toString());

			Assert.fail("Unable to locate object: " + Search__btnnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search__btnn");

		TestModellerLogger.PassStep(m_Driver, "Click_Search__btnn");
	}

      
	/**
 	 * Enter user_count
     * @name Enter user_count
     */
 	public void Enter_user_count(String user_count)
 	{
 	    
 		WebElement elem = getWebElement(user_countElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_user_count", "Enter_user_count failed. Unable to locate object: " + user_countElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_user_count", "Enter_user_count failed. Unable to locate object: " + user_countElem.toString());

 			Assert.fail("Unable to locate object: " + user_countElem.toString());
         }

 		elem.sendKeys(user_count);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_user_count " + user_count);

  		TestModellerLogger.PassStep(m_Driver, "Enter_user_count " + user_count);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}
}