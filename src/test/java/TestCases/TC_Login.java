package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMpages.LoginPage;


public class TC_Login extends BaseClass {
	@Test
	public void applaunch() throws InterruptedException, IOException
	{ 
		LoginPage app=new LoginPage(driver);
		app.Username();
		app.Password();
		app.Login();
		wlib.takeScreenShot(driver, "file1.png");
	}

}
