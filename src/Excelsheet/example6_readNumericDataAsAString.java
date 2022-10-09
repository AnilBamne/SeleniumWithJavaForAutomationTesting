package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_readNumericDataAsAString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
		
		// when storing data in a excel sheet prefix with single quote (ex: '100) it will be stored as string
		System.out.println(value);
		
		
		 
		
	}

}
