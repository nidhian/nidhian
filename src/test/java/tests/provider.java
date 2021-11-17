package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class provider 
{
	@DataProvider(name = "sm-311")

	public Object[][] getData() throws IOException, EncryptedDocumentException, InvalidFormatException
	{
	Object[][] arrayObject =utilities.Excelfordp.ReadExcelData("sm-311");
		
		
	  //Object[][] str=arrayObject;
		

		return (arrayObject);
		
	}
	}
	

