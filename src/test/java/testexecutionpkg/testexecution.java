package testexecutionpkg;


import pages.Loginpage;
import utility.Launchapp;

public class testexecution 
{
	public static void main(String[] args) 
	{
		Launchapp l=new Launchapp();
		l.openbrowser("F:\\CJC\\testing software\\chromedriver_win32\\chromedriver.exe");
		l.enterurl("http://newtours.demoaut.com/");
		l.maximizebrowser();
		
		Loginpage g=new Loginpage();
		g.loadloginpage();
		g.enterusername("ankita4");
		g.enterpassword("ankita4");
		g.clickonlogin();
		
	}

}
