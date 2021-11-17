package pages.SM311;

import pages.BasePage;
import pages.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/32b8629f-22d2-44d5-91a3-5d79ab6d498c
@TestModellerModule(guid = "32b8629f-22d2-44d5-91a3-5d79ab6d498c")
@Test(dataProvider="getData")
public class sm311 extends BasePage
{
	public sm311 (WebDriver driver)
	{
		super(driver);
	}

///INPUT[@name='ctl00$cPHFilter$txtAccountName']
	
	private By AdvisorToolsToplftElem = By.xpath("//BUTTON[@data-toggle='dropdown']");

	private By NominalCod_linkElem = By.xpath("//A[contains(text(),'Nominal Code')]");
	private By ctl00cPHFilterddAccountTypeElem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddAccountType']");

	private By SearchCode_inputElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtCode']");

	private By Nominalcodename_InputElem = By.xpath("//*[@id='ctl00_cPHFilter_txtAccountName']");

	private By Nominal_Search_btnElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By Pagination_LinkElem = By.xpath("//A[@id='ctl00_cpHFooter_PageUC1_rptrPager_ctl00_lnkPrev']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53516&CompanyCode=14003");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53516&CompanyCode=14003");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53516&CompanyCode=14003");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53516&CompanyCode=14003";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53516&CompanyCode=14003")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click AdvisorTools-Toplft
     * @name Click AdvisorTools-Toplft
     */
	public void Click_AdvisorToolsToplft()
	{
        
		WebElement elem = getWebElement(AdvisorToolsToplftElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AdvisorToolsToplft", "Click_AdvisorToolsToplft failed. Unable to locate object: " + AdvisorToolsToplftElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AdvisorToolsToplft", "Click_AdvisorToolsToplft failed. Unable to locate object: " + AdvisorToolsToplftElem.toString());

			Assert.fail("Unable to locate object: " + AdvisorToolsToplftElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AdvisorToolsToplft");

		TestModellerLogger.PassStep(m_Driver, "Click_AdvisorToolsToplft");
	}

     
	/**
 	 * Click NominalCod_link
	 * @throws InterruptedException 
     * @name Click NominalCod_link
     */
	public void Click_NominalCod_link() throws InterruptedException
	{
        
		WebElement elem = getWebElement(NominalCod_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NominalCod_link", "Click_NominalCod_link failed. Unable to locate object: " + NominalCod_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NominalCod_link", "Click_NominalCod_link failed. Unable to locate object: " + NominalCod_linkElem.toString());

			Assert.fail("Unable to locate object: " + NominalCod_linkElem.toString());
        }

	     	elem.click();

        Library.Switchwindow(3, m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_NominalCod_link");

		TestModellerLogger.PassStep(m_Driver, "Click_NominalCod_link");
	}
}
      
	/**
 	 * Enter SearchCode_input
     * @name Enter SearchCode_input
     */
	/**
 	 * Select ctl00$cPHFilter$ddAccountType
	 * @throws InterruptedException 
     * @name Select ctl00$cPHFilter$ddAccountType
     */
//    public void Select_ctl00cPHFilterddAccountType(String ctl00cPHFilterddAccountType) throws InterruptedException
// 	{
// 	    
// 		WebElement elem = getWebElement(ctl00cPHFilterddAccountTypeElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddAccountType", "Select_ctl00cPHFilterddAccountType failed. Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddAccountType", "Select_ctl00cPHFilterddAccountType failed. Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());
//
// 			Assert.fail("Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());
//         }
//
// 		 Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(ctl00cPHFilterddAccountType);
// 		Thread.sleep(5000);
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHFilterddAccountType " + ctl00cPHFilterddAccountType);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHFilterddAccountType " + ctl00cPHFilterddAccountType);
// 	}
//
// 	public void Enter_SearchCode_input(String SearchCode_input)
// 	{
// 	    
// 		WebElement elem = getWebElement(SearchCode_inputElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCode_input", "Enter_SearchCode_input failed. Unable to locate object: " + SearchCode_inputElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCode_input", "Enter_SearchCode_input failed. Unable to locate object: " + SearchCode_inputElem.toString());
//
// 			Assert.fail("Unable to locate object: " + SearchCode_inputElem.toString());
//         }
//
// 		elem.sendKeys(SearchCode_input);
// 		
// 	
//  		ExtentReportManager.passStep(m_Driver, "Enter_SearchCode_input " + SearchCode_input);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchCode_input " + SearchCode_input);
// 	}
//
//      
//	/**
// 	 * Enter Nominalcodename_Input
//	 * @throws InterruptedException 
//     * @name Enter Nominalcodename_Input
//     */
// 	public void Enter_Nominalcodename_Input(String Nominalcodename_Input) throws InterruptedException
// 	{
// 	    
// 		//WebElement elem = getWebElement(Nominalcodename_InputElem);
////
//// 		if (elem == null) {
////    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Nominalcodename_Input", "Enter_Nominalcodename_Input failed. Unable to locate object: " + Nominalcodename_InputElem.toString());
////
////    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Nominalcodename_Input", "Enter_Nominalcodename_Input failed. Unable to locate object: " + Nominalcodename_InputElem.toString());
////
//// 			Assert.fail("Unable to locate object " + Nominalcodename_InputElem.toString());
////         }
//        
// 		//elem.sendKeys(Nominalcodename_Input);
// 		String code=Nominalcodename_Input;
// 		System.out.print("box2:"   +code);
// 		 m_Driver.findElement(By.xpath("//*[contains(text(),'" +code+ "')]")).click();
// 		 Thread.sleep(5000);
//          //jsExec.executeScript("arguments[0].value='"+Nominalcodename_InputElem +"';",elem);
//       
// 		// m_Driver.findElement(By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']")).click();
// 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Nominalcodename_Input " + Nominalcodename_Input);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Nominalcodename_Input " + Nominalcodename_Input);
// 	}
//
//     
//	/**
// 	 * Click Nominal_Search_btn
//	 * @throws InterruptedException 
//     * @name Click Nominal_Search_btn
//     */
//	public void Click_Nominal_Search_btn() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(Nominal_Search_btnElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nominal_Search_btn", "Click_Nominal_Search_btn failed. Unable to locate object: " + Nominal_Search_btnElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nominal_Search_btn", "Click_Nominal_Search_btn failed. Unable to locate object: " + Nominal_Search_btnElem.toString());
//
//			Assert.fail("Unable to locate object: " + Nominal_Search_btnElem.toString());
//        }
//
//		elem.click();
//          	Thread.sleep(3000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Nominal_Search_btn");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Nominal_Search_btn");
//	}
//
//     
//	/**
// 	 * Click Pagination_Link
//     * @name Click Pagination_Link
//     */
//	public void Click_Pagination_Link()
//	{
//        
//		WebElement elem = getWebElement(Pagination_LinkElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pagination_Link", "Click_Pagination_Link failed. Unable to locate object: " + Pagination_LinkElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pagination_Link", "Click_Pagination_Link failed. Unable to locate object: " + Pagination_LinkElem.toString());
//
//			Assert.fail("Unable to locate object: " + Pagination_LinkElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Pagination_Link");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Pagination_Link");
//	}
//}