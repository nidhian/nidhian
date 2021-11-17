package pages.UX1804;

import pages.BasePage;

import org.assertj.core.api.SoftAssertions;
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
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/38a95530-a246-4968-b040-7da903349ef6
@TestModellerModule(guid = "38a95530-a246-4968-b040-7da903349ef6")
public class test3 extends BasePage
{
	int unreconciledcount3;
	int totcount=0;
	public test3 (WebDriver driver)
	{
		super(driver);
	}


	
	private By bank_name11Elem = By.xpath("//*[@id='ctl00_cPHFilter_ddlAccount']");

	private By date_range22Elem = By.xpath("//label[contains(.,'Date Range')]/../div/select");

	private By Date_from12Elem = By.xpath("//label[contains(.,'Date Range')]/../div/input[1]");

	private By data_To12Elem = By.xpath("//label[contains(.,'Date Range')]/../div/input[2]");

	private By Update12Elem = By.xpath("//INPUT[@name='ctl00$cPHFilter$btnUpdate']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&menuid=0";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/UnprocessedBankTran.aspx?FYCode=52444&CompanyCode=13236&menuid=0")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

    
	/**
 	 * Select bank_name11
     * @name Select bank_name11
     */
    public void Select_bank_name11(String bank_name11)
 	{
 	    
 		WebElement elem = getWebElement(bank_name11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_bank_name11", "Select_bank_name11 failed. Unable to locate object: " + bank_name11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_bank_name11", "Select_bank_name11 failed. Unable to locate object: " + bank_name11Elem.toString());

 			Assert.fail("Unable to locate object: " + bank_name11Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(bank_name11);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_bank_name11 " + bank_name11);

 		TestModellerLogger.PassStep(m_Driver, "Select_bank_name11 " + bank_name11);
 	}

    
	/**
 	 * Select date_range22
     * @name Select date_range22
     */
    public void Select_date_range22(String date_range22)
 	{
 	    
 		WebElement elem = getWebElement(date_range22Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_date_range22", "Select_date_range22 failed. Unable to locate object: " + date_range22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_date_range22", "Select_date_range22 failed. Unable to locate object: " + date_range22Elem.toString());

 			Assert.fail("Unable to locate object: " + date_range22Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(date_range22);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_date_range22 " + date_range22);

 		TestModellerLogger.PassStep(m_Driver, "Select_date_range22 " + date_range22);
 	}

      
	/**
 	 * Enter Date_from12
     * @name Enter Date_from12
     */
 	public void Enter_Date_from12(String Date_from12)
 	{
 	    
 		WebElement elem = getWebElement(Date_from12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_from12", "Enter_Date_from12 failed. Unable to locate object: " + Date_from12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_from12", "Enter_Date_from12 failed. Unable to locate object: " + Date_from12Elem.toString());

 			Assert.fail("Unable to locate object: " + Date_from12Elem.toString());
         }

 		elem.sendKeys(Date_from12);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date_from12 " + Date_from12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date_from12 " + Date_from12);
 	}

      
	/**
 	 * Enter data_To12
     * @name Enter data_To12
     */
 	public void Enter_data_To12(String data_To12)
 	{
 	    
 		WebElement elem = getWebElement(data_To12Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_data_To12", "Enter_data_To12 failed. Unable to locate object: " + data_To12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_data_To12", "Enter_data_To12 failed. Unable to locate object: " + data_To12Elem.toString());

 			Assert.fail("Unable to locate object: " + data_To12Elem.toString());
         }

 		elem.sendKeys(data_To12);
 				
  		ExtentReportManager.passStep(m_Driver, "Enter_data_To12 " + data_To12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_data_To12 " + data_To12);
 	}

     
	/**
 	 * Click Update12
	 * @throws InterruptedException 
     * @name Click Update12
     */
	public void Click_Update12() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Update12Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Update12", "Click_Update12 failed. Unable to locate object: " + Update12Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Update12", "Click_Update12 failed. Unable to locate object: " + Update12Elem.toString());

			Assert.fail("Unable to locate object: " + Update12Elem.toString());
        }
		
	
		
		int j;	int finansize=0;
			elem.click();
	
int paginationcount=m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']//following::li")).size();
System.out.println("sizeof paginationcount"     +paginationcount);
if(paginationcount>1)

{
				
				for(int i=2;i<paginationcount-1;i++)
				
					
				{
					
					//m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_PageUC1_rptrPager_ctl06_lnkNext']")).click();
				    /* click on page number one by one*/
			
				m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_PageUC1_rptrPager_ctl0"+i+"_liContainer']")).click();
				/*table size*/
					
				int tablesize=m_Driver.findElements(By.xpath("//*[@id='myTable']/tbody/tr")).size();
				Thread.sleep(1000);
				System.out.println("sizeof table"  +tablesize);
				finansize=finansize+tablesize;	
				totcount=finansize+15;
				
				System.out.println("sizeof final table" +totcount);
				 addashboard_Unreconsiled un=new addashboard_Unreconsiled(m_Driver);
					
				 unreconciledcount3=	un.unrds();
				 System.out.println("data got from dashboard" +unreconciledcount3);

		ExtentReportManager.passStep(m_Driver, "Click_Update12");

		TestModellerLogger.PassStep(m_Driver, "Click_Update12");
	
}
				
}


				if(paginationcount==1)				
				{
					
				int tablesize=m_Driver.findElements(By.xpath("//*[@id='myTable']/tbody/tr")).size();
					System.out.println("first page Reconrds"   +tablesize);
					
			
					
				}

	}		


				
			     
			   public void comparedamout()
			    {
			       
				  
							
								SoftAssert sft=new SoftAssert();
								
								sft.assertEquals(totcount, unreconciledcount3);
										sft.assertAll();
				   
				   
			    }
			        }
			 






