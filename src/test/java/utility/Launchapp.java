package utility;

import org.openqa.selenium.chrome.ChromeDriver;

import configpkg.config;

public class Launchapp 
{
	public void openbrowser(String browsernm)
	{
		System.setProperty("webdriver.chrome.driver", browsernm);
		config.driver =new ChromeDriver();
		
	}
	
	public void enterurl(String urlnm)
	{
		config.driver.get(urlnm);
	}
	
	public void maximizebrowser()
	{
		config.driver.manage().window().maximize();
	}
	public void closebrowser()
	{
		config.driver.close();
	}

}
