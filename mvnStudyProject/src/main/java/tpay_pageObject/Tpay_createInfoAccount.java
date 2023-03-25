package tpay_pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tpay_actionMethod.Action;
import tpay_baseClass.Orignal_baseClass;

public class Tpay_createInfoAccount extends Orignal_baseClass{
	
	@FindBy(xpath = "\"//input[@name='firstname']\"")
	WebElement  Name_holder;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement Surname_holder;
	
	
	public Tpay_createInfoAccount()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Object input_name(String Name)
	{
		Action.type(Name_holder, "Ashutosh");
		Action.type(Surname_holder, "Salve");
		
		return homepage();
		
	}

	private Object homepage() {
		// TODO Auto-generated method stub
		return null;
	}

}
