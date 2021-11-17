package pages.UX1804;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class addashboard_Adbtn extends BasePage
{
	public addashboard_Adbtn (WebDriver driver)
	{
		super(driver);
	}


	
	

//	private By Advanc_btn_top_rightElem = By.xpath("//A[@href='/AccountUI/DefaultAdvance.aspx?FYCode=52444&CompanyCode=13236']");

	private By Advanc_btn_top_rightElem = By.xpath("//*[@id='ctl00_divSubContent']/div[8]/a");
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
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     

     
	/**
 	 * Click Advanc_btn_top_right
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click Advanc_btn_top_right
     */
	public void Click_Advanc_btn_top_right() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(Advanc_btn_top_rightElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advanc_btn_top_right", "Click_Advanc_btn_top_right failed. Unable to locate object: " + Advanc_btn_top_rightElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advanc_btn_top_right", "Click_Advanc_btn_top_right failed. Unable to locate object: " + Advanc_btn_top_rightElem.toString());

			Assert.fail("Unable to locate object: " + Advanc_btn_top_rightElem.toString());
        }

	//	elem.click();
		jsExec.executeScript("arguments[0].click()", elem);
          	

//		ExtentReportManager.passStep(m_Driver, "Click_Advanc_btn_top_right");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Advanc_btn_top_right");
				
		GetScreenShot.captureAsImage(m_Driver,"OLDDASHBOARDVIEW");
		
	}

     
 	}
