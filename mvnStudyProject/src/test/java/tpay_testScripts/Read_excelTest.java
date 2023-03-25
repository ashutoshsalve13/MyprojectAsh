package tpay_testScripts;

import org.testng.annotations.Test;

import read_excel.Excel_library;

public class Read_excelTest {
	
	@Test
	public void readexcel() throws Exception
	{
		Excel_library obj = new Excel_library();
		String data2 =obj.readData("Sheet1", 5, 1);
		System.out.println(data2);
	}

}
