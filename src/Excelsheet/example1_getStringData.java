package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");

		// to get a string value from excell sheet----------------------------------------------
		
		
//		String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
//
//		 System.out.println(value );
		
		// example2==to get a numeric value from the sheet--------------------------------
		
		
//		double v = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue();
//		System.out.println(v);
		
		//example3==get boolian value from the sheet-----------------
		
		boolean boolian = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(boolian);
		
		
		
		
	}

}
