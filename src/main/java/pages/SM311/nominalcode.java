package pages.SM311;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import pages.BasePage;
import utilities.ExcelData;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/fd54b1eb-9fea-443a-a4e3-19c70fb3f44f
@TestModellerModule(guid = "fd54b1eb-9fea-443a-a4e3-19c70fb3f44f")
public class nominalcode extends BasePage
{
	static java.util.List<String> li4=new java.util.ArrayList<String>();
	public nominalcode (WebDriver driver)
	{
		super(driver);
	}

	private By Nominal_CodeElem = By.xpath("//A[contains(text(),'Nominal Code')]");

	private By ctl00cPHFilterddAccountTypeElem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddAccountType']");

	private By ctl00cPHFiltertxtCodeElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtCode']");

	private By ctl00cPHFiltertxtAccountNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAccountName']");

	private By SearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53468&CompanyCode=13236");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53468&CompanyCode=13236");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53468&CompanyCode=13236");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53468&CompanyCode=13236";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Account.aspx?FYCode=53468&CompanyCode=13236")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Nominal Code
     * @name Click Nominal Code
     */
	public void Click_Nominal_Code()
	{
        
		
		WebElement elem = getWebElement(Nominal_CodeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nominal_Code", "Click_Nominal_Code failed. Unable to locate object: " + Nominal_CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nominal_Code", "Click_Nominal_Code failed. Unable to locate object: " + Nominal_CodeElem.toString());

			Assert.fail("Unable to locate object: " + Nominal_CodeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Nominal_Code");

		TestModellerLogger.PassStep(m_Driver, "Click_Nominal_Code");
	}

    
	/**
 	 * Select ctl00$cPHFilter$ddAccountType
     * @name Select ctl00$cPHFilter$ddAccountType
     */
    public void Select_ctl00cPHFilterddAccountType(String ctl00cPHFilterddAccountType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFilterddAccountTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddAccountType", "Select_ctl00cPHFilterddAccountType failed. Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHFilterddAccountType", "Select_ctl00cPHFilterddAccountType failed. Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFilterddAccountTypeElem.toString());
         }
 		System.out.println("hello");
        elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHFilterddAccountType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHFilterddAccountType " + ctl00cPHFilterddAccountType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHFilterddAccountType " + ctl00cPHFilterddAccountType);
 	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtCode
     * @name Enter ctl00$cPHFilter$txtCode
     */
 	public void Enter_ctl00cPHFiltertxtCode(String ctl00cPHFiltertxtCode)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtCode", "Enter_ctl00cPHFiltertxtCode failed. Unable to locate object: " + ctl00cPHFiltertxtCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtCode", "Enter_ctl00cPHFiltertxtCode failed. Unable to locate object: " + ctl00cPHFiltertxtCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtCodeElem.toString());
         }

 		elem.sendKeys(ctl00cPHFiltertxtCode);
 		String ste=ctl00cPHFiltertxtCode;
 				
 		System.out.println("Nominal Code name = "+ste);
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cNPHFiltertxtCode " + ctl00cPHFiltertxtCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtCode " + ctl00cPHFiltertxtCode);
 	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAccountName
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Enter ctl00$cPHFilter$txtAccountName
     */
/* 	public void Enter_ctl00cPHFiltertxtAccountName(String ctl00cPHFiltertxtAccountName) throws InterruptedException, IOException
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtAccountNameElem);

 		if (elem == null) 
 		{
   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAccountName", "Enter_ctl00cPHFiltertxtAccountName failed. Unable to locate object: " + ctl00cPHFiltertxtAccountNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAccountName", "Enter_ctl00cPHFiltertxtAccountName failed. Unable to locate object: " + ctl00cPHFiltertxtAccountNameElem.toString());

			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAccountNameElem.toString());
         }
 		  
 		
 		
// 		
// 		utilities.nominalcode ns=new utilities.nominalcode(m_Driver);
// 		java.util.List<String> ps=ns.excelcode();
// 		int k=ps.size();
// 	 		for(int i=1;i<k;i++)
// 		
// 		{
// 			String js=ps.get(i);
// 		
// 			elem.sendKeys(js);
// 			elem.sendKeys(Keys.ENTER);
// 			java.util.List<WebElement> allCells = m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/table/tbody/tr"));
// 			int rowsize=allCells.size();
// 		if(rowsize>0)
// 		{
// 			elem.clear();
// 			
// 			elem.sendKeys(Keys.ENTER);
// 			break;
// 		}
// 		
// 		else
// 		{
//             elem.clear();
// 			
// 			elem.sendKeys(Keys.ENTER);
// 			System.out.print("name is not present" +js);
// 			break;
// 			
// 		}
// 		}
 		
 		String jsy=ctl00cPHFiltertxtAccountName;
        System.out.println("Search Code Name Existed in interface :" +jsy);
		jsExec.executeScript("arguments[0].value='"+ctl00cPHFiltertxtAccountName +"';",elem);
		GetScreenShot.captureAsImage(m_Driver, ctl00cPHFiltertxtAccountName);
		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAccountName " + ctl00cPHFiltertxtAccountName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAccountName " + ctl00cPHFiltertxtAccountName);
 	}
*/
     




	public void Click_Search() throws EncryptedDocumentException, IOException, InterruptedException
	{
		SoftAssert af=new SoftAssert();
       		 
jsExec.executeScript("arguments[0].scrollIntoView(true);",  m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHFooter_PageUC1_rptrPager_ctl01_liContainer']/a")));
java.util.List<WebElement> li =m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[5]/div/div/ul//following::li"));

int pgcount = li.size()-2;
       
System.out.println("pgcount"+pgcount);


if(pgcount >1)
{
    System.out.println("pgcount >1");
   
   
    for (int i=2; i<pgcount+2;i++)
    {

        System.out.println("for1");
        m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[5]/div/div/ul//following::li["+i+"]")).click();
                     int k=i-1;
        System.out.println("records in page" +k);
       java.util.List<WebElement> L2 =m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/table/tbody/tr/td[1]"));
       for(int jp=0;jp<L2.size();jp++)
       {
    	   String cp=L2.get(jp).getText();
    	   li4.add(jp, cp);
       }
     
    }
	
	System.out.println("li4 size   :" +li4.size());
    for(int yp=0;yp<li4.size();yp++)
    	
    {
    	System.out.println("WebTable Data   :" +li4.get(yp));
    
    }
           int counter=0;
        FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
     
         Workbook wb =  WorkbookFactory.create(fis);
         Sheet sht = wb.getSheet("sm-311_nominalcode");
         int iRowNum= sht.getLastRowNum();
         System.out.println("rows " +iRowNum);
//         // Iterate through each rows one by one
                  for(int i=1; i<=iRowNum; i++)
                  {
                	counter=0;  
                	String st=sht.getRow(i).getCell(5).toString();
                	  System.out.println("excel data: " +st);
                	  for(int h=0;h<li4.size();h++)
{
	
	//	if(st.contains(li4.get(h)))
	if(st.equalsIgnoreCase(li4.get(h)))
	{
		System.out.println(li4.get(h) + "="  +st);
		counter++;
		break;
	}
}
                	  
                  }
}
	}
}

                	  
                	  

/*if(counter==0)
{

af.assertEquals(0, 1,"Text not match="+st);

    //assertEquals(0, 1,"Text not match="+st);              		  
                	  }

        }
        }
af.assertAll();

	}*/

                  

       




	
	
	
	
	
	
	

