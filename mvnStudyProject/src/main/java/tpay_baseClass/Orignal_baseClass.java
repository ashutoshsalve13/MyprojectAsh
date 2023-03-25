package tpay_baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orignal_baseClass {
	
public static WebDriver driver;
private static Properties prop;

//@BeforeMethod
//public void loadOnfic()
//{
//	try
//	{
//		 prop =new Properties();
//		FileInputStream ip = new FileInputStream(System.getProperty("user.dir", "C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\Cofigration\\Config.properties"));
//		prop.load(ip);
//		
//	}
//	catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
//}

//public static void luanchApp()
//{
//	WebDriverManager.chromedriver().setup();
//	String browserNanme = prop.getProperty("browser");
//	
//	if(browserNanme.equalsIgnoreCase("chrome"))
//	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//	else if(browserNanme.equalsIgnoreCase("FireFox"))
//	{
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//	}
//	else if(browserNanme.equalsIgnoreCase("IE"))
//	{
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//	}
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get(prop.getProperty("url"));
//}
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\ASHUTOSH\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");	
		
	}
	
	public static void SSimg(WebDriver driver, String filename) throws IOException
	{
		
	
	TakesScreenshot obj1 = (TakesScreenshot) driver;
	File boja = obj1.getScreenshotAs(OutputType.FILE);
	File a = new File("C:\\Users\\ASHUTOSH\\eclipse\\java-2021-12\\eclipse\\workspace5Auto\\mvnStudyProject\\Screenshot\\"+filename+".png");
    
	  FileHandler.copy(boja, a);
	
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
