package read_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_library {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Excel_library() throws Exception
	{
		String excelpath = "C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\Testdata\\Datatest.xlsx";
		File file = new File(excelpath);
		FileInputStream filemain = new FileInputStream(file);
		wb =new XSSFWorkbook(filemain);
	} 
	
	public String readData(String sheetname, int row, int col)
	{
		sheet = wb.getSheet(sheetname);
		String data =sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	

}
