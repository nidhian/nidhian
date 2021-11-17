package pages.UX1804;

import pages.BasePage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.IntList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class bank_Verification extends BasePage
{ 
	
	
public static String bnkd2;
	public bank_Verification (WebDriver driver)
	{
		super(driver);
	}

	//*[@id="ctl00_divSubContent"]/div[9]/div[2]/div[2]
 
 private By BankingdashElem = By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[2]/div[2]");
	//private By BK_SELECTElem = By.xpath("//*[@id='ctl00_cPH_ddlAccount']");
	private By bnk_selection_dashElem =By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[2]/div[2]/div[1]/div[1]/div[2]/select");
			//By.xpath("//*[@id='ctl00_cPH_ddlBank']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

   //
     
	/**
 	 * Click Bankingdash
     * @name Click Bankingdash
     */
	public void Click_Bankingdash()
	{
        
		WebElement elem = getWebElement(BankingdashElem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bankingdash", "Click_Bankingdash failed. Unable to locate object: " + BankingdashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bankingdash", "Click_Bankingdash failed. Unable to locate object: " + BankingdashElem.toString());
//
//			Assert.fail("Unable to locate object: " + BankingdashElem.toString());
       // }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bankingdash");

		TestModellerLogger.PassStep(m_Driver, "Click_Bankingdash");
	}

    
	/**
 	 * Select bnk_selection_dash
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select bnk_selection_dash
     */
  public void Select_bnk_selection_dash(String bnk_selection_dash) throws InterruptedException, IOException
 	{
    
	WebElement elem = getWebElement(bnk_selection_dashElem);
//	if (elem == null) {
//  		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_bnk_selection_dash", "Select_bnk_selection_dash failed. Unable to locate object: " + bnk_selection_dashElem.toString());
//
//   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_bnk_selection_dash", "Select_bnk_selection_dash failed. Unable to locate object: " + bnk_selection_dashElem.toString());
//		Assert.fail("Unable to locate object: " + bnk_selection_dashElem.toString());
       
 		    Select dropdown = new Select(elem);
 	
 			dropdown.selectByVisibleText(bnk_selection_dash);
 			elem.sendKeys(Keys.ENTER);
 			Thread.sleep(3000);
 			WebElement bnkd=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_UpdatePanel2']/div[3]/div/h1/strong"));
 		
 			GetScreenShot.captureAsImage(m_Driver, bnk_selection_dash);
	
	}
 			
 	


}
 	
