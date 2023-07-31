package practiceTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String getDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream myFile=new FileInputStream("");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void getScreenshot(WebDriver driver,String file) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Selenium\\Screenshot"+file+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void waitTime(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static String getDataFromProperty(String key) throws IOException {
		FileInputStream myfile=new FileInputStream("C:\\Users\\Palya\\eclipse-workspace\\PractSelenium\\A.properties");
		Properties mp=new Properties();
		mp.load(myfile);
		String value = mp.getProperty(key);
		return value;
		
	}

}

