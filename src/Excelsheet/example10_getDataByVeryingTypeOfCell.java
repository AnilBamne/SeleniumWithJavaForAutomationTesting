  package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10_getDataByVeryingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		 Cell cellinfo = sh.getRow(2).getCell(1);
		 CellType s1 = cellinfo.getCellType();
		 
		 if(s1==CellType.STRING)
		 {
			 System.out.println(cellinfo.getStringCellValue());
		 }
		
		 else if(s1==CellType.NUMERIC)
		 {
			 System.out.println(cellinfo.getNumericCellValue());
		 }
		 else if(s1==CellType.BOOLEAN)
		 {
			 System.out.println(cellinfo.getBooleanCellValue());
		 }
		
		
		
	}

}