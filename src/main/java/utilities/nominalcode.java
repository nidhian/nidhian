package utilities;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class nominalcode 

{
	
	
	 static int i;
	 static String st;
	public static  java.util.List<String> nid ;

	public nominalcode(WebDriver driver)
	
	{
		
		super();
		// TODO Auto-generated constructor stub
}
	public static java.util.List<String> excelcode() throws EncryptedDocumentException, IOException
	{
		
		 nid = new ArrayList<String>();
		 
        FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
     
         Workbook wb =  WorkbookFactory.create(fis);
         Sheet sht = wb.getSheet("sm-311");
         int iRowNum= sht.getLastRowNum();
//         // Iterate through each rows one by one
                  for(i=1; i<=iRowNum; i++)
                  {
                	st=sht.getRow(i).getCell(5).toString();
                	  System.out.println(" " +st);
                	  nid.add(st);
                	  
		
		
	}
	
                  
                 return nid;
}
}