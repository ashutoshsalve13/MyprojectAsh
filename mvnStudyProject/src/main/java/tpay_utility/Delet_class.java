package tpay_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Delet_class {
	
	public static void main (String args[]) throws Exception
	{
		FileInputStream A = new FileInputStream("C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\src\\test\\resources\\TestData\\TestDataSheet.xlsx");
//		String B = WorkbookFactory.create(A).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
//		System.out.println(B);
		
		
		org.apache.poi.ss.usermodel.CellType C = WorkbookFactory.create(A).getSheet("Sheet1").getRow(1).getCell(0).getCellType();
		System.out.println(C);
		
		for(int i=0; i<=9; i++)
		{
			for(int j =0;j<=1;j++)
			{
				String B = WorkbookFactory.create(A).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print("  "+B);
			}
		} 
		
	}

}
