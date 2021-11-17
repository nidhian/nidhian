package pages.UX1804;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b99fe5a1-2c0e-47a6-9b38-8225dfbf46f4
@TestModellerModule(guid = "b99fe5a1-2c0e-47a6-9b38-8225dfbf46f4")
public class Rpt_Director_Bal extends BasePage
{
	public Rpt_Director_Bal (WebDriver driver)
	{
		super(driver);
	}
//////SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']

	
	private By Reports_menu2Elem = By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a/span");

	private By Ledger_rptElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[4]/td/a");

	private By Act_type2exElem = By.xpath("//label[contains(.,'Account Type:')]/../div/select");

	
	private By option1Elem = By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']");


	private By option2Elem = By.xpath("/html/body/span/span/span[1]/input");

	private By Date_range_LElem = By.xpath("//label[contains(.,'Date Range:')]/../div/select");

	private By dt_frmElem = By.xpath("//label[contains(.,'To:')]/../input[1]");

	private By dt_toElem = By.xpath("//label[contains(.,'To:')]/../input[2]");

	private By Ledger_Reconcile_2Elem = By.xpath("//label[contains(.,'Ledger Reconcile:')]/../div/select");

	private By Search_cat_1Elem = By.xpath("//label[contains(.,'Search Category:')]/../div/select");

	private By Update__btn1Elem = By.xpath("//A[contains(text(),'Update')]");
     ////*[@id="ctl00_cpHFooter_PageUC1_rptrPager_ctl06_liContainer"]/a
	private By pagination_1Elem = By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/ul");

	private By btn_opnclose_chkboxElem = By.xpath("//label[contains(.,'Opening/Closing Balance:')]/../../div[2]/div/input");

	private By VAT_PeriodElem = By.xpath("//LABEL[contains(text(),'VAT Period')]");

	private By Reconciled_lblElem = By.xpath("//LABEL[contains(text(),'Reconciled')]");

	private By opclos_exclude_rdbtnElem = By.xpath("//label[contains(.,'Opening/Closing Balance:')]/../../div[3]/div/input");


	
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
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100648";
//
//        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100648")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Reports_menu2
     * @name Click Reports_menu2
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

     
	/**
 	 * Click Ledger_rpt
     * @name Click Ledger_rpt
     */
	public void Click_Ledger_rpt()
	{
        
		WebElement elem = getWebElement(Ledger_rptElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ledger_rpt", "Click_Ledger_rpt failed. Unable to locate object: " + Ledger_rptElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ledger_rpt", "Click_Ledger_rpt failed. Unable to locate object: " + Ledger_rptElem.toString());

			Assert.fail("Unable to locate object: " + Ledger_rptElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Ledger_rpt");

		TestModellerLogger.PassStep(m_Driver, "Click_Ledger_rpt");
	}

    
	/**
 	 * Select Act_type2ex
	 * @throws InterruptedException 
     * @name Select Act_type2ex
     */
	/**
 	 * Click btn_opnclose_chkbox
     * @name Click btn_opnclose_chkbox
     */
	public void Click_btn_opnclose_chkbox()
	{
        
		WebElement elem = getWebElement(btn_opnclose_chkboxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_btn_opnclose_chkbox", "Click_btn_opnclose_chkbox failed. Unable to locate object: " + btn_opnclose_chkboxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_btn_opnclose_chkbox", "Click_btn_opnclose_chkbox failed. Unable to locate object: " + btn_opnclose_chkboxElem.toString());

			Assert.fail("Unable to locate object: " + btn_opnclose_chkboxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_btn_opnclose_chkbox");

		TestModellerLogger.PassStep(m_Driver, "Click_btn_opnclose_chkbox");
	}

    public void Select_Act_type2ex(String Act_type2ex) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Act_type2exElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Act_type2ex", "Select_Act_type2ex failed. Unable to locate object: " + Act_type2exElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Act_type2ex", "Select_Act_type2ex failed. Unable to locate object: " + Act_type2exElem.toString());

 			Assert.fail("Unable to locate object: " + Act_type2exElem.toString());
         }

 		Select dropdown = new Select(elem);
 		

 		dropdown.selectByVisibleText(Act_type2ex);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Act_type2ex " + Act_type2ex);

