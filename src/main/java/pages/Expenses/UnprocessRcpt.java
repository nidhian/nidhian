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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/76c34ca9-e22f-4a1f-80e8-508919e76af6
@TestModellerModule(guid = "76c34ca9-e22f-4a1f-80e8-508919e76af6")
public class UnprocessRcpt extends BasePage
{
	public UnprocessRcpt (WebDriver driver)
	{
		super(driver);
	}


	
	private By Expend_Viewmnu1Elem = By.xpath("//A[@class='text-white el-selection']");

	private By Un_processed_Rcpt2Elem = By.xpath("//A[contains(text(),'Unprocessed Receipts')]");

	private By Upload__Rcpt3Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnUpload']");

	private By FileUpload_4Elem = By.xpath("//label[normalize-space()= 'Receipt:']/../../div[2]/input");

	private By Upload_btn_5_clickElem = By.xpath("//A[@id='ctl00_cphFooter_btnUpload']");

	private By Des_6_RemarkElem = By.xpath("//label[normalize-space()= 'Description:']/../../div[2]/input");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=116994&CompanyCode=16671");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=116994&CompanyCode=16671");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=116994&CompanyCode=16671");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=116994&CompanyCode=16671";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=116994&CompanyCode=16671")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expend_Viewmnu1
     * @name Click Expend_Viewmnu1
     */
	public void Click_Expend_Viewmnu1()
	{
        
		WebElement elem = getWebElement(Expend_Viewmnu1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expend_Viewmnu1", "Click_Expend_Viewmnu1 failed. Unable to locate object: " + Expend_Viewmnu1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expend_Viewmnu1", "Click_Expend_Viewmnu1 failed. Unable to locate object: " + Expend_Viewmnu1Elem.toString());

			Assert.fail("Unable to locate object: " + Expend_Viewmnu1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expend_Viewmnu1");

		TestModellerLogger.PassStep(m_Driver, "Click_Expend_Viewmnu1");
	}

     
	/**
 	 * Click Un_processed_Rcpt2
     * @name Click Un_processed_Rcpt2
     */
	public void Click_Un_processed_Rcpt2()
	{
        
		WebElement elem = getWebElement(Un_processed_Rcpt2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Un_processed_Rcpt2", "Click_Un_processed_Rcpt2 failed. Unable to locate object: " + Un_processed_Rcpt2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Un_processed_Rcpt2", "Click_Un_processed_Rcpt2 failed. Unable to locate object: " + Un_processed_Rcpt2Elem.toString());

			Assert.fail("Unable to locate object: " + Un_processed_Rcpt2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Un_processed_Rcpt2");

		TestModellerLogger.PassStep(m_Driver, "Click_Un_processed_Rcpt2");
	}

     
	/**
 	 * Click Upload _Rcpt3
     * @name Click Upload _Rcpt3
     */
	public void Click_Upload__Rcpt3()
	{
        
		WebElement elem = getWebElement(Upload__Rcpt3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload__Rcpt3", "Click_Upload__Rcpt3 failed. Unable to locate object: " + Upload__Rcpt3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload__Rcpt3", "Click_Upload__Rcpt3 failed. Unable to locate object: " + Upload__Rcpt3Elem.toString());

			Assert.fail("Unable to locate object: " + Upload__Rcpt3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload__Rcpt3");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload__Rcpt3");
	}

      
	/**
 	 * Enter FileUpload_4
     * @name Enter FileUpload_4
     */
 	public void Enter_FileUpload_4(String FileUpload_4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(FileUpload_4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FileUpload_4", "Enter_FileUpload_4 failed. Unable to locate object: " + FileUpload_4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FileUpload_4", "Enter_FileUpload_4 failed. Unable to locate object: " + FileUpload_4Elem.toString());

 			Assert.fail("Unable to locate object: " + FileUpload_4Elem.toString());
         }

 		elem.sendKeys(FileUpload_4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FileUpload_4 " + FileUpload_4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FileUpload_4 " + FileUpload_4);
 	}

     
	/**
 	 * Click Upload_btn_5_click
     * @name Click Upload_btn_5_click
     */
	public void Click_Upload_btn_5_click()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Upload_btn_5_clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_btn_5_click", "Click_Upload_btn_5_click failed. Unable to locate object: " + Upload_btn_5_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_btn_5_click", "Click_Upload_btn_5_click failed. Unable to locate object: " + Upload_btn_5_clickElem.toString());

			Assert.fail("Unable to locate object: " + Upload_btn_5_clickElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_btn_5_click");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_btn_5_click");
	}

      
	/**
 	 * Enter Des_6_Remark
     * @name Enter Des_6_Remark
     */
 	public void Enter_Des_6_Remark(String Des_6_Remark)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Des_6_RemarkElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Des_6_Remark", "Enter_Des_6_Remark failed. Unable to locate object: " + Des_6_RemarkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Des_6_Remark", "Enter_Des_6_Remark failed. Unable to locate object: " + Des_6_RemarkElem.toString());

 			Assert.fail("Unable to locate object: " + Des_6_RemarkElem.toString());
         }

 		elem.sendKeys(Des_6_Remark);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Des_6_Remark " + Des_6_Remark);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Des_6_Remark " + Des_6_Remark);
 	}
}