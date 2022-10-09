package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example77_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file = new  FileInputStream("C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\12thMarB.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastCellIndex;i++)
		{
			CellType s1 = sh.getRow(0).getCell(i).getCellType();
			if(s1==CellType.STRING)
			{
				String value = sh.getRow(0).getCell(i).getStringCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = sh.getRow(0).getCell(i).getNumericCellValue();
						System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				 boolean value = sh.getRow(0).getCell(i).getBooleanCellValue()
						;
						System.out.print(value+" ");
			}
		}
		
		
	}

}
