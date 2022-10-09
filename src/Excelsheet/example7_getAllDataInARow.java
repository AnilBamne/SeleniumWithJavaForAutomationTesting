package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet2");
		
//		for(int i=0;i<=5;i++)
//		{
//			String value = sheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.print(value+" ");
//		}
		int cellindex = sheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=cellindex;i++)
		{
			String value = sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" | ");
		}
		
		
		
	}

}
