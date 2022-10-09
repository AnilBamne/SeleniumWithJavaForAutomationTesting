package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example8_printAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new  FileInputStream("C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\12thMarB.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet2");
		
		int rowindex = sheet.getLastRowNum();
		
		for(int i=0; i<=rowindex;i++)
		{
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
	}

}
