package pages;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6f094277-a2a7-4d02-8ac0-28c4c0ab4600
@TestModellerModule(guid = "6f094277-a2a7-4d02-8ac0-28c4c0ab4600")
public class reconfndsearchpop extends BasePage
{
	public reconfndsearchpop (WebDriver driver)
	{
		super(driver);
	}


	
	private By Click__chk_box1Elem = By.xpath("//INPUT[@id='ctl00_cPH_rptrFindMatch_ctl48_chkSelect']");

	private By Select_ReconcileType1_dropdownElem = By.xpath("//label[normalize-space()= 'Reconcile Type']/../../div[2]/select");

	private By Reconcile_btn12Elem = By.xpath("//A[@id='ctl00_cphFooter_btnReconcile']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&ItemsPerPageFstReq=1&vATReturnCodeM=0&VATReturnActionM=&fychanged=t")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Click _chk_box1
     * @name Click Click _chk_box1
     */
	public void Click_Click__chk_box1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Click__chk_box1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click__chk_box1", "Click_Click__chk_box1 failed. Unable to locate object: " + Click__chk_box1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click__chk_box1", "Click_Click__chk_box1 failed. Unable to locate object: " + Click__chk_box1Elem.toString());

			Assert.fail("Unable to locate object: " + Click__chk_box1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Click__chk_box1");

		TestModellerLogger.PassStep(m_Driver, "Click_Click__chk_box1");
	}

    
	/**
 	 * Select Select_ReconcileType1_dropdown
     * @name Select Select_ReconcileType1_dropdown
     */
    public void Select_Select_ReconcileType1_dropdown(String Select_ReconcileType1_dropdown)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_ReconcileType1_dropdownElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_ReconcileType1_dropdown", "Select_Select_ReconcileType1_dropdown failed. Unable to locate object: " + Select_ReconcileType1_dropdownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_ReconcileType1_dropdown", "Select_Select_ReconcileType1_dropdown failed. Unable to locate object: " + Select_ReconcileType1_dropdownElem.toString());

 			Assert.fail("Unable to locate object: " + Select_ReconcileType1_dropdownElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_ReconcileType1_dropdown);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_ReconcileType1_dropdown " + Select_ReconcileType1_dropdown);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_ReconcileType1_dropdown " + Select_ReconcileType1_dropdown);
 	}

     
	/**
 	 * Click Reconcile_btn12
     * @name Click Reconcile_btn12
     */
	public void Click_Reconcile_btn12()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Reconcile_btn12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcile_btn12", "Click_Reconcile_btn12 failed. Unable to locate object: " + Reconcile_btn12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcile_btn12", "Click_Reconcile_btn12 failed. Unable to locate object: " + Reconcile_btn12Elem.toString());

			Assert.fail("Unable to locate object: " + Reconcile_btn12Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Reconcile_btn12");

		TestModellerLogger.PassStep(m_Driver, "Click_Reconcile_btn12");
	}
}