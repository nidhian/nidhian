package utilities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class Vattypeverification extends BasePage
{
	public static int vatamt;
	


	public Vattypeverification(WebDriver driver)
	
	{
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static int Vattypeverfy(String actVattype, String Recivedamt)
	{
   
	        int amt=Integer.parseInt(Recivedamt);
	       
	        System.out.println(amt);
	      
	        if(actVattype.equalsIgnoreCase("Standard Rate"))
	         {
	         
	        	
	        	vatamt=(amt*20)/(100+20);
	        	
	                 System.out.println(vatamt);
	                
	             }
	        else if(actVattype.equalsIgnoreCase("STANDARD VAT"))
	             {
	        	vatamt=(amt*5)/(100+5);
	                 System.out.println(vatamt);
	             }
	        else
	        {
	        	vatamt=0;
	        	
	        } 
	        System.out.println(vatamt);
	       
	          return vatamt;
	 
	}

	
		
	}
	
	
