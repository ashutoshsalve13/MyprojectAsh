package tpay_actionMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Return;
import tpay_baseClass.Orignal_baseClass;

public class Action extends Orignal_baseClass {
	
	public static void click(WebDriver driver , WebElement locatorName)//click
	{
		Actions act = new Actions(driver);
		act.moveToElement(locatorName).click().build().perform();
	}
	
	public static boolean findElement(WebDriver driver, WebElement ele)//displayed element
	{
		boolean flag = false;
		try
		{
			ele.isDisplayed();
			flag = true;
		}
		catch(Exception e)
		{
			flag =false;
			System.out.println("location not found;  "+ele);
		}
		finally
		{
			if(flag)
			{
				System.out.println("succesfully found element");
			}
			else
			{
				System.out.println("succesfully found element");
			}
		}
		return flag;
	}
	
	//isDesplayed
	public static boolean isDesplayed(WebDriver driver , WebElement ele)
	{
		boolean flag = false;
		 flag = findElement(driver, ele);
		if(flag)
		{
			flag= ele.isDisplayed();
		if(flag)
		{
			System.out.println("the element is displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		}
		else
		{
			System.out.println("not displayed");
		}
		return flag;
		}


//isSelected
	public static boolean isSelected(WebDriver driver , WebElement ele)
	{
		boolean flag = false;
		flag = findElement(driver, ele);
		if(flag)
		{
			flag= ele.isSelected();
		if(flag)
		{
			System.out.println("the element is Selected");
		}
		else
		{
			System.out.println("not Selected");
		}
		}
		else
		{
			System.out.println("not Selected");
		}
		return flag;
		}
	
	
//sendkeys
      public static boolean type(WebElement ele, String text)
     {
	  boolean flag = false;
	  try {
		  flag = ele.isDisplayed();
		  ele.clear();
		  ele.sendKeys(text);
		  flag =true;
	  }
	  catch(Exception e)
	  {
		  System.out.println("location not found");
		  flag=false;
	  }
	  finally {
		if(flag)
		{
			System.out.println("successfully value enter");
		}
		else
		{
			System.out.println("unable enter value");
		}
	} return flag;
     }
}

	



