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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1e0ddb9f-65d2-471d-ad04-16a0b3ff2b5b
@TestModellerModule(guid = "1e0ddb9f-65d2-471d-ad04-16a0b3ff2b5b")
public class SUPLISTSERACH extends BasePage
{
	public SUPLISTSERACH (WebDriver driver)
	{
		super(driver);
	}


	
	private By Sup_Select_Cat_Elem = By.xpath("//label[normalize-space()= 'Search Category:']/../select");

	private By Enter_Sup_NameElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../div[2]/input");

	private By Sup_Search__btnElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../div[3]/a");

	private By Click_Button_addElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[1]");

	private By Sup_Delete_iconElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[2]");

	private By Download_DumpElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[4]");

	private By Sup_UploadElem = By.xpath("//label[normalize-space()= 'Search Category:']/../../../../../../header/div/a[3]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=116974&CompanyCode=16651");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=116974&CompanyCode=16651");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=116974&CompanyCode=16651");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=116974&CompanyCode=16651";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Supplier.aspx?FYCode=116974&CompanyCode=16651")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Sup_Select_Cat_
     * @name Select Sup_Select_Cat_
     */
    public void Select_Sup_Select_Cat_(String Sup_Select_Cat_)
 	{
 	    
 		WebElement elem = getWebElement(Sup_Select_Cat_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Sup_Select_Cat_", "Select_Sup_Select_Cat_ failed. Unable to locate object: " + Sup_Select_Cat_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Sup_Select_Cat_", "Select_Sup_Select_Cat_ failed. Unable to locate object: " + Sup_Select_Cat_Elem.toString());

 			Assert.fail("Unable to locate object: " + Sup_Select_Cat_Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Sup_Select_Cat_);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Sup_Select_Cat_ " + Sup_Select_Cat_);

 		TestModellerLogger.PassStep(m_Driver, "Select_Sup_Select_Cat_ " + Sup_Select_Cat_);
 	}

      
	/**
 	 * Enter Enter_Sup_Name
     * @name Enter Enter_Sup_Name
     */
 	public void Enter_Enter_Sup_Name(String Enter_Sup_Name)
 	{
 	    
 		WebElement elem = getWebElement(Enter_Sup_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Sup_Name", "Enter_Enter_Sup_Name failed. Unable to locate object: " + Enter_Sup_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Sup_Name", "Enter_Enter_Sup_Name failed. Unable to locate object: " + Enter_Sup_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_Sup_NameElem.toString());
         }

 		elem.sendKeys(Enter_Sup_Name);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Sup_Name " + Enter_Sup_Name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Sup_Name " + Enter_Sup_Name);
 	}

     
	/**
 	 * Click Sup_Search _btn
     * @name Click Sup_Search _btn
     */
	public void Click_Sup_Search__btn()
	{
        
		WebElement elem = getWebElement(Sup_Search__btnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sup_Search__btn", "Click_Sup_Search__btn failed. Unable to locate object: " + Sup_Search__btnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sup_Search__btn", "Click_Sup_Search__btn failed. Unable to locate object: " + Sup_Search__btnElem.toString());

			Assert.fail("Unable to locate object: " + Sup_Search__btnElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sup_Search__btn");

		TestModellerLogger.PassStep(m_Driver, "Click_Sup_Search__btn");
	}

     
	/**
 	 * Click Click_+Button_add
     * @name Click Click_+Button_add
     */
	public void Click_Click_Button_add()
	{
        
		WebElement elem = getWebElement(Click_Button_addElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_Button_add", "Click_Click_Button_add failed. Unable to locate object: " + Click_Button_addElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_Button_add", "Click_Click_Button_add failed. Unable to locate object: " + Click_Button_addElem.toString());

			Assert.fail("Unable to locate object: " + Click_Button_addElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Click_Button_add");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_Button_add");
	}

     
	/**
 	 * Click Sup_Delete_icon
     * @name Click Sup_Delete_icon
     */
	public void Click_Sup_Delete_icon()
	{
        
		WebElement elem = getWebElement(Sup_Delete_iconElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sup_Delete_icon", "Click_Sup_Delete_icon failed. Unable to locate object: " + Sup_Delete_iconElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sup_Delete_icon", "Click_Sup_Delete_icon failed. Unable to locate object: " + Sup_Delete_iconElem.toString());

			Assert.fail("Unable to locate object: " + Sup_Delete_iconElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sup_Delete_icon");

		TestModellerLogger.PassStep(m_Driver, "Click_Sup_Delete_icon");
	}

     
	/**
 	 * Click Download_Dump
     * @name Click Download_Dump
     */
	public void Click_Download_Dump()
	{
        
		WebElement elem = getWebElement(Download_DumpElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Download_Dump", "Click_Download_Dump failed. Unable to locate object: " + Download_DumpElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Download_Dump", "Click_Download_Dump failed. Unable to locate object: " + Download_DumpElem.toString());

			Assert.fail("Unable to locate object: " + Download_DumpElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Download_Dump");

		TestModellerLogger.PassStep(m_Driver, "Click_Download_Dump");
	}

     
	/**
 	 * Click Sup_Upload
     * @name Click Sup_Upload
     */
	public void Click_Sup_Upload()
	{
        
		WebElement elem = getWebElement(Sup_UploadElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sup_Upload", "Click_Sup_Upload failed. Unable to locate object: " + Sup_UploadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sup_Upload", "Click_Sup_Upload failed. Unable to locate object: " + Sup_UploadElem.toString());

			Assert.fail("Unable to locate object: " + Sup_UploadElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sup_Upload");

		TestModellerLogger.PassStep(m_Driver, "Click_Sup_Upload");
	}
}