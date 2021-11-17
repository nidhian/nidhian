package pages.UX1804;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class addashboard_4 extends BasePage
{

	public static String DSamt2;
	public addashboard_4 (WebDriver driver)
	{
		super(driver);
	}


	
	
	private By Unallocated_PurchaseElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[1]/a[4]/div/div/div");

	


	
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
 	 * Click Unallocated_Purchase
	 * @throws IOException 
     * @name Click Unallocated_Purchase
     */
	public void Click_Unallocated_Purchase() throws IOException
	{
        
		WebElement elem = getWebElement(Unallocated_PurchaseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unallocated_Purchase", "Click_Unallocated_Purchase failed. Unable to locate object: " + Unallocated_PurchaseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unallocated_Purchase", "Click_Unallocated_Purchase failed. Unable to locate object: " + Unallocated_PurchaseElem.toString());

			Assert.fail("Unable to locate object: " + Unallocated_PurchaseElem.toString());
        }
		
		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
		WebElement DSamt=m_Driver.findElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[9]/div[1]/a[4]/div/div/div/h1/strong"));
	
//WebElement t=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[1]/a[4]/div/div/div/h1/strong"));
		
    DSamt2=DSamt.getText();
    System.out.println("Dashboard visible amount:"    +DSamt2);
    
         	 
  
		ExtentReportManager.passStep(m_Driver, "Click_Unallocated_Purchase");

		TestModellerLogger.PassStep(m_Driver, "Click_Unallocated_Purchase");
		elem.click();
	  	
	}

	
	public String unsalevalue1()
	{
		System.out.print("Retruned value" +DSamt2);
		return DSamt2;
		
	}
     
 	}
