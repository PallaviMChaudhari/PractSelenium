package zohoPom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void waitTime(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static String readDataFromExcel(int row,int cell) throws IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\Zoho.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	} 
	
	public static void TakingScreenshots(WebDriver driver,String file) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\Selenium\\Screenshot\\"+file+".png");
		FileHandler.copy(src, dest);
		
	}
	
	public static String readDataFromProperties(String key) throws IOException {
	     Properties pr=new Properties();
	     FileInputStream myFile= new FileInputStream("C:\\Users\\Palya\\eclipse-workspace\\PractSelenium\\Abc.properties");
	     pr.load(myFile);
	     String value = pr.getProperty(key);
	     return value;
	}

}
