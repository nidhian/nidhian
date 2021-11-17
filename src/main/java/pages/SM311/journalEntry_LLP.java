package pages.SM311;

import pages.BasePage;
import pages.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Array;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8736c5f5-6415-4d2d-9df0-b11a49a06d16
@TestModellerModule(guid = "8736c5f5-6415-4d2d-9df0-b11a49a06d16")
public class journalEntry_LLP extends BasePage
{
	

	static java.util.List<String> li4=new java.util.ArrayList<String>();
	 List<Array> li3=new ArrayList<Array>();
	int j;
	static int counter=0;
	static int prevcounter=0;
	String arr2[];
	static String  ste,jt,ptr;
	int count;
	String[] arr;
	String BNO;
	 int n;
	String inel=" ";
	String SupNo=" ";
	public journalEntry_LLP (WebDriver driver)
	{
		super(driver);
	}

	private By Click_AdvisorToolsToplft=By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span");
	//private By Journals_mnu_clickElem = By.xpath("//*[@id='ctl00_cPH_Divtab']/div/div/div[1]/div/div/div/table[1]/thead/tr/td/table[1]/tbody/tr/td/a/h3");

	private By Month_Drpdwn_SelectElem = By.xpath("//label[normalize-space()= 'Month:']/../select");

	private By Search_btn_clicked3Elem = By.xpath("//label[normalize-space()= 'Month:']/../a");

	private By Advance__srch_clicked4Elem = By.xpath("//label[normalize-space()= 'Month:']/../span/a");

	private By Plus_sign_Lft_clickElem = By.xpath("//*[@id='ctl00_cPH_btnAddJournalEntry']");

	private By Del_icon_clickElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnDelete']");

	private By Adv_srch_DateFromElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateFrom']");

	private By Adv_srch_DateToElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtDateTo']");

	private By adv_Search_input_boxElem = By.xpath("//label[normalize-space()= 'Description:']/../input");

	private By grid_check_boxElem = By.xpath("//TH[@class='th_check text-center el-selection']");
   private By getDropdounData_journal=By.xpath("//SPAN[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']");
   
