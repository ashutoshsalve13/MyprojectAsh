package tpay_testScripts;

import org.testng.annotations.Test;

import tpay_utility.NewExcelLibrary;

public class TestExcel {
	NewExcelLibrary object = new NewExcelLibrary("C:\\\\Users\\\\ASHUTOSH\\\\eclipse\\\\java-2021-12\\\\eclipse\\\\workspace5Auto\\\\mvnStudyProject\\\\Testdata\\\\Datatest.xlsx");
	
	
	@Test(priority = 1)
	public void testcase1()
	{
		int test1 = object.getRowCount("Sheet1");
		System.out.println(test1);
		
	}
	
	@Test(priority = 2)
	public void testcase2()
	{
		String test2 = object.getCellData("Sheet1", "password1", 4);
		System.out.println(test2);
		
	}
	
	@Test(priority = 3)
	public void testcase3()
	{
		String test3 = object.getCellData("Sheet1", 1, 4);
		System.out.println(test3);
		
	}
	
	@Test(priority = 4)
	public void testcase4()
	{
		object.setCellData("Sheet1", "ID", 4, "Ashutosh");
		//System.out.println(test1);
		
	}

}
