package pages.SM311;

import pages.BasePage;
import pages.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6cc9246a-6a26-4b9c-abd6-51b46fd4d252
@TestModellerModule(guid = "6cc9246a-6a26-4b9c-abd6-51b46fd4d252")
public class Ledgerbook_LLP extends BasePage
{
    static List<String> Newlist=new ArrayList<String>();
    
	   
    static int totalcount=0;
	public Ledgerbook_LLP (WebDriver driver)
	{
		super(driver);
	}

	private By selectAccountTypeElem = By.xpath("//label[normalize-space()= 'Account Type:']/../div/select");

    private By AccountElem = By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']");
	
	private By AdvisorTool_ToplftElem = By.xpath("//BUTTON[@data-toggle='dropdown']");

	private By Reports_menu_inadvisorytoolElem = By.xpath("//A[contains(text(),'Reports')]");

	private By GnralLdgerNominal_Ldgr_RprtclickedElem = By.xpath("//A[contains(text(),'General Ledger/Nominal Ledger')]");

	private By ctl00cPHFilterddlAccountTypeElem = By.xpath("//label[normalize-space()= 'Account Type:']/../div/select");

	private By box1_accountElem = By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']");

	private By Box2_accountElem = By.cssSelector("INPUT[aria-autocomplete='list']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=117008&CompanyCode=16685&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click AdvisorTool_Toplft
     * @name Click AdvisorTool_Toplft
     */
	public void Click_AdvisorTool_Toplft1()
	{
        
		WebElement elem = getWebElement(AdvisorTool_ToplftElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AdvisorTool_Toplft", "Click_AdvisorTool_Toplft failed. Unable to locate object: " + AdvisorTool_ToplftElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AdvisorTool_Toplft", "Click_AdvisorTool_Toplft failed. Unable to locate object: " + AdvisorTool_ToplftElem.toString());

			Assert.fail("Unable to locate object: " + AdvisorTool_ToplftElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AdvisorTool_Toplft");

		TestModellerLogger.PassStep(m_Driver, "Click_AdvisorTool_Toplft");
	}

     
	/**
 	 * Click Reports_menu_inadvisorytool
	 * @throws InterruptedException 
     * @name Click Reports_menu_inadvisorytool
     */
	public void Click_Reports_menu_inadvisorytool1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(Reports_menu_inadvisorytoolElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports_menu_inadvisorytool", "Click_Reports_menu_inadvisorytool failed. Unable to locate object: " + Reports_menu_inadvisorytoolElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports_menu_inadvisorytool", "Click_Reports_menu_inadvisorytool failed. Unable to locate object: " + Reports_menu_inadvisorytoolElem.toString());

			Assert.fail("Unable to locate object: " + Reports_menu_inadvisorytoolElem.toString());
        }

		elem.click();
		Library.tabswitch1(m_Driver);
          	
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a/span")).click();
//		Thread.sleep(1000);
//		ExtentReportManager.passStep(m_Driver, "Click_Reports_menu_inadvisorytool");

//		TestModellerLogger.PassStep(m_Driver, "Click_Reports_menu_inadvisorytool");
		ClosePopup.ValidateAndPopUp(m_Driver);
	}

     
	/**
 	 * Click GnralLdger/Nominal Ldgr_Rprtclicked
	 * @throws InterruptedException 
     * @name Click GnralLdger/Nominal Ldgr_Rprtclicked
     */
	public void Click_GnralLdgerNominal_Ldgr_Rprtclicked1() throws InterruptedException
	{
        
		WebElement elem = getWebElement(GnralLdgerNominal_Ldgr_RprtclickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_GnralLdgerNominal_Ldgr_Rprtclicked", "Click_GnralLdgerNominal_Ldgr_Rprtclicked failed. Unable to locate object: " + GnralLdgerNominal_Ldgr_RprtclickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_GnralLdgerNominal_Ldgr_Rprtclicked", "Click_GnralLdgerNominal_Ldgr_Rprtclicked failed. Unable to locate object: " + GnralLdgerNominal_Ldgr_RprtclickedElem.toString());

			Assert.fail("Unable to locate object: " + GnralLdgerNominal_Ldgr_RprtclickedElem.toString());
        }

		elem.click();
		  Thread.sleep(1000);
		ExtentReportManager.passStep(m_Driver, "Click_GnralLdgerNominal_Ldgr_Rprtclicked");

		TestModellerLogger.PassStep(m_Driver, "Click_GnralLdgerNominal_Ldgr_Rprtclicked");
		
		//ClosePopup.ValidateAndPopUp(m_Driver);
	}
	
	/**
     * Select selectAccountType
    * @name Select selectAccountType
    */
   public void Select_selectAccountType1()
    {
        
        WebElement elem = getWebElement(selectAccountTypeElem);



        if (elem == null) {
           ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_selectAccountType", "Select_selectAccountType failed. Unable to locate object: " + selectAccountTypeElem.toString());



           TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_selectAccountType", "Select_selectAccountType failed. Unable to locate object: " + selectAccountTypeElem.toString());



            Assert.fail("Unable to locate object: " + selectAccountTypeElem.toString());
        }



//        Select dropdown = new Select(elem);
//
//        dropdown.selectByVisibleText(selectAccountType);
        
        WebElement wb1Element=m_Driver.findElement(By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']"));
        
        
        List<WebElement> actype=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlAccountType']/option"));
        elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Account Type:']/../div/select"));
//        int i=0;
        for(int i=0;i<actype.size();i++)
        {
            actype=m_Driver.findElements(By.xpath("//*[@id='ctl00_cPHFilter_ddlAccountType']/option"));
            
            String ACvalue=actype.get(i).getText();



            elem=m_Driver.findElement(By.xpath("//label[normalize-space()= 'Account Type:']/../div/select"));
        
            Select dropdown = new Select(elem);
        
            dropdown.selectByVisibleText(ACvalue);



             wb1Element=m_Driver.findElement(By.xpath("//SPAN[@id='select2-ctl00_cPHFilter_ddlAccount-container']"));



            wb1Element.click();
            
            List<WebElement> acount=m_Driver.findElements(By.xpath("/html/body/span/span/span[2]/ul/li"));



            for(int j=1;j<acount.size();j++)
            {
                String Acountvalue=acount.get(j).getText();
                
                System.out.println(Acountvalue);
                Newlist.add(Acountvalue);
                totalcount++;
                
            }
            
            
        }
        //Newlist.re
        
        System.out.println(totalcount);
        
        ExtentReportManager.passStep(m_Driver, "Select_selectAccountType " );



        TestModellerLogger.PassStep(m_Driver, "Select_selectAccountType " );
    }
   /**
    * Match from Excel
    * @throws IOException 
    * @throws InvalidFormatException 
    * @throws EncryptedDocumentException 
    * 
    */
   public void matchFromExcel1() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
       for(int k=0;k<Newlist.size();k++)
        {
            System.out.println("This is list Element no "+k+"="+Newlist.get(k));
        }
        
       
       /**
        * Declare Third list        
        */



               List<String> li4=new ArrayList<String>();
       /**
        * Reading Excel        
        */
               FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
               Workbook wb = WorkbookFactory.create(fis);
               Sheet sht = wb.getSheet("sm-311_ledger");
               int iRowNum= sht.getLastRowNum();
               System.out.println("Excel totoal records :"+iRowNum);

                String[] arr=new String[iRowNum];
               for(int j=1; j<=iRowNum; j++)
               {
               String ste=sht.getRow(j).getCell(5).toString();
               arr[j-1]=ste;



               }
               
               
           int indexcount=0;    
               
       /**
        * Matching Data        
        */
               for(int l=0;l<Newlist.size();l++)
               {
                   
                   for(int n=0;n<iRowNum;n++)
                   {
                       
                       if(Newlist.get(l).contains(arr[n]))
                               {
                               
                                   System.out.println(arr[n]+"="+Newlist.get(l));
                                   
                                   
                                   li4.add(indexcount, arr[n]);
                   
                                   
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
                       
                       if(arr[i2].equalsIgnoreCase(li4.get(j)))
                       {
                           
                           System.out.println(arr[i2]+"="+li4.get(j));
                           
                           
                           index2count++;
                           break;
           
                       }
//                       else
//                       {
//                           index2count++;
//                           assertEquals(arr[i2], 0,"Text not match"+arr[i2]);
//                       }
                       
                   }
                   
                   
                   
                   if(index2count==0)
                   {
                       
                       af.assertEquals(0, 1,"Text not match="+arr[i2]);
                       
                   }
               
               }
               
               af.assertAll();
       
       
       
   }
	
	
	
	
	









	    
	
	

    
	/**
 	 * Select ctl00$cPHFilter$ddlAccountType
     * @name Select ctl00$cPHFilter$ddlAccountType
     */
    public void Select_ctl00cPHFilterddlAccountType1(String ctl00cPHFilterddlAccountType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFilterddlAccountTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddlAccountType", "Select_ctl00cPHFilterddlAccountType failed. Unable to locate object: " + ctl00cPHFilterddlAccountTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddlAccountType", "Select_ctl00cPHFilterddlAccountType failed. Unable to locate object: " + ctl00cPHFilterddlAccountTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFilterddlAccountTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHFilterddlAccountType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHFilterddlAccountType " + ctl00cPHFilterddlAccountType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHFilterddlAccountType " + ctl00cPHFilterddlAccountType);
 	}

     
	/**
 	 * Click box1_account
     * @name Click box1_account
     */
	public void Click_box1_account1()
	{
        
		WebElement elem = getWebElement(box1_accountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_box1_account", "Click_box1_account failed. Unable to locate object: " + box1_accountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_box1_account", "Click_box1_account failed. Unable to locate object: " + box1_accountElem.toString());

			Assert.fail("Unable to locate object: " + box1_accountElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_box1_account");

		TestModellerLogger.PassStep(m_Driver, "Click_box1_account");
	}

      
	/**
 	 * Enter Box2_account
     * @name Enter Box2_account
     */
 	public void Enter_Box2_account1(String Box2_account)
 	{
 	    
 		WebElement elem = getWebElement(Box2_accountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Box2_account", "Enter_Box2_account failed. Unable to locate object: " + Box2_accountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Box2_account", "Enter_Box2_account failed. Unable to locate object: " + Box2_accountElem.toString());

 			Assert.fail("Unable to locate object: " + Box2_accountElem.toString());
         }

 		elem.sendKeys(Box2_account);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Box2_account " + Box2_account);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Box2_account " + Box2_account);
 	}
 	
	
}


	