	public void Click_AdvisorToolsToplft()
	{
       //m_Driver.findElement(By.xpath("//*[@id='ctl00_AccountantToolSpn']/div")).click();
		WebElement elem = getWebElement(Click_AdvisorToolsToplft);

		if (elem == null) {
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AdvisorToolsToplft", "Click_AdvisorToolsToplft failed. Unable to locate object: " + Click_AdvisorToolsToplft.toString());

   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AdvisorToolsToplft", "Click_AdvisorToolsToplft failed. Unable to locate object: " + Click_AdvisorToolsToplft.toString());

			Assert.fail("Unable to locate object: " + Click_AdvisorToolsToplft.toString());
       }

		elem.click();
         	

		ExtentReportManager.passStep(m_Driver, "Click_AdvisorToolsToplft");

		TestModellerLogger.PassStep(m_Driver, "Click_AdvisorToolsToplft");
	}
	
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
 	 * Click Journals_mnu_click
     * @name Click Journals_mnu_click
     */
//	public void Click_Journals_mnu_click()
//	{
//        
//		WebElement elem = getWebElement(Journals_mnu_clickElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Journals_mnu_click", "Click_Journals_mnu_click failed. Unable to locate object: " + Journals_mnu_clickElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Journals_mnu_click", "Click_Journals_mnu_click failed. Unable to locate object: " + Journals_mnu_clickElem.toString());
//
//			Assert.fail("Unable to locate object: " + Journals_mnu_clickElem.toString());
//        }
//		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
//		jse.executeScript("arguments[0].click()", elem);
//		Library.tabswitch1(m_Driver);
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Journals_mnu_click");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Journals_mnu_click");
//	}

    
	/**
 	 * Select Month_Drpdwn_Select
     * @name Select Month_Drpdwn_Select
     */
    public void Select_Month_Drpdwn_Select(String Month_Drpdwn_Select)
 	{
 	    
 		WebElement elem = getWebElement(Month_Drpdwn_SelectElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Month_Drpdwn_Select", "Select_Month_Drpdwn_Select failed. Unable to locate object: " + Month_Drpdwn_SelectElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Month_Drpdwn_Select", "Select_Month_Drpdwn_Select failed. Unable to locate object: " + Month_Drpdwn_SelectElem.toString());

 			Assert.fail("Unable to locate object: " + Month_Drpdwn_SelectElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Month_Drpdwn_Select);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Month_Drpdwn_Select " + Month_Drpdwn_Select);

 		TestModellerLogger.PassStep(m_Driver, "Select_Month_Drpdwn_Select " + Month_Drpdwn_Select);
 	}

     
	/**
 	 * Click Search_btn_clicked3
     * @name Click Search_btn_clicked3
     */
	public void Click_Search_btn_clicked3()
	{
        
		WebElement elem = getWebElement(Search_btn_clicked3Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_btn_clicked3", "Click_Search_btn_clicked3 failed. Unable to locate object: " + Search_btn_clicked3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_btn_clicked3", "Click_Search_btn_clicked3 failed. Unable to locate object: " + Search_btn_clicked3Elem.toString());

			Assert.fail("Unable to locate object: " + Search_btn_clicked3Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_btn_clicked3");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_btn_clicked3");
	}

     
	/**
 	 * Click Advance _srch_clicked4
     * @name Click Advance _srch_clicked4
     */
	public void Click_Advance__srch_clicked4()
	{
        
		WebElement elem = getWebElement(Advance__srch_clicked4Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advance__srch_clicked4", "Click_Advance__srch_clicked4 failed. Unable to locate object: " + Advance__srch_clicked4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advance__srch_clicked4", "Click_Advance__srch_clicked4 failed. Unable to locate object: " + Advance__srch_clicked4Elem.toString());

			Assert.fail("Unable to locate object: " + Advance__srch_clicked4Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Advance__srch_clicked4");

		TestModellerLogger.PassStep(m_Driver, "Click_Advance__srch_clicked4");
	}

     
	/**
 	 * Click Plus_sign_Lft_click
     * @name Click Plus_sign_Lft_click
     */
	public void Click_Plus_sign_Lft_click()
	{
        
		WebElement elem = getWebElement(Plus_sign_Lft_clickElem);

		if (elem == null) 
		{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Plus_sign_Lft_click", "Click_Plus_sign_Lft_click failed. Unable to locate object: " + Plus_sign_Lft_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Plus_sign_Lft_click", "Click_Plus_sign_Lft_click failed. Unable to locate object: " + Plus_sign_Lft_clickElem.toString());

			Assert.fail("Unable to locate object: " + Plus_sign_Lft_clickElem.toString());
        }

			JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
	
	WebElement ts=m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_journalmodal1Iframe1']"));
		
		m_Driver.switchTo().frame(ts);
	}
	/**
    * Click_getDropdounData_journal
   * @throws IOException 
   * @throws InvalidFormatException 
   * @throws EncryptedDocumentException 
   * @name Click getDropdounData_journal
   */
  public void getDropdounData_journal() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
      
      WebElement elem = getWebElement(getDropdounData_journal);



      if (elem == null) {
          ExtentReportManager.failStepWithScreenshot(m_Driver, "getDropdounData_journal", "getDropdounData_journal failed. Unable to locate object: " + getDropdounData_journal.toString());



          TestModellerLogger.FailStepWithScreenshot(m_Driver, "getDropdounData_journal", "getDropdounData_journal failed. Unable to locate object: " + getDropdounData_journal.toString());



          Assert.fail("Unable to locate object: " + getDropdounData_journal.toString());
      }



      elem.click();
      
      List<WebElement> journal=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_rptRecord_ctl00_ltAccount']/optgroup/option")); 
        System.out.println(journal.size());
      
      String[] ExpData=new String[journal.size()];
            int i=0;
      for(WebElement dd:journal)
      {
          String out=dd.getText();
      //    System.out.println(out);
          ExpData[i]=out;

          i++;
      }
      
/**
* Declare Third list        
*/
      List<Array> li3=new ArrayList<Array>();
      List<String> li4=new ArrayList<String>();
/**
* Reading Excel        
*/
      FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
      Sheet sht = wb.getSheet("sm-311_journalenty");
      int iRowNum= sht.getLastRowNum();
      System.out.println("Excel totoal records :"+iRowNum);
       String[] arr=new String[iRowNum];
      for(int j=1; j<=iRowNum; j++)
      {
      String jste=sht.getRow(j).getCell(5).toString();
      arr[j-1]=jste;

      }
      
  int indexcount=0;    
      
