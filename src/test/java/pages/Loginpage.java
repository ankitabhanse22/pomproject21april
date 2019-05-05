package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configpkg.config;

public class Loginpage 

{
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	public void loadloginpage()
	{
		PageFactory.initElements(config.driver, this);
	}
	
	public void enterusername(String usernm)
	{
		System.out.println("In enterusername method");
		objusername.sendKeys(usernm);
	}
	public void enterpassword(String passwd)
	{
		System.out.println("In enterpassword method");
		objpassword.sendKeys(passwd);
	}
	public void clickonlogin()
	{
		System.out.println("In clickonlogin method");
		objlogin.click();
	}

}
