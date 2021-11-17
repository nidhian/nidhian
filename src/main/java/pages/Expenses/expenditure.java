package pages.Expenses;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c52a1675-eeec-43d9-8e3c-eb3fea504434
@TestModellerModule(guid = "c52a1675-eeec-43d9-8e3c-eb3fea504434")
public class expenditure extends BasePage
{
	public expenditure (WebDriver driver)
	{
		super(driver);
	}


	
	private By View_MenuElem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/a");

	private By Supplier_ListElem = By.xpath("//A[contains(text(),'Supplier List')]");

	private By Use__Home_OfficeElem = By.xpath("//A[contains(text(),'Use of Home as Office')]");

	private By Expense__ReimbursementElem = By.xpath("//A[contains(text(),'Expense Reimbursement')]");

	private By Processed_ReceiptsElem = By.xpath("//A[contains(text(),'Processed Receipts')]");

	private By Unprocessed_ReceiptsElem = By.xpath("//A[contains(text(),'Unprocessed Receipts')]");

	private By Ledger_ReconciliationElem = By.xpath("//A[@class='el-selection']");

	private By link2Elem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=116974&CompanyCode=16651']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100960");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100960");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100960");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100960";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100960")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click View_Menu
     * @name Click View_Menu
     */
	public void Click_View_Menu()
	{
        
		WebElement elem = getWebElement(View_MenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_Menu", "Click_View_Menu failed. Unable to locate object: " + View_MenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_Menu", "Click_View_Menu failed. Unable to locate object: " + View_MenuElem.toString());

			Assert.fail("Unable to locate object: " + View_MenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_Menu");

		TestModellerLogger.PassStep(m_Driver, "Click_View_Menu");
	}

     
	/**
 	 * Click Supplier_List
     * @name Click Supplier_List
     */
	public void Click_Supplier_List()
	{
        
		WebElement elem = getWebElement(Supplier_ListElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Supplier_List", "Click_Supplier_List failed. Unable to locate object: " + Supplier_ListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Supplier_List", "Click_Supplier_List failed. Unable to locate object: " + Supplier_ListElem.toString());

			Assert.fail("Unable to locate object: " + Supplier_ListElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Supplier_List");

		TestModellerLogger.PassStep(m_Driver, "Click_Supplier_List");
	}

     
	/**
 	 * Click Use_ Home_Office
     * @name Click Use_ Home_Office
     */
	public void Click_Use__Home_Office()
	{
        
		WebElement elem = getWebElement(Use__Home_OfficeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Use__Home_Office", "Click_Use__Home_Office failed. Unable to locate object: " + Use__Home_OfficeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Use__Home_Office", "Click_Use__Home_Office failed. Unable to locate object: " + Use__Home_OfficeElem.toString());

			Assert.fail("Unable to locate object: " + Use__Home_OfficeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Use__Home_Office");

		TestModellerLogger.PassStep(m_Driver, "Click_Use__Home_Office");
	}

     
	/**
 	 * Click Expense _Reimbursement
     * @name Click Expense _Reimbursement
     */
	public void Click_Expense__Reimbursement()
	{
        
		WebElement elem = getWebElement(Expense__ReimbursementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expense__Reimbursement", "Click_Expense__Reimbursement failed. Unable to locate object: " + Expense__ReimbursementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expense__Reimbursement", "Click_Expense__Reimbursement failed. Unable to locate object: " + Expense__ReimbursementElem.toString());

			Assert.fail("Unable to locate object: " + Expense__ReimbursementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expense__Reimbursement");

		TestModellerLogger.PassStep(m_Driver, "Click_Expense__Reimbursement");
	}

     
	/**
 	 * Click Processed_Receipts
     * @name Click Processed_Receipts
     */
	public void Click_Processed_Receipts()
	{
        
		WebElement elem = getWebElement(Processed_ReceiptsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Processed_Receipts", "Click_Processed_Receipts failed. Unable to locate object: " + Processed_ReceiptsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Processed_Receipts", "Click_Processed_Receipts failed. Unable to locate object: " + Processed_ReceiptsElem.toString());

			Assert.fail("Unable to locate object: " + Processed_ReceiptsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Processed_Receipts");

		TestModellerLogger.PassStep(m_Driver, "Click_Processed_Receipts");
	}

     
	/**
 	 * Click Unprocessed_Receipts
     * @name Click Unprocessed_Receipts
     */
	public void Click_Unprocessed_Receipts()
	{
        
		WebElement elem = getWebElement(Unprocessed_ReceiptsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unprocessed_Receipts", "Click_Unprocessed_Receipts failed. Unable to locate object: " + Unprocessed_ReceiptsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unprocessed_Receipts", "Click_Unprocessed_Receipts failed. Unable to locate object: " + Unprocessed_ReceiptsElem.toString());

			Assert.fail("Unable to locate object: " + Unprocessed_ReceiptsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Unprocessed_Receipts");

		TestModellerLogger.PassStep(m_Driver, "Click_Unprocessed_Receipts");
	}

     
	/**
 	 * Click Ledger_Reconciliation
     * @name Click Ledger_Reconciliation
     */
	public void Click_Ledger_Reconciliation()
	{
        
		WebElement elem = getWebElement(Ledger_ReconciliationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ledger_Reconciliation", "Click_Ledger_Reconciliation failed. Unable to locate object: " + Ledger_ReconciliationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ledger_Reconciliation", "Click_Ledger_Reconciliation failed. Unable to locate object: " + Ledger_ReconciliationElem.toString());

			Assert.fail("Unable to locate object: " + Ledger_ReconciliationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Ledger_Reconciliation");

		TestModellerLogger.PassStep(m_Driver, "Click_Ledger_Reconciliation");
	}

     
	/**
 	 * Click link2
     * @name Click link2
     */
	public void Click_link2()
	{
        
		WebElement elem = getWebElement(link2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_link2", "Click_link2 failed. Unable to locate object: " + link2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_link2", "Click_link2 failed. Unable to locate object: " + link2Elem.toString());

			Assert.fail("Unable to locate object: " + link2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_link2");

		TestModellerLogger.PassStep(m_Driver, "Click_link2");
	}
}