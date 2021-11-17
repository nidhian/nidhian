package pages.SM311;

import pages.BasePage;
import pages.nlogin;
import pages.PartialReconcilationLAtest;
import pages.nBANKTRN;
import pages.EditSettingToStandard;
import pages.AgentSearch;
import pages.businessrc;
import pages.bankmenu;
import pages.businessrc;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Array;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.nominalcode;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c29beaa8-f2fc-4329-9277-5fccdf3338c6
@TestModellerModule(guid = "c29beaa8-f2fc-4329-9277-5fccdf3338c6")
public class Supplierdropdown_nomatchelement extends BasePage
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
	public Supplierdropdown_nomatchelement (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52550&CompanyCode=13324']");

	private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	
	private By NewTABElem = By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[3]/a");

	private By NewSupplierBillElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By SupplierNameElem = By.xpath("//*[@id='ctl00_cPH_ddlSupplier']");

	private By DefaultCurrencyElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDefaultCurrency']");

	//private By BillNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBillNo']");
	
	private By BillNoElem = By.id("ctl00_cPH_txtBillNo");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	//private By ExpenseTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']");
	private By ExpenseTypeElem=By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");
	private By Expensetypebox=By.xpath("/html/body/span/span/span[1]/input");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By AmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltAmount']");

	private By TickformorelineitemsElem = By.cssSelector("SPAN[onfocus='document\\.getElementById\\(\\'__LASTFOCUS\\'\\)\\.value\\=this\\.id']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");
private By getDropdounDataElem = By.xpath("//SPAN[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditureTAB
     * @name Click ExpenditureTAB
     */
	public void Click_ExpenditureTAB()
	{
        
		WebElement elem = getWebElement(ExpenditureTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click NewTAB
     * @name Click NewTAB
     */
	public void Click_NewTAB()
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewSupplierBill
     * @name Click NewSupplierBill
     */
	public void Click_NewSupplierBill()
	{
        
		WebElement elem = getWebElement(NewSupplierBillElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

			Assert.fail("Unable to locate object: " + NewSupplierBillElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewSupplierBill");

		TestModellerLogger.PassStep(m_Driver, "Click_NewSupplierBill");
	}

    
	/**
 	 * Select SupplierName
     * @name Select SupplierName
     */
    public void Select_SupplierName(String SupplierName)
 	{
 	    
 		WebElement elem = getWebElement(SupplierNameElem);
 		System.out.println("dfdfd"+SupplierName);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierNameElem.toString());
         }
       elem.sendKeys(Keys.ENTER);
	       String sup=SupplierName;
   	
      	System.out.println("selected suplier " +sup);
      	m_Driver.findElement(By.xpath("//*[contains(text(),'"+sup+"')]")).click();
 		
   	
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
 	}
    
	/**
 	 * Enter DefaultCurrency
     * @name Enter DefaultCurrency
     */
 	public void Enter_DefaultCurrency(String DefaultCurrency)
 	{
 	    
 		WebElement elem = getWebElement(DefaultCurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + DefaultCurrencyElem.toString());
         }

 		elem.sendKeys(DefaultCurrency);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);
 	}

	/**
 	 * Enter BillNo
	 * @throws InterruptedException 
     * @name Enter BillNo
     */
 	public void Enter_BillNo(String BillNo) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(BillNoElem);

 		System.out.println("BillNO"+BillNo);
 		BNO = BillNo;
 		
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());
    		
    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

 			Assert.fail("Unable to locate object: " + BillNoElem.toString());
         }
 		
 		elem.sendKeys(BillNo);
 	
 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_BillNo " + BillNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo " + BillNo);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }
 		for(int i=0; i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date);
 		elem.sendKeys(Keys.TAB);
 	ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

    
	/**
 	 * Select ExpenseType
	 * @throws InterruptedException 
     * @name Select ExpenseType
     */
 
    public void Click_ExpenseType() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ExpenseTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ExpenseTypeElem.toString());
         }
 		System.out.println("FIRST BOX");
 		elem.click();
 	}
/**
      * Click getDropdounData
     * @throws IOException 
     * @throws InvalidFormatException 
     * @throws EncryptedDocumentException 
     * @name Click getDropdounData
     */
    
 	/**
     * Click getDropdounData
    * @throws IOException 
    * @throws InvalidFormatException 
    * @throws EncryptedDocumentException 
    * @name Click getDropdounData
    */
   public void Click_getDropdounData123() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
       
       WebElement elem = getWebElement(getDropdounDataElem);

       SoftAssert af=new SoftAssert();

       if (elem == null) {
           ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());



           TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());



           Assert.fail("Unable to locate object: " + getDropdounDataElem.toString());
       }



       elem.click();
       
       List<WebElement> ExpenditureData=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-results']/li/ul/li")); 
         System.out.println(ExpenditureData.size());
       
       String[] ExpData=new String[ExpenditureData.size()];
       
       int i=0;
       for(WebElement dd:ExpenditureData)
       {
           String out=dd.getText();
       //    System.out.println(out);
           ExpData[i]=out;
////           System.out.println(ExpData[i]);
           i++;
       }
       
/**
* Declare Third list        
*/
      // List<Array> li3=new ArrayList<Array>();
       //List<String> li4=new ArrayList<String>();
/**
* Reading Excel        
*/
       FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       Sheet sht = wb.getSheet("sm-311_sup_nt_match");
       int iRowNum= sht.getLastRowNum();
       System.out.println("Excel totoal records :"+iRowNum);



        String[] arr=new String[iRowNum];
       for(int j=1; j<=iRowNum; j++)
       {
       String ste=sht.getRow(j).getCell(5).toString();
       arr[j-1]=ste;
////       System.out.println("Excel List :" +ste);
       }
       
       
   int indexcount=0;    
       
