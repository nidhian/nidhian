package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testutil 

{
	static Workbook wb;
	 static Sheet sht;
	public static String path="D:\\testdata07oct.xlsx";
	public static Object[][]  TESTDATA(String sheet) throws InvalidFormatException, EncryptedDocumentException, IOException
	
	{
		FileInputStream fis = new FileInputStream(path);
        
       wb =  WorkbookFactory.create(fis);
        sht = wb.getSheet(sheet);
       Object[][] data=new Object[sht.getLastRowNum()][sht.getRow(1).getLastCellNum()];
       for(int i=1;i<sht.getLastRowNum();i++)
       {
    	   for(int j=0;i<sht.getRow(1).getLastCellNum();j++)
    	   {
    		   data[i][j]=sht.getRow(i+1).getCell(j).toString();
    	   }
       }
       return data;
	}
	
}

