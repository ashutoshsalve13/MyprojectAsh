package tpay_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tpay_utility.NewExcelLibrary;

public class DataProvider_FB {
	
	NewExcelLibrary object1 = new NewExcelLibrary("C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\Testdata\\Datatest.xlsx");
	
	
	@DataProvider(name="dataProvide1")
	public Object[][] dataProvide()
	{
		int rowcount = object1.getRowCount("Data11");
		int cellcount = object1.getColumnCount("Data11");
		Object [][] data=new Object[rowcount][cellcount];
		for(int i =0; i<rowcount;i++)
		{
			for(int j=0; j<cellcount;j++)
			{
				data[i][j]=object1.getCellData("Data11", j, i+1);				
		
			}
		}
		return data;
	}

}
