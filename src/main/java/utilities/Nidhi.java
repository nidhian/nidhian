package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Nidhi 
{
	 static String sData[]=null;
	 static int i;
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	

	
	{
		  
           FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
        
            Workbook wb =  WorkbookFactory.create(fis);
            Sheet sht = wb.getSheet("Banking");
            int iRowNum= sht.getLastRowNum();

                     for(i=1; i<=iRowNum; i++)
                     {
                   	  String st=sht.getRow(i).getCell(5).toString();
                   	  System.out.println(" " +st);
                   	 
              
            
            }
	}
                      
	} 

