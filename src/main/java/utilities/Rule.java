package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rule 
{

	
	public static void rulecreate (String sheetName,int rowNum,int colNum,String des) throws EncryptedDocumentException, IOException
	
	
	
	{
	
		 File src=new File("‪C:\\Users\\Nidhi\\Desktop\\test.xlsx");
         FileInputStream fis = new FileInputStream(src);
         Workbook wb = WorkbookFactory.create(fis);
         Sheet sht = wb.getSheet(sheetName);
            sht.getRow(rowNum).createCell(colNum).setCellValue(des);
         FileOutputStream fout=new FileOutputStream(src);
         wb.write(fout);
         wb.close();
		

	}

	

}
