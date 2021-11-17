package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelread 
{
	public static Object[][] ReadExcelData(String sTestCaseID,String sheet) throws InvalidFormatException, EncryptedDocumentException, IOException
    {	 

	 FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
    
    Workbook wb =  WorkbookFactory.create(fis);
    Sheet sht = wb.getSheet(sheet);
    int iRowNum= sht.getLastRowNum();
	   Row row=sht.getRow(0);   //get my Row which start from 0   
	   
	    	int RowNum = sht.getPhysicalNumberOfRows();// count my number of Rows
	    	int ColNum= row.getLastCellNum(); // get last ColNum 
	    	
	    	Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
	    	
	     for(int i=0; i<RowNum-1; i++) //Loop work for Rows
	     {  
	   row= sht.getRow(i+1);
	     
	     for (int j=0; j<ColNum; j++) //Loop work for colNum
	     {
	     if(row==null)
	     Data[i][j]= "";
	     else 
	     {
	    Cell cell= row.getCell(j);
	     if(cell==null)
	     Data[i][j]= ""; //if it get Null value it pass no data 
	     else
	     {
	    	 DataFormatter formatter = new DataFormatter();
	     String value=formatter.formatCellValue(cell);
	     Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
	     }
	     }
	     }
	     }
	 
	    	return Data;
	    }
	}