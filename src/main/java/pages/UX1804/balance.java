package pages.UX1804;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7a827742-3412-4303-971d-db75c3c5b083
@TestModellerModule(guid = "7a827742-3412-4303-971d-db75c3c5b083")
public class balance extends BasePage
{
	 public static String dsbr;
	public balance (WebDriver driver)
	{
		super(driver);
		//
	}	private By ctl00ddlFinancialYearElem = By.xpath("//*[@id='ctl00_ddlFinancialYear']");

	private By Reports_menu2Elem = By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a/span");

	private By Balance_ReportElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[2]/td/a");


	private By AsofElem = By.xpath("//label[contains(.,'As of:')]/../select");

	private By Asof_DateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By Update_btn_balanceElem = By.xpath("//*[@id='ctl00_cPHFilter_btnSearchResult']");

	//private By Capital_ReserveamtElem = By.xpath("//TD[contains(text(),'(4,808,132.42)')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=52444&CompanyCode=13236";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportBalanceSheet.aspx?FYCode=52444&CompanyCode=13236")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Balance_Report
     * @name Click Balance_Report
     */
	public void Click_Balance_Report()
	{
        
		WebElement elem = getWebElement(Balance_ReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Balance_Report", "Click_Balance_Report failed. Unable to locate object: " + Balance_ReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Balance_Report", "Click_Balance_Report failed. Unable to locate object: " + Balance_ReportElem.toString());

			Assert.fail("Unable to locate object: " + Balance_ReportElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Balance_Report");

		TestModellerLogger.PassStep(m_Driver, "Click_Balance_Report");
	}

    
	/**
 	 * Select Asof
     * @name Select Asof
     */
	
	public void Click_Reports_menu2()
	{
        
		WebElement elem = getWebElement(Reports_menu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports_menu2", "Click_Reports_menu2 failed. Unable to locate object: " + Reports_menu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports_menu2", "Click_Reports_menu2 failed. Unable to locate object: " + Reports_menu2Elem.toString());

			Assert.fail("Unable to locate object: " + Reports_menu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Reports_menu2");

		TestModellerLogger.PassStep(m_Driver, "Click_Reports_menu2");
	}
    public void Select_Asof(String Asof)
 	{
 	    
 		WebElement elem = getWebElement(AsofElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Asof", "Select_Asof failed. Unable to locate object: " + AsofElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Asof", "Select_Asof failed. Unable to locate object: " + AsofElem.toString());

 			Assert.fail("Unable to locate object: " + AsofElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Asof);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Asof " + Asof);

 		TestModellerLogger.PassStep(m_Driver, "Select_Asof " + Asof);
 	}

      
	/**
 	 * Enter Asof_DateTo
     * @name Enter Asof_DateTo
     */
 	public void Enter_Asof_DateTo(String Asof_DateTo)
 	{
 	    
 		WebElement elem = getWebElement(Asof_DateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Asof_DateTo", "Enter_Asof_DateTo failed. Unable to locate object: " + Asof_DateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Asof_DateTo", "Enter_Asof_DateTo failed. Unable to locate object: " + Asof_DateToElem.toString());

 			Assert.fail("Unable to locate object: " + Asof_DateToElem.toString());
         }
 		System.out.println("okay");
 		elem.sendKeys(Asof_DateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Asof_DateTo " + Asof_DateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Asof_DateTo " + Asof_DateTo);
 	}

     
	/**
 	 * Click Update_btn_balance
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Update_btn_balance
     */
	public void Click_Update_btn_balance() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(Update_btn_balanceElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update_btn_balance", "Click_Update_btn_balance failed. Unable to locate object: " + Update_btn_balanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update_btn_balance", "Click_Update_btn_balance failed. Unable to locate object: " + Update_btn_balanceElem.toString());

			Assert.fail("Unable to locate object: " + Update_btn_balanceElem.toString());
        }
		System.out.println("okay");

	  jsExec.executeScript("arguments[0].click();",elem);
		
		
		  jsExec.executeScript("arguments[0].scrollIntoView(true);", m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div/div/table/tbody/tr[48]/td[3]")));
          	//String CapRes=m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div/div/div/table/tbody/tr[48]/td[3]")).getText();
		  String CapRes=m_Driver.findElement(By.xpath("//*[@id='plprofit_table_wrap1']/div/div/div/div/table/tbody/tr[51]/td[3]")).getText();
       String capresamt=CapRes.replace("[£]","");
  
       GetScreenShot.captureAsImage(m_Driver, capresamt);
       System.out.println("balance report data :" +capresamt);
       addashboard_Report_balance rp=new addashboard_Report_balance (m_Driver);
       dsbr=rp.rtt();
       
       SoftAssert sf=new SoftAssert();
       sf.assertEquals(capresamt, dsbr);
       sf.assertAll();
//		ExtentReportManager.passStep(m_Driver, "Click_Update_btn_balance");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Update_btn_balance");
	}
}

	/**
 	 * Click Capital_Reserveamt
     * @name Click Capital_Reserveamt
     */
//	public void Click_Capital_Reserveamt()
//	{
//        
////		WebElement elem = getWebElement(Capital_ReserveamtElem);
////
////		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Capital_Reserveamt", "Click_Capital_Reserveamt failed. Unable to locate object: " + Capital_ReserveamtElem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Capital_Reserveamt", "Click_Capital_Reserveamt failed. Unable to locate object: " + Capital_ReserveamtElem.toString());
////
////			Assert.fail("Unable to locate object: " + Capital_ReserveamtElem.toString());
////        }
////
////		elem.click();
////          	
////
////		ExtentReportManager.passStep(m_Driver, "Click_Capital_Reserveamt");
////
////		TestModellerLogger.PassStep(m_Driver, "Click_Capital_Reserveamt");
//	}
//}