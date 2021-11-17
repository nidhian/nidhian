package pages.UX1804;

import pages.BasePage;
import pages.Library;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class addashboard_2 extends BasePage
{
	
	private static final List<WebElement> WebElement = null;
	public static String actreciptdashboard;
	public addashboard_2 (WebDriver driver)
	{
		super(driver);
	}

	private By Pending__ReceiptElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[1]/a[2]");



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
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }
    
     
	/**
 	 * Click Pending _Receipt
     * @name Click Pending _Receipt
     */
	public void Click_Pending__Receipt()
	{
        
		WebElement elem = getWebElement(Pending__ReceiptElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pending__Receipt", "Click_Pending__Receipt failed. Unable to locate object: " + Pending__ReceiptElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pending__Receipt", "Click_Pending__Receipt failed. Unable to locate object: " + Pending__ReceiptElem.toString());

			Assert.fail("Unable to locate object: " + Pending__ReceiptElem.toString());
        }
    WebElement rcpt=m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[1]/a[2]/div/div/div/h1/strong"));

		String pendingrecipt=rcpt.getText();
		System.out.println("Receiptcount in dashboard  :"   +pendingrecipt);
		 actreciptdashboard=pendingrecipt.replace("[£]","");
		System.out.println("After replacement of splchr  :" +actreciptdashboard);
		
		int p=Integer.parseInt(actreciptdashboard);
		
		System.out.println("After replacement of splchr  :" +p);
		jsExec.executeScript("arguments[0].click()",elem);
			 	 	

		int wbtb =m_Driver.findElements(By.xpath("//*[@id='ctl00_divSubContent']/div[4]/div/table/tbody/tr")).size();       
	 System.out.println("upropcess rcpt  -----:"     +wbtb);
				
    SoftAssert as=new SoftAssert();
	 
   as.assertEquals(wbtb, p);
   as.assertAll();
     
		 	
		
		ExtentReportManager.passStep(m_Driver, "Click_Pending__Receipt");

		TestModellerLogger.PassStep(m_Driver, "Click_Pending__Receipt");
	
	}
//   public static String reiptno()
//   {
//	System.out.println(" RETURN NO :"    +actreciptdashboard);
//	
//	return actreciptdashboard;
//   }
	
	
 
}