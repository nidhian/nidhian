package pages.UX1804;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cba9e2d2-adfd-437d-ae75-af0c3bfe3db6
@TestModellerModule(guid = "cba9e2d2-adfd-437d-ae75-af0c3bfe3db6")
public class Bank_Verifynames extends BasePage
{
	  public static List<String> s=new ArrayList<String>();
	public Bank_Verifynames (WebDriver driver)
	{
		super(driver);
	}


	
	private By Bank_menu2Elem = By.xpath("//A[@href='../AccountUI/BankTran.aspx?FYCode=52864&CompanyCode=13548&IsFirstRequest=1']");

	private By New__btn_bankElem = By.xpath("//A[@class='text-white']");

	private By Bank_Account_menuElem = By.xpath("//A[@href='BankAccount.aspx?FYCode=52864&CompanyCode=13548']");

	private By Account_Name_columnElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div[1]/div/div/div/div/table/thead/tr/th[1]");


	
	public void GoToUrl()
	
	//: //A[@href='../AccountUI/BankTran.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1']
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/BankAccount.aspx?FYCode=52864&CompanyCode=13548");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankAccount.aspx?FYCode=52864&CompanyCode=13548");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/BankAccount.aspx?FYCode=52864&CompanyCode=13548");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/BankAccount.aspx?FYCode=52444&CompanyCode=13236";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/BankAccount.aspx?FYCode=52444&CompanyCode=13236")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Bank_menu2
     * @name Click Bank_menu2
     */
	public void Click_Bank_menu2()
	{
        
		WebElement elem = getWebElement(Bank_menu2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bank_menu2", "Click_Bank_menu2 failed. Unable to locate object: " + Bank_menu2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bank_menu2", "Click_Bank_menu2 failed. Unable to locate object: " + Bank_menu2Elem.toString());

			Assert.fail("Unable to locate object: " + Bank_menu2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bank_menu2");

		TestModellerLogger.PassStep(m_Driver, "Click_Bank_menu2");
	}

     
	/**
 	 * Click New _btn_bank
     * @name Click New _btn_bank
     */
	public void Click_New__btn_bank()
	{
        
		WebElement elem = getWebElement(New__btn_bankElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New__btn_bank", "Click_New__btn_bank failed. Unable to locate object: " + New__btn_bankElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New__btn_bank", "Click_New__btn_bank failed. Unable to locate object: " + New__btn_bankElem.toString());

			Assert.fail("Unable to locate object: " + New__btn_bankElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New__btn_bank");

		TestModellerLogger.PassStep(m_Driver, "Click_New__btn_bank");
	}

     
	/**
 	 * Click Bank Account_menu
     * @name Click Bank Account_menu
     */
	public void Click_Bank_Account_menu()
	{
        
		WebElement elem = getWebElement(Bank_Account_menuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bank_Account_menu", "Click_Bank_Account_menu failed. Unable to locate object: " + Bank_Account_menuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bank_Account_menu", "Click_Bank_Account_menu failed. Unable to locate object: " + Bank_Account_menuElem.toString());

			Assert.fail("Unable to locate object: " + Bank_Account_menuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bank_Account_menu");

		TestModellerLogger.PassStep(m_Driver, "Click_Bank_Account_menu");
	}

     
	/**
 	 * Click Account Name_column
     * @name Click Account Name_column
     */
	public void Click_Account_Name_column()
	{
        
		WebElement elem = getWebElement(Account_Name_columnElem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Account_Name_column", "Click_Account_Name_column failed. Unable to locate object: " + Account_Name_columnElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Account_Name_column", "Click_Account_Name_column failed. Unable to locate object: " + Account_Name_columnElem.toString());
//
//			Assert.fail("Unable to locate object: " + Account_Name_columnElem.toString());
//        }

		elem.click();
          	

		//ExtentReportManager.passStep(m_Driver, "Click_Account_Name_column");

		//m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']//following::li")).size()
		
		
		
//WebElement tsize=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']//following::tr"));

 List<WebElement> cols = m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[3]/div[1]/div/div/div/div/table/tbody/tr/td[1]"));
 int columnsize=cols.size();
   System.out.println("columns in banking intervace " +columnsize);
   
       for(WebElement p:cols)
            {
            String bnkcol=p.getText();
            System.out.println("bnkcolmns :" +bnkcol);
            
            System.out.println("added data in list of  :" +s.add(bnkcol));
            	
            	
            }
        
}
		
	public List<String> bankname()
	{
				return s;
	}
}

