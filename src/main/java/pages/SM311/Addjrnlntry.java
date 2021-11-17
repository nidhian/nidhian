package pages.SM311;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b1017ede-c722-4bfd-b5ab-4fd10a264978
@TestModellerModule(guid = "b1017ede-c722-4bfd-b5ab-4fd10a264978")
public class Addjrnlntry extends BasePage
{
	public Addjrnlntry (WebDriver driver)
	{
		super(driver);
	}


	
	private By Add_Jrnl_entry_dte1Elem = By.xpath("//label[normalize-space()= 'Date:']/../div/input");

	private By Rvrse_Date2Elem = By.xpath("//label[normalize-space()= 'Reverse Date(Optional):']/../div/input");

	private By Currency_drpdwnElem = By.xpath("//label[normalize-space()= 'Currency:']/../div/select");

	private By jrnl_ntry_DesElem = By.xpath("//label[normalize-space()= 'Description:']/../div/input");

	private By jrnl_ntry_Debit_act_codeElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");

	private By jrnl_ntry_DebitElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDebit']");

	private By jrnl_ntry_CreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtCredit']");

	private By jrnl_ntry_NoteElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtNote']");

	private By jrnl_ntry_SaveElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By jrnl_ntry_Debit_CancelElem = By.xpath("//A[@id='ctl00_cphFooter_btnCancelmodal']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1&AdvanceSearch");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1&AdvanceSearch");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1&AdvanceSearch");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1&AdvanceSearch";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Journal.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1&AdvanceSearch")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Add_Jrnl_entry_dte1
     * @name Enter Add_Jrnl_entry_dte1
     */
 	public void Enter_Add_Jrnl_entry_dte1(String Add_Jrnl_entry_dte1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Add_Jrnl_entry_dte1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Add_Jrnl_entry_dte1", "Enter_Add_Jrnl_entry_dte1 failed. Unable to locate object: " + Add_Jrnl_entry_dte1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Add_Jrnl_entry_dte1", "Enter_Add_Jrnl_entry_dte1 failed. Unable to locate object: " + Add_Jrnl_entry_dte1Elem.toString());

 			Assert.fail("Unable to locate object: " + Add_Jrnl_entry_dte1Elem.toString());
         }

 		elem.sendKeys(Add_Jrnl_entry_dte1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Add_Jrnl_entry_dte1 " + Add_Jrnl_entry_dte1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Add_Jrnl_entry_dte1 " + Add_Jrnl_entry_dte1);
 	}

      
	/**
 	 * Enter Rvrse_Date2
     * @name Enter Rvrse_Date2
     */
 	public void Enter_Rvrse_Date2(String Rvrse_Date2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Rvrse_Date2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Rvrse_Date2", "Enter_Rvrse_Date2 failed. Unable to locate object: " + Rvrse_Date2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Rvrse_Date2", "Enter_Rvrse_Date2 failed. Unable to locate object: " + Rvrse_Date2Elem.toString());

 			Assert.fail("Unable to locate object: " + Rvrse_Date2Elem.toString());
         }

 		elem.sendKeys(Rvrse_Date2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Rvrse_Date2 " + Rvrse_Date2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Rvrse_Date2 " + Rvrse_Date2);
 	}

    
	/**
 	 * Select Currency_drpdwn
     * @name Select Currency_drpdwn
     */
    public void Select_Currency_drpdwn(String Currency_drpdwn)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Currency_drpdwnElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Currency_drpdwn", "Select_Currency_drpdwn failed. Unable to locate object: " + Currency_drpdwnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Currency_drpdwn", "Select_Currency_drpdwn failed. Unable to locate object: " + Currency_drpdwnElem.toString());

 			Assert.fail("Unable to locate object: " + Currency_drpdwnElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Currency_drpdwn);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Currency_drpdwn " + Currency_drpdwn);

 		TestModellerLogger.PassStep(m_Driver, "Select_Currency_drpdwn " + Currency_drpdwn);
 	}

      
	/**
 	 * Enter jrnl_ntry_Des
     * @name Enter jrnl_ntry_Des
     */
 	public void Enter_jrnl_ntry_Des(String jrnl_ntry_Des)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(jrnl_ntry_DesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Des", "Enter_jrnl_ntry_Des failed. Unable to locate object: " + jrnl_ntry_DesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Des", "Enter_jrnl_ntry_Des failed. Unable to locate object: " + jrnl_ntry_DesElem.toString());

 			Assert.fail("Unable to locate object: " + jrnl_ntry_DesElem.toString());
         }

 		elem.sendKeys(jrnl_ntry_Des);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_jrnl_ntry_Des " + jrnl_ntry_Des);

  		TestModellerLogger.PassStep(m_Driver, "Enter_jrnl_ntry_Des " + jrnl_ntry_Des);
 	}

     
	/**
 	 * Click jrnl_ntry_Debit_act_code
     * @name Click jrnl_ntry_Debit_act_code
     */
	public void Click_jrnl_ntry_Debit_act_code()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(jrnl_ntry_Debit_act_codeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Debit_act_code", "Click_jrnl_ntry_Debit_act_code failed. Unable to locate object: " + jrnl_ntry_Debit_act_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Debit_act_code", "Click_jrnl_ntry_Debit_act_code failed. Unable to locate object: " + jrnl_ntry_Debit_act_codeElem.toString());

			Assert.fail("Unable to locate object: " + jrnl_ntry_Debit_act_codeElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_jrnl_ntry_Debit_act_code");

		TestModellerLogger.PassStep(m_Driver, "Click_jrnl_ntry_Debit_act_code");
	}

      
	/**
 	 * Enter jrnl_ntry_Debit
     * @name Enter jrnl_ntry_Debit
     */
 	public void Enter_jrnl_ntry_Debit(String jrnl_ntry_Debit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(jrnl_ntry_DebitElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Debit", "Enter_jrnl_ntry_Debit failed. Unable to locate object: " + jrnl_ntry_DebitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Debit", "Enter_jrnl_ntry_Debit failed. Unable to locate object: " + jrnl_ntry_DebitElem.toString());

 			Assert.fail("Unable to locate object: " + jrnl_ntry_DebitElem.toString());
         }

 		elem.sendKeys(jrnl_ntry_Debit);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_jrnl_ntry_Debit " + jrnl_ntry_Debit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_jrnl_ntry_Debit " + jrnl_ntry_Debit);
 	}

      
	/**
 	 * Enter jrnl_ntry_Credit
     * @name Enter jrnl_ntry_Credit
     */
 	public void Enter_jrnl_ntry_Credit(String jrnl_ntry_Credit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(jrnl_ntry_CreditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Credit", "Enter_jrnl_ntry_Credit failed. Unable to locate object: " + jrnl_ntry_CreditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Credit", "Enter_jrnl_ntry_Credit failed. Unable to locate object: " + jrnl_ntry_CreditElem.toString());

 			Assert.fail("Unable to locate object: " + jrnl_ntry_CreditElem.toString());
         }

 		elem.sendKeys(jrnl_ntry_Credit);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_jrnl_ntry_Credit " + jrnl_ntry_Credit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_jrnl_ntry_Credit " + jrnl_ntry_Credit);
 	}

      
	/**
 	 * Enter jrnl_ntry_Note
     * @name Enter jrnl_ntry_Note
     */
 	public void Enter_jrnl_ntry_Note(String jrnl_ntry_Note)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(jrnl_ntry_NoteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Note", "Enter_jrnl_ntry_Note failed. Unable to locate object: " + jrnl_ntry_NoteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_jrnl_ntry_Note", "Enter_jrnl_ntry_Note failed. Unable to locate object: " + jrnl_ntry_NoteElem.toString());

 			Assert.fail("Unable to locate object: " + jrnl_ntry_NoteElem.toString());
         }

 		elem.sendKeys(jrnl_ntry_Note);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_jrnl_ntry_Note " + jrnl_ntry_Note);

  		TestModellerLogger.PassStep(m_Driver, "Enter_jrnl_ntry_Note " + jrnl_ntry_Note);
 	}

     
	/**
 	 * Click jrnl_ntry_Save
     * @name Click jrnl_ntry_Save
     */
	public void Click_jrnl_ntry_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(jrnl_ntry_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Save", "Click_jrnl_ntry_Save failed. Unable to locate object: " + jrnl_ntry_SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Save", "Click_jrnl_ntry_Save failed. Unable to locate object: " + jrnl_ntry_SaveElem.toString());

			Assert.fail("Unable to locate object: " + jrnl_ntry_SaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_jrnl_ntry_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_jrnl_ntry_Save");
	}

     
	/**
 	 * Click jrnl_ntry_Debit_Cancel
     * @name Click jrnl_ntry_Debit_Cancel
     */
	public void Click_jrnl_ntry_Debit_Cancel()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[2]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(jrnl_ntry_Debit_CancelElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Debit_Cancel", "Click_jrnl_ntry_Debit_Cancel failed. Unable to locate object: " + jrnl_ntry_Debit_CancelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_jrnl_ntry_Debit_Cancel", "Click_jrnl_ntry_Debit_Cancel failed. Unable to locate object: " + jrnl_ntry_Debit_CancelElem.toString());

			Assert.fail("Unable to locate object: " + jrnl_ntry_Debit_CancelElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_jrnl_ntry_Debit_Cancel");

		TestModellerLogger.PassStep(m_Driver, "Click_jrnl_ntry_Debit_Cancel");
	}
}