package tpay_testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import tpay_baseClass.Orignal_baseClass;
import tpay_dataProvider.DataProvider_FB;

public class Test_fbTestdata extends Orignal_baseClass {
	
	WebDriver driver;
	@Test(dataProviderClass = DataProvider_FB.class , dataProvider = "dataProvide1" )
	public void testinFB(String name, String Surname) throws Exception
	{   
		System.out.println(name+Surname);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder=\\\"Password\\\"]")).sendKeys(Surname);
		Thread.sleep(1000);
	}

}
