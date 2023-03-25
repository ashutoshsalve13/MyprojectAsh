package read_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Excel {
	@Test
	public void readExcel() throws Exception
	{
		String excelpath = "C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\Testdata\\Datatest.xlsx";
		String filename = "Datatest";
		String sheetname = "Sheet1";
		
		File file = new File(excelpath);
		
		FileInputStream filemain = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(filemain);
	   XSSFSheet sheet= wb.getSheet(sheetname);
	   int rowcount  = sheet.getLastRowNum();
	   System.out.println("total  row count is =  "+rowcount); 
	   
	   String value = sheet.getRow(0).getCell(1).getStringCellValue();
	   
	   System.out.println(value);
	   
	   for(int i=0; i<=rowcount; i++)
	   {
		   Row row=  sheet.getRow(i);
		   for(int j =0; j<row.getLastCellNum();j++)
		   {
			   String value2 =sheet.getRow(i).getCell(j).getStringCellValue();
			   System.out.print(value2+"     ");
			   
		   }
		   System.out.println();
	   }
		
		wb.close();
		
	}

}