/**
* Matching Data        
*/
      for(int l=0;l<journal.size();l++)
      {
          
          for(int n=0;n<iRowNum;n++)
          {
              
              if(ExpData[l].contains(arr[n]))
                      {
                          count++;
                          System.out.println(arr[n]+"="+ExpData[l]);
                          
                          
                          li4.add(indexcount, arr[n]);
             
                          indexcount++;
                      
                          
                      }
                        }
          
      }
      SoftAssert af=new SoftAssert();    
      	int index2count=0;
      for(int i2=0; i2<arr.length;i2++)
      {
         //    System.out.println(li4.get(i2));
          index2count=0;
          for(int j=0;j<li4.size();j++)
          {
             	 if(!arr[i2].contains(li4.get(j)))
              {
                  System.out.println(arr[i2]+"="+li4.get(j));
                           
                  index2count++;
                  break;
  
              }
          
          if(index2count==0)
          {
              
              af.assertEquals(0, 1,"Text not match="+arr[i2]);
              
          }
      
      }
      
      af.assertAll();

      }

    
      
      
  }





	
	
	
     
	/**
 	 * Click Del_icon_click
     * @name Click Del_icon_click
     */
	public void Click_Del_icon_click()
	{
        
		WebElement elem = getWebElement(Del_icon_clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Del_icon_click", "Click_Del_icon_click failed. Unable to locate object: " + Del_icon_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Del_icon_click", "Click_Del_icon_click failed. Unable to locate object: " + Del_icon_clickElem.toString());

			Assert.fail("Unable to locate object: " + Del_icon_clickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Del_icon_click");

		TestModellerLogger.PassStep(m_Driver, "Click_Del_icon_click");
	}

      
	/**
 	 * Enter Adv_srch_DateFrom
     * @name Enter Adv_srch_DateFrom
     */
 	public void Enter_Adv_srch_DateFrom(String Adv_srch_DateFrom)
 	{
 	    
 		WebElement elem = getWebElement(Adv_srch_DateFromElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Adv_srch_DateFrom", "Enter_Adv_srch_DateFrom failed. Unable to locate object: " + Adv_srch_DateFromElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Adv_srch_DateFrom", "Enter_Adv_srch_DateFrom failed. Unable to locate object: " + Adv_srch_DateFromElem.toString());

 			Assert.fail("Unable to locate object: " + Adv_srch_DateFromElem.toString());
         }

 		elem.sendKeys(Adv_srch_DateFrom);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Adv_srch_DateFrom " + Adv_srch_DateFrom);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Adv_srch_DateFrom " + Adv_srch_DateFrom);
 	}

      
	/**
 	 * Enter Adv_srch_DateTo
     * @name Enter Adv_srch_DateTo
     */
 	public void Enter_Adv_srch_DateTo(String Adv_srch_DateTo)
 	{
 	    
 		WebElement elem = getWebElement(Adv_srch_DateToElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Adv_srch_DateTo", "Enter_Adv_srch_DateTo failed. Unable to locate object: " + Adv_srch_DateToElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Adv_srch_DateTo", "Enter_Adv_srch_DateTo failed. Unable to locate object: " + Adv_srch_DateToElem.toString());

 			Assert.fail("Unable to locate object: " + Adv_srch_DateToElem.toString());
         }

 		elem.sendKeys(Adv_srch_DateTo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Adv_srch_DateTo " + Adv_srch_DateTo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Adv_srch_DateTo " + Adv_srch_DateTo);
 	}

      
	/**
 	 * Enter adv_Search_input_box
     * @name Enter adv_Search_input_box
     */
 	public void Enter_adv_Search_input_box(String adv_Search_input_box)
 	{
 	    
 		WebElement elem = getWebElement(adv_Search_input_boxElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_adv_Search_input_box", "Enter_adv_Search_input_box failed. Unable to locate object: " + adv_Search_input_boxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_adv_Search_input_box", "Enter_adv_Search_input_box failed. Unable to locate object: " + adv_Search_input_boxElem.toString());

 			Assert.fail("Unable to locate object: " + adv_Search_input_boxElem.toString());
         }

 		elem.sendKeys(adv_Search_input_box);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_adv_Search_input_box " + adv_Search_input_box);

  		TestModellerLogger.PassStep(m_Driver, "Enter_adv_Search_input_box " + adv_Search_input_box);
 	}

     
	/**
 	 * Click grid_check_box
     * @name Click grid_check_box
     */
	public void Click_grid_check_box()
	{
        
		WebElement elem = getWebElement(grid_check_boxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_grid_check_box", "Click_grid_check_box failed. Unable to locate object: " + grid_check_boxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_grid_check_box", "Click_grid_check_box failed. Unable to locate object: " + grid_check_boxElem.toString());

			Assert.fail("Unable to locate object: " + grid_check_boxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_grid_check_box");

		TestModellerLogger.PassStep(m_Driver, "Click_grid_check_box");
	}
}