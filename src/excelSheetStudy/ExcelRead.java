package excelSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream myFile=new FileInputStream("D:\\Selenium\\ExcelSheetReading\\Practice.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		int row = mySheet.getLastRowNum();
		short cellNum = mySheet.getRow(0).getLastCellNum();
		int cell=cellNum-1;
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=cell;j++) {
				Cell cellValue = mySheet.getRow(i).getCell(j);
				CellType type = cellValue.getCellType();
				switch(type) {
				case STRING:{
					String value = cellValue.getStringCellValue();
					System.out.print(value+" ");
					break;
				
				}
				case NUMERIC:{
					double value = cellValue.getNumericCellValue();
					System.out.print(value+" ");
					break;
				}
				case BOOLEAN:{
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value+" ");
					break;
				}
				default:
					break;
				}
				
			}System.out.println();
		}

	}

}
