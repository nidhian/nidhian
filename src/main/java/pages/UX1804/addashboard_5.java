package pages.UX1804;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class addashboard_5 extends BasePage
{
	public static String gt;
	public addashboard_5 (WebDriver driver)
	{
		super(driver);
	}


	private By ctl00ddlFinancialYearElem = By.xpath("//*[@id='ctl00_ddlFinancialYear']");

	//private By Sales_dashElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[2]/div[1]");
	private By Sales_dashElem=By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[2]/div[1]/div[3]/div/h1/strong");

	

	
	public void GoToUrl() throws InterruptedException
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
		Thread.sleep(9000);

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
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Sales_dash
	 * @throws InterruptedException 
     * @name Click Sales_dash
     */
	public void Select_ctl00ddlFinancialYear(String ctl00ddlFinancialYear) throws InterruptedException
 	{
		
 		WebElement elem = getWebElement(ctl00ddlFinancialYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
         }
 		elem.sendKeys(Keys.ENTER);

 		Select dropdown = new Select(elem);
 		elem.sendKeys(Keys.ARROW_DOWN);

 		dropdown.selectByVisibleText(ctl00ddlFinancialYear);
 		Thread.sleep(9000);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);
 		
 		
 	}

	public void Click_Sales_dash()
	{
		
//		WebElement elem = getWebElement(Sales_dashElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales_dash", "Click_Sales_dash failed. Unable to locate object: " + Sales_dashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales_dash", "Click_Sales_dash failed. Unable to locate object: " + Sales_dashElem.toString());
//
//			Assert.fail("Unable to locate object: " + Sales_dashElem.toString());
//        }
//
//		elem.click();
	//	WebElement saleamt=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[2]/div[1]/div[3]/div/h1/strong" ));
		WebElement salesamt=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[2]/div[1]/div[3]/div/h1/strong"));
				
String gtf=salesamt.getText();
gt= gtf.replaceFirst("[£]","");
//gtf.replaceAll("£","");
//gtf.replaceAll("[^0-9]","");
  
System.out.println("Dashboard saleamoutn :" +gt);

          	

		ExtentReportManager.passStep(m_Driver, "Click_Sales_dash");

		TestModellerLogger.PassStep(m_Driver, "Click_Sales_dash");
	}
public String amt2()
{
	return gt;
}
     
	
 	}
