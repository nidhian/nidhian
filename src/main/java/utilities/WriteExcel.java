package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel 
{

	public static String[] toWriteExcelData(String sTestCaseID,String sheet) throws InvalidFormatException
	{
	
	String WData[]=null;
    try
    {
       FileInputStream fis = new FileInputStream("D:\\testdata07oct.xlsx");
    
        Workbook wb =  WorkbookFactory.create(fis);
        Sheet sht = wb.getSheet(sheet);
        int iRowNum= sht.getLastRowNum();
       
        for(int i=1; i<=iRowNum; i++)
        {
            if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
            {
                int iCellNum=sht.getRow(i).getLastCellNum();
                WData= new String[iCellNum];
               
                for(int j=0; j<iCellNum; j++)
                {
                	DataFormatter formatter = new DataFormatter();
                	Cell cell = sht.getRow(i).getCell(j);
                	WData[j] = formatter.formatCellValue(cell);
                	 
                	//sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
                }
               
                break;
            }
        }
    	FileOutputStream fos = new FileOutputStream("D:\\TestModeller-JavaSeleniumFramework-master\\BankTransactionUploadSample.csv");
    	wb.write(fos);
    	fos.close();

    }
   
catch(EncryptedDocumentException ex){
    ex.printStackTrace();
}
catch(IOException ex){
    ex.printStackTrace();
}
    return WData;
   
 }


}



