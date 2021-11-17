package pages.FIN3821;

import pages.BasePage;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5a7432c2-4cd5-43b5-8289-8017ac44aae7
@TestModellerModule(guid = "5a7432c2-4cd5-43b5-8289-8017ac44aae7")
public class Pendingrcpt extends BasePage
{
	public Pendingrcpt (WebDriver driver)
	{
		super(driver);
	}


	
	private By Pending_ReceiptElem = By.xpath("/html/body/form/main/div[5]/div[3]/div/div[5]/div[2]/div[1]/div/div/div[2]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Pending_Receipt
     * @name Click Pending_Receipt
     */
	public void Click_Pending_Receipt()
	{
        
		WebElement elem = getWebElement(Pending_ReceiptElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pending_Receipt", "Click_Pending_Receipt failed. Unable to locate object: " + Pending_ReceiptElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pending_Receipt", "Click_Pending_Receipt failed. Unable to locate object: " + Pending_ReceiptElem.toString());

			Assert.fail("Unable to locate object: " + Pending_ReceiptElem.toString());
        }

		WebElement prcpt=m_Driver.findElement(By.xpath("//*[@id='DivMoreopt']/div[2]/div[1]/div/div/div[2]/div/div/a[1]/div[1]/h3"));
		String prcptcount=prcpt.getText();
		System.out.println("dasboard count of pending receipt is :" +prcptcount);
		
		int verify=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_divSubContent']/div[2]/table/tbody/tr")).size();
		  
		
		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pending_Receipt");

		TestModellerLogger.PassStep(m_Driver, "Click_Pending_Receipt");
	}
}