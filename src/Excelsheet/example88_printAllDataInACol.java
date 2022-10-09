package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example88_printAllDataInACol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new  FileInputStream("C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\12thMarB.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex;i++ )
		{
			CellType s = sh.getRow(i).getCell(0).getCellType();
			
			if(s==CellType.STRING)
			{
				String v = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(v);
			}
			else if(s==CellType.NUMERIC)
			{
				double v = sh.getRow(i).getCell(0).getNumericCellValue();
				System.out.println(v);		
			}
			else if(s==CellType.BOOLEAN)
			{
				boolean v = sh.getRow(i).getCell(0).getBooleanCellValue();
				System.err.println(v);
			}
			
		}
		
		
		
		
	}

}
