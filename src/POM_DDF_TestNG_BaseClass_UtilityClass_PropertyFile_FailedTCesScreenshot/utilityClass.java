package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class utilityClass {
	// This method is use to get test data from excel sheet
	// Need to provide 2 inputs: 1-rowIndex 2-colIndex
	// @AuthorName: Anil

	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\FrameworkData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}

	// This method is use to capture screenshot of webpage
	// need to provide 2 inputs: 1-webDriver object , TCID
	// @Author Name: Anil

	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\selenium\\Screenshots\\TestCaseID" + TCID + ".jpg");
		FileHandler.copy(scr, dest);
	}

	public static String getPFData(String key) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\propertyFile.properties");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
}
