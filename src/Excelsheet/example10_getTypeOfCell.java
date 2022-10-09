package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10_getTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		  FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");
		  Sheet sh = WorkbookFactory.create(file).getSheet("sheet3") ;
		  CellType type = sh.getRow(2).getCell(0).getCellType();
		  System.out.println(type);
		 
		
		
	}
}
