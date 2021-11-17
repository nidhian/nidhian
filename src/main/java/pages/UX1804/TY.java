package pages.UX1804;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.UX1804.addashboard_5;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/be950487-ba87-4a78-8203-ba79ac84be83
@TestModellerModule(guid = "be950487-ba87-4a78-8203-ba79ac84be83")
public class TY extends BasePage
{
	public TY (WebDriver driver)
	{
		super(driver);
	}


	
	//private By Pr_RptsmenuElem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=52444&CompanyCode=13236']");
	private By Pr_RptsmenuElem=By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a/span");

	private By Profit_LossrptElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[1]/td/a");

	private By Turnover_amtElem = By.xpath("//DIV[contains(text(),'Turnover')]");

	private By verificationamtElem = By.xpath("//*[@id='profitlossdata']/tbody/tr[2]/td[3]");

	private By Filter_DateRangeElem = By.xpath("//label[contains(.,'Date range:')]/../select");

	private By Filter_DateFromElem = By.xpath("//label[contains(.,'Date range:')]/../../div[2]/input");

	private By Filter_ToDateElem = By.xpath("//label[contains(.,'Date range:')]/../../div[3]/input");

	private By PR_Update_CLICKElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$btnSearchByDateRange']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportPLComparison.aspx?FYCode=52444&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportPLComparison.aspx?FYCode=52444&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportPLComparison.aspx?FYCode=52444&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/ReportPLComparison.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/ReportPLComparison.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Pr_Rptsmenu
     * @name Click Pr_Rptsmenu
     */
	public void Click_Pr_Rptsmenu()
	{
        
		WebElement elem = getWebElement(Pr_RptsmenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pr_Rptsmenu", "Click_Pr_Rptsmenu failed. Unable to locate object: " + Pr_RptsmenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pr_Rptsmenu", "Click_Pr_Rptsmenu failed. Unable to locate object: " + Pr_RptsmenuElem.toString());

			Assert.fail("Unable to locate object: " + Pr_RptsmenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pr_Rptsmenu");

		TestModellerLogger.PassStep(m_Driver, "Click_Pr_Rptsmenu");
	}

     
	/**
 	 * Click Profit & Lossrpt
     * @name Click Profit & Lossrpt
     */
	public void Click_Profit_Lossrpt()
	{
        
		WebElement elem = getWebElement(Profit_LossrptElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Profit_Lossrpt", "Click_Profit_Lossrpt failed. Unable to locate object: " + Profit_LossrptElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Profit_Lossrpt", "Click_Profit_Lossrpt failed. Unable to locate object: " + Profit_LossrptElem.toString());

			Assert.fail("Unable to locate object: " + Profit_LossrptElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Profit_Lossrpt");

		TestModellerLogger.PassStep(m_Driver, "Click_Profit_Lossrpt");
	}

     
	/**
 	 * Click Turnover_amt
     * @name Click Turnover_amt
     */
//	public void Click_Turnover_amt()
//	{
//        
//		WebElement elem = getWebElement(Turnover_amtElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Turnover_amt", "Click_Turnover_amt failed. Unable to locate object: " + Turnover_amtElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Turnover_amt", "Click_Turnover_amt failed. Unable to locate object: " + Turnover_amtElem.toString());
//
//			Assert.fail("Unable to locate object: " + Turnover_amtElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Turnover_amt");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Turnover_amt");
//	}

     
  
	/**
 	 * Select Filter_DateRange
     * @name Select Filter_DateRange
     */
    public void Select_Filter_DateRange(String Filter_DateRange)
 	{
 	    
 		WebElement elem = getWebElement(Filter_DateRangeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Filter_DateRange", "Select_Filter_DateRange failed. Unable to locate object: " + Filter_DateRangeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Filter_DateRange", "Select_Filter_DateRange failed. Unable to locate object: " + Filter_DateRangeElem.toString());

 			Assert.fail("Unable to locate object: " + Filter_DateRangeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Filter_DateRange);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Filter_DateRange " + Filter_DateRange);

 		TestModellerLogger.PassStep(m_Driver, "Select_Filter_DateRange " + Filter_DateRange);
 	}

      
	/**
 	 * Enter Filter_DateFrom
     * @name Enter Filter_DateFrom
     */
 	public void Enter_Filter_DateFrom(String Filter_DateFrom)
 	{
 	    
 		WebElement elem = getWebElement(Filter_DateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Filter_DateFrom", "Enter_Filter_DateFrom failed. Unable to locate object: " + Filter_DateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Filter_DateFrom", "Enter_Filter_DateFrom failed. Unable to locate object: " + Filter_DateFromElem.toString());

 			Assert.fail("Unable to locate object: " + Filter_DateFromElem.toString());
         }

 		elem.sendKeys(Filter_DateFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Filter_DateFrom " + Filter_DateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Filter_DateFrom " + Filter_DateFrom);
 	}

      
	/**
 	 * Enter Filter_ToDate
     * @name Enter Filter_ToDate
     */
 	public void Enter_Filter_ToDate(String Filter_ToDate)
 	{
 	    
 		WebElement elem = getWebElement(Filter_ToDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Filter_ToDate", "Enter_Filter_ToDate failed. Unable to locate object: " + Filter_ToDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Filter_ToDate", "Enter_Filter_ToDate failed. Unable to locate object: " + Filter_ToDateElem.toString());

 			Assert.fail("Unable to locate object: " + Filter_ToDateElem.toString());
         }

 		elem.sendKeys(Filter_ToDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Filter_ToDate " + Filter_ToDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Filter_ToDate " + Filter_ToDate);
 	}

     
	/**
 	 * Click PR_Update_CLICK
	 * @throws InterruptedException 
     * @name Click PR_Update_CLICK
     */
	public void Click_PR_Update_CLICK() throws InterruptedException
	{
        
		WebElement elem = getWebElement(PR_Update_CLICKElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PR_Update_CLICK", "Click_PR_Update_CLICK failed. Unable to locate object: " + PR_Update_CLICKElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PR_Update_CLICK", "Click_PR_Update_CLICK failed. Unable to locate object: " + PR_Update_CLICKElem.toString());

			Assert.fail("Unable to locate object: " + PR_Update_CLICKElem.toString());
        }