/**
* Matching Data        
*/
       for(int l=0;l<ExpenditureData.size();l++)
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
       
int index2count=0;
       for(int i2=0; i2<arr.length;i2++)
       {
           
       //    System.out.println(li4.get(i2));
           index2count=0;
           for(int j=0;j<li4.size();j++)
           {
               
              // if(arr[i2].contains(li4.get(j)))
        	   if(arr[i2].equalsIgnoreCase(li4.get(j)))
               {
                   
                   System.out.println(arr[i2]+"="+li4.get(j));
                   
                   
                   index2count++;
                   break;
   
               }
       
           
           
           if(index2count==0)
           {
           
        	   //SoftAssert af=new SoftAssert();
        	   af.assertEquals(0, 1,"Text not match="+ste);
        	  // af.assertAll();
           }
        	af.assertAll();
       
           }
       }
       
     
   }
      
   

/**
      * Click getDropdounData
     * @throws IOException 
     * @throws InvalidFormatException 
     * @throws EncryptedDocumentException 
     * @name Click getDropdounData
     */
    public void Click_getDropdounData() throws EncryptedDocumentException, InvalidFormatException, IOException
    {
        
        WebElement elem = getWebElement(getDropdounDataElem);

 

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());

 

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_getDropdounData", "Click_getDropdounData failed. Unable to locate object: " + getDropdounDataElem.toString());

 

            Assert.fail("Unable to locate object: " + getDropdounDataElem.toString());
        }

 

        elem.click();
        
        List<WebElement> ExpenditureData=m_Driver.findElements(By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-results']/li/ul/li")); 
          System.out.println(ExpenditureData.size());
        
        String[] ExpData=new String[ExpenditureData.size()];
        
        int i=0;
        for(WebElement dd:ExpenditureData)
        {
            String out=dd.getText();
        //    System.out.println(out);
            ExpData[i]=out;
////            System.out.println(ExpData[i]);
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
        FileInputStream fis = new FileInputStream("D:\\testdata.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sht = wb.getSheet("311-Sup-Expense drp dwn");
        int iRowNum= sht.getLastRowNum();
        System.out.println("Excel totoal records :"+iRowNum);

 

         String[] arr=new String[iRowNum];
        for(int j=1; j<=iRowNum; j++)
        {
        String ste=sht.getRow(j).getCell(5).toString();
        arr[j-1]=ste;
////        System.out.println("Excel List :" +ste);
        }
        
        
    int indexcount=0;    
        
/**
 * Matching Data        
 */
        for(int l=0;l<ExpenditureData.size();l++)
        {
            
            for(int n=0;n<iRowNum;n++)
            {
                
                if(ExpData[l].contains(arr[n]))
                        {
                            count++;
                            System.out.println(arr[n]+"="+ExpData[l]);
                            
                            
                            li4.add(indexcount, arr[n]);
                //            li3.add(arr[n]);
                        //    System.out.println("li3="+li3[indexcount]);
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
                
              //  if(arr[i2].equalsIgnoreCase(li4.get(j)))
            	 if(!arr[i2].contains(li4.get(j)))
                {
                    
                    System.out.println(arr[i2]+"="+li4.get(j));
                    
                    
                    index2count++;
                    break;
    
                }
//                else
//                {
//                    index2count++;
//                    assertEquals(arr[i2], 0,"Text not match"+arr[i2]);
//                }
                
            }
            
            
            
            if(index2count==0)
            {
                
                af.assertEquals(0, 1,"Text not match="+arr[i2]);
                
            }
        
        }
        
        af.assertAll();

 

        ExtentReportManager.passStep(m_Driver, "Click_getDropdounData");

 

        TestModellerLogger.PassStep(m_Driver, "Click_getDropdounData");
        
        
    }









	/**
 	 * Enter UnitPrice
	 * @throws InterruptedException 
     * @name Enter UnitPrice
     */
 	public void Enter_UnitPrice(String UnitPrice) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(UnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + UnitPriceElem.toString());
         }
 		
      	elem.clear();
 		
 		elem.sendKeys(UnitPrice);
 	
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

    
	/**
 	 * Select VATRateType
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType)
 	{
 	    
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRateType);
 		
 		System.out.println(VATRateType);
 		ExtentReportManager.passStep(m_Driver, "Select_VATRateType " + VATRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRateType " + VATRateType);
 	}

      
	/**
 	 * Enter VATRate
     * @name Enter VATRate
     */
 	public void Enter_VATRate(String VATRate)
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		elem.sendKeys(VATRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate " + VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate " + VATRate);
 	}

      
	/**
 	 * Enter VATAmount
     * @name Enter VATAmount
     */
 	public void Enter_VATAmount(String VATAmount)
 	{
 	    
 		WebElement elem = getWebElement(VATAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

 			Assert.fail("Unable to locate object: " + VATAmountElem.toString());
         }

 		elem.sendKeys(VATAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
 	}

      
	/**
 	 * Enter Amount
     * @name Enter Amount
     */
 	public void Enter_Amount(String Amount)
 	{
 	    
 		WebElement elem = getWebElement(AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

 			Assert.fail("Unable to locate object: " + AmountElem.toString());
         }

 		elem.sendKeys(Amount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amount " + Amount);
 	}

               	  
}

	    




               
                		  
