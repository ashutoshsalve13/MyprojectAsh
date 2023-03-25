package tpay_testScripts;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import io.netty.handler.codec.http.HttpContentEncoder.Result;
import tpay_actionMethod.Action;
import tpay_baseClass.Orignal_baseClass;
import tpay_pageObject.Tpay_createInfoAccount;

@Listeners(tpay_utility.ListenerClass.class)
public class Tpay_TestIndex_page extends Orignal_baseClass {
	
	@Test
	public void testcase1() throws IOException 
	{
		boolean A = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).isDisplayed();
		 Assert.assertTrue(A);
		 System.out.println(A);
		 if(A==true)
		 {
			System.out.println("pass=============");
		 }
		 else
		 {
			 Orignal_baseClass.SSimg(driver, "rttyyy");
		 }
		
		
		
	}
	@Test
	public void testcase11() throws IOException 
	{
		String B =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).getAttribute("data-testid");
		//open-registration-form-button
		String C= "data-testid";
		
		if(B==C)
		{
			System.out.println("passss++++++++++===============");
		}
		else
		{
			System.out.println("fail name===============");
			Orignal_baseClass.SSimg(driver, "yutt2");
		}
		
	}
	@Test
	public void Input() throws IOException, InterruptedException
	{
		Tpay_createInfoAccount in_put =new Tpay_createInfoAccount();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		in_put.input_name("ashutosh");
		Thread.sleep(5000);
		Orignal_baseClass.SSimg(driver, "yutt4855");
		
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