		elem.click();
          	
		//Thread.sleep(4000);
		
		WebElement rpt=m_Driver.findElement(By.xpath("//*[@id='profitlossdata']/tbody/tr[2]/td[3]"));
		String Dsamt1=rpt.getText();
		String Dsamt=Dsamt1.replace("[£]","");
				//Dsamt1.replaceAll("[^0-9]","");
     	System.out.println("Turnover amt" +Dsamt);
     	     	     	
     	addashboard_5 bn=new addashboard_5(m_Driver);
     	String rptver=bn.amt2();
     	

     	System.out.println("received no from bank ds :" +rptver);
     	
     	SoftAssert st=new SoftAssert();
     	st.assertEquals(rptver, Dsamt);
     	st.assertAll();
		

		ExtentReportManager.passStep(m_Driver, "Click_PR_Update_CLICK");

		TestModellerLogger.PassStep(m_Driver, "Click_PR_Update_CLICK");
	}
	
	
	
	/**
 	 * Click verificationamt
     * @name Click verificationamt
     */
//	public void Click_verificationamt()
//{
//     
//	WebElement elem = getWebElement(verificationamtElem);
////		if (elem == null) {   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_verificationamt", "Click_verificationamt failed. Unable to locate object: " + verificationamtElem.toString());
////   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_verificationamt", "Click_verificationamt failed. Unable to locate object: " + verificationamtElem.toString());
////
////			Assert.fail("Unable to locate object: " + verificationamtElem.toString());
////        }
////		elem.click();
//         	String Dsamt=elem.getText();
//         	System.out.println("Turnover amt" +Dsamt);
//         	
//         	
//         	bank_DB bn=new bank_DB(m_Driver);
//         	String rptver=bn.amtD();
//         	System.out.println("received no from bank ds :" +rptver);
//         	
//         	SoftAssert st=new SoftAssert();
//         	st.assertEquals(rptver, Dsamt);
//         	st.assertAll();
//         	
//
//		ExtentReportManager.passStep(m_Driver, "Click_verificationamt");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_verificationamt");
//	}
}