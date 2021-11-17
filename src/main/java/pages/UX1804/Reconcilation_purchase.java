package pages.UX1804;

import pages.BasePage;
import pages.Library;
import pages.UX1804.addashboard_4;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ae1a1fe9-2c6b-4b2b-9008-59046981bac7
@TestModellerModule(guid = "ae1a1fe9-2c6b-4b2b-9008-59046981bac7")
public class Reconcilation_purchase extends BasePage
{
	public Reconcilation_purchase (WebDriver driver)
	{
		super(driver);
	}

	private By AcntantleftmenuElem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");

	private By Reconcilationlink1Elem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[1]/tbody/tr/td/a");

	private By plussignElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div/table[1]/thead/tr/td/table[2]/tbody/tr/td/a");

	private By SelectAccountType1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");

	private By SelectAccount1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccount']");



	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Acntantleftmenu
     * @name Click Acntantleftmenu
     */
//	public void Click_Acntantleftmenu()
//	{
//        
//		WebElement elem = getWebElement(AcntantleftmenuElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Acntantleftmenu", "Click_Acntantleftmenu failed. Unable to locate object: " + AcntantleftmenuElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Acntantleftmenu", "Click_Acntantleftmenu failed. Unable to locate object: " + AcntantleftmenuElem.toString());
//
//			Assert.fail("Unable to locate object: " + AcntantleftmenuElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Acntantleftmenu");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Acntantleftmenu");
//	}

     
	/**
 	 * Click Reconcilationlink1
	 * @throws InterruptedException 
     * @name Click Reconcilationlink1
     */
//	public void Click_Reconcilationlink1() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(Reconcilationlink1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Reconcilationlink1Elem.toString());
//        }
//
//		elem.click();
//		Thread.sleep(2000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Reconcilationlink1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Reconcilationlink1");
//	}

     
	/**
 	 * Click plussign
	 * @throws InterruptedException 
     * @name Click plussign
     */
//	public void Click_plussign() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(plussignElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());
//
//			Assert.fail("Unable to locate object: " + plussignElem.toString());
//        }
//
//		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
//		jse.executeScript("arguments[0].click()", elem);
//		Library.tabswitch1(m_Driver);
//
//	ExtentReportManager.passStep(m_Driver, "Click_plussign");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_plussign");
//	}

    
	/**
 	 * Select SelectAccountType1
	 * @throws IOException 
     * @name Select SelectAccountType1
     */
    public void Select_SelectAccountType1(String SelectAccountType1) throws IOException
 	{
 	    
 		WebElement elem = getWebElement(SelectAccountType1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccountType1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectAccountType1);
 		
		GetScreenShot.captureAsImage(m_Driver,"nreconcilledpurchase");
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);
 	}

    
	/**
 	 * Select SelectAccount1
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Select SelectAccount1
     */
    public void Select_SelectAccount1(String SelectAccount1) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(SelectAccount1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccount1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectAccount1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);
 		Thread.sleep(1000);
 	
 GetScreenShot.captureAsImage(m_Driver, SelectAccount1);
//              addashboard_3 ds=new addashboard_3(m_Driver);
// 		       String sp=ds.purchaseaccount();
// 		        
// 		         System.out.println("purschasedamount in dashboard is :" +sp);                        
//WebElement y=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rowReconcilePendingSummary']/td/table/tfoot/tr/td[4]"));
//String debit=y.getText();
//   WebElement y2=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rowReconcilePendingSummary']/td/table/tfoot/tr/td[6]"));
// String credit=y2.getText();
// Assert.assertEquals(debit, sp,"debit amoutn assertion");
// 
// Assert.assertEquals(credit,sp,"credit amoutn assertion");
 
 
 
 		
 	}

     
	/**
 	 * Click View Reconciled button1
     * @name Click View Reconciled button1
     */

}