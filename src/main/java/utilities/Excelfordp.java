package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelfordp 


{
	static Workbook wb;
	static Sheet sh;

	static Object[][] Data;
	static int i;
	static int j;
	public static Object[][] ReadExcelData(String sheet) throws InvalidFormatException, IOException	
	
	
	{
			
			FileInputStream fs = new FileInputStream("D:\\testdata07oct.xlsx");
			wb = new XSSFWorkbook(fs);
			 sh= wb.getSheet(sheet);
		Data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
			
		
			//Data = new String[rowCount-1][columncount];	 
		
			for (i= 1 ;i<sh.getLastRowNum(); i++) 
			{
			for (j=1; j<sh.getRow(0).getLastCellNum(); j++) 

				//for (int j=0;j<=0;j++) 
				{
					Data[i-1][j-1]=sh.getRow(i).getCell(j);
					System.out.println(Data[i][j]);
				}
			}
			
		
				
//					Data[i][5]=sh.getRow(i+1).getCell(5);
///				System.out.println(Data[i][5]);
//			
			return Data;

			}
	
}
	



		
	