package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ClosePopup extends BasePage
{
	public ClosePopup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static boolean ValidateAndPopUp(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);//*[@id="c8097a60-d739-7c08-3ea4-71b038515d0d"]
 //WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));
 //WebElement ele = driver.findElement(By.xpath("//*[@id='5b258dc2-c6ff-42aa-8c2b-754a39b6b7ae']"));
	            WebElement ele = driver.findElement(By.xpath("//*[@id='11394c15-ac28-4325-a3b7-d45ca1f10148']"));
	            //WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));
	          //  WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
            // WebElement ele = driver.findElement(By.xpath("//*[@id='72006fc1-1c44-403e-a8f8-af3bbec4d50e']"));
	           // WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));
	            
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
	
	public static boolean ValidateAndPopUp1(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	            WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	           // WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
	         
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
}
