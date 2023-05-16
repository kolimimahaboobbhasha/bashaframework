package POMpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LoginPage extends BaseClass {
	 WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='frmLogin_txtUserName']")
	private WebElement Uname;
	@FindBy(xpath="//input[@id='frmLogin_txtPassword']")
	private WebElement Pword;
	@FindBy(xpath="//input[@id='frmLogin_btnLogin']")
	private WebElement SignUp;
	public void Username() throws IOException
	{  
		
		Uname.sendKeys(properties.getDataFromPropertyUtility("USERNAME"));
	}
	public void Password() throws IOException
	{  
		
		Pword.sendKeys(properties.getDataFromPropertyUtility("PASSWORD"));
	}
	public void Login()
	{
		SignUp.click();
	}

}
