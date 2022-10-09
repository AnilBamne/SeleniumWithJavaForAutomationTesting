package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getRowSize_InASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\12thMarB.xlsx");

		int rowsize = WorkbookFactory.create(file).getSheet("sheet2").getLastRowNum()+1;
		System.out.println(rowsize);
		
		
		
		
	}

}