 		TestModellerLogger.PassStep(m_Driver, "Select_Act_type2ex " + Act_type2ex);
 	}

    /**
 	 * Click option1
     * @throws InterruptedException 
     * @name Click option1
     */
	public void Click_option1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(option1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_option1", "Click_option1 failed. Unable to locate object: " + option1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_option1", "Click_option1 failed. Unable to locate object: " + option1Elem.toString());

			Assert.fail("Unable to locate object: " + option1Elem.toString());
        }

		elem.click();
		//Thread.sleep(1000);          	

		ExtentReportManager.passStep(m_Driver, "Click_option1");

		TestModellerLogger.PassStep(m_Driver, "Click_option1");
	}

      
	/**
 	 * Enter option2
	 * @throws InterruptedException 
     * @name Enter option2
     */
 	public void Enter_option2(String option2) throws InterruptedException
 	{
 	    
		TestModellerLogger.PassStep(m_Driver, "Enter_option2 " + option2);
 		     String pty =option2;
	         System.out.print("second box data:"   +pty );
	        //m_Driver.findElement(By.xpath("//*[Contains(text(),'" +p+ "')]")).click();
	         ////*[contains(text(),'ABC')]
	         m_Driver.findElement(By.xpath("//*[contains(text(),'"+pty+"')]")).click();
	         //Thread.sleep(1000);
 		
 		
 		
 	}
  

    
	/**
 	 * Select Date_range_L
     * @name Select Date_range_L
     */
    public void Select_Date_range_L(String Date_range_L)
 	{
 	    
 		WebElement elem = getWebElement(Date_range_LElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Date_range_L", "Select_Date_range_L failed. Unable to locate object: " + Date_range_LElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Date_range_L", "Select_Date_range_L failed. Unable to locate object: " + Date_range_LElem.toString());

 			Assert.fail("Unable to locate object: " + Date_range_LElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Date_range_L);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Date_range_L " + Date_range_L);

 		TestModellerLogger.PassStep(m_Driver, "Select_Date_range_L " + Date_range_L);
 	}

      
	/**
 	 * Enter dt_frm
     * @name Enter dt_frm
     */
 	public void Enter_dt_frm(String dt_frm)
 	{
 	    
 		WebElement elem = getWebElement(dt_frmElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_dt_frm", "Enter_dt_frm failed. Unable to locate object: " + dt_frmElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_dt_frm", "Enter_dt_frm failed. Unable to locate object: " + dt_frmElem.toString());

 			Assert.fail("Unable to locate object: " + dt_frmElem.toString());
         }

 		elem.sendKeys(dt_frm);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_dt_frm " + dt_frm);

  		TestModellerLogger.PassStep(m_Driver, "Enter_dt_frm " + dt_frm);
 	}

      
	/**
 	 * Enter dt_to
     * @name Enter dt_to
     */
 	public void Enter_dt_to(String dt_to)
 	{
 	    
 		WebElement elem = getWebElement(dt_toElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_dt_to", "Enter_dt_to failed. Unable to locate object: " + dt_toElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_dt_to", "Enter_dt_to failed. Unable to locate object: " + dt_toElem.toString());

 			Assert.fail("Unable to locate object: " + dt_toElem.toString());
         }

 		elem.sendKeys(dt_to);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_dt_to " + dt_to);

  		TestModellerLogger.PassStep(m_Driver, "Enter_dt_to " + dt_to);
 	}

    
	/**
 	 * Select Ledger_Reconcile_2
     * @name Select Ledger_Reconcile_2
     */
    public void Select_Ledger_Reconcile_2(String Ledger_Reconcile_2)
 	{
 	    
 		WebElement elem = getWebElement(Ledger_Reconcile_2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Ledger_Reconcile_2", "Select_Ledger_Reconcile_2 failed. Unable to locate object: " + Ledger_Reconcile_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Ledger_Reconcile_2", "Select_Ledger_Reconcile_2 failed. Unable to locate object: " + Ledger_Reconcile_2Elem.toString());

 			Assert.fail("Unable to locate object: " + Ledger_Reconcile_2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Ledger_Reconcile_2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Ledger_Reconcile_2 " + Ledger_Reconcile_2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Ledger_Reconcile_2 " + Ledger_Reconcile_2);
 	}

    
	/**
 	 * Select Search_cat_1
     * @name Select Search_cat_1
     */
    public void Select_Search_cat_1(String Search_cat_1)
 	{
 	    
 		WebElement elem = getWebElement(Search_cat_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Search_cat_1", "Select_Search_cat_1 failed. Unable to locate object: " + Search_cat_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Search_cat_1", "Select_Search_cat_1 failed. Unable to locate object: " + Search_cat_1Elem.toString());

 			Assert.fail("Unable to locate object: " + Search_cat_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Search_cat_1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Search_cat_1 " + Search_cat_1);

 		TestModellerLogger.PassStep(m_Driver, "Select_Search_cat_1 " + Search_cat_1);
 	}

     
	/**
 	 * Click Update _btn1
	 * @throws InterruptedException 
     * @name Click Update _btn1
     */
	public void Click_Update__btn1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update__btn1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update__btn1", "Click_Update__btn1 failed. Unable to locate object: " + Update__btn1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update__btn1", "Click_Update__btn1 failed. Unable to locate object: " + Update__btn1Elem.toString());

			Assert.fail("Unable to locate object: " + Update__btn1Elem.toString());
        }

//		elem.click();
//		Thread.sleep(2000);
		// jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/ul//following::li[2]")));
WebElement closingbalance=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl05_ClosingBalCredit']"));
String st2=closingbalance.getText();
String st=st2.replace("[£]","");


System.out.println("ledger amount :"  +st);

addashboard_Report_director dr=new addashboard_Report_director(m_Driver);
String dsamtofdirectory=dr.rt();

System.out.println("Dashboard amount :"  +dsamtofdirectory);

SoftAssert sft2=new SoftAssert();
sft2.assertEquals(dsamtofdirectory, st);
sft2.assertAll();



			
	}

     
	/**
 	 * Click pagination_1
     * @name Click pagination_1
     */
//	public void Click_pagination_1()
//	{
//        
//		WebElement elem = getWebElement(pagination_1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_pagination_1", "Click_pagination_1 failed. Unable to locate object: " + pagination_1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_pagination_1", "Click_pagination_1 failed. Unable to locate object: " + pagination_1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + pagination_1Elem.toString());
//        }
//
//		//elem.click();
////        	int pgcount=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[7]/div/ul//following::li[2]")).size();
////        	System.out.println("pagination total"    +pgcount);
////        	        int contt=pgcount-1;
////        	        System.out.println("pagination actual total"    +contt);
////        	        
////        	        m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_PageUC1_rptrPager_ctl0'"+contt+"'_liContainer']")).click();
////        	        
////		ExtentReportManager.passStep(m_Driver, "Click_pagination_1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_pagination_1");
//		
//		
//		
//		
//	}

     
	/**
 	 * Click btn_opnclose_chkbox
     * @name Click btn_opnclose_chkbox
     */
//	public void Click_btn_opnclose_chkbox()
//	{
//        
//		WebElement elem = getWebElement(btn_opnclose_chkboxElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_btn_opnclose_chkbox", "Click_btn_opnclose_chkbox failed. Unable to locate object: " + btn_opnclose_chkboxElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_btn_opnclose_chkbox", "Click_btn_opnclose_chkbox failed. Unable to locate object: " + btn_opnclose_chkboxElem.toString());
//
//			Assert.fail("Unable to locate object: " + btn_opnclose_chkboxElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_btn_opnclose_chkbox");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_btn_opnclose_chkbox");
//	}

     
	/**
 	 * Click VAT Period
     * @name Click VAT Period
     */
//	public void Click_VAT_Period()
//	{
//        
//		WebElement elem = getWebElement(VAT_PeriodElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VAT_Period", "Click_VAT_Period failed. Unable to locate object: " + VAT_PeriodElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VAT_Period", "Click_VAT_Period failed. Unable to locate object: " + VAT_PeriodElem.toString());
//
//			Assert.fail("Unable to locate object: " + VAT_PeriodElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_VAT_Period");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_VAT_Period");
//	}

     
	/**
 	 * Click Reconciled_lbl
     * @name Click Reconciled_lbl
//     */
//	public void Click_Reconciled_lbl()
//	{
//        
//		WebElement elem = getWebElement(Reconciled_lblElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconciled_lbl", "Click_Reconciled_lbl failed. Unable to locate object: " + Reconciled_lblElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconciled_lbl", "Click_Reconciled_lbl failed. Unable to locate object: " + Reconciled_lblElem.toString());
//
//			Assert.fail("Unable to locate object: " + Reconciled_lblElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Reconciled_lbl");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Reconciled_lbl");
//	}
//
//     
//	/**
// 	 * Click opclos_exclude_rdbtn
//     * @name Click opclos_exclude_rdbtn
//     */
//	public void Click_opclos_exclude_rdbtn()
//	{
//        
//		WebElement elem = getWebElement(opclos_exclude_rdbtnElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_opclos_exclude_rdbtn", "Click_opclos_exclude_rdbtn failed. Unable to locate object: " + opclos_exclude_rdbtnElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_opclos_exclude_rdbtn", "Click_opclos_exclude_rdbtn failed. Unable to locate object: " + opclos_exclude_rdbtnElem.toString());
//
//			Assert.fail("Unable to locate object: " + opclos_exclude_rdbtnElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_opclos_exclude_rdbtn");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_opclos_exclude_rdbtn");
//	}
	}
