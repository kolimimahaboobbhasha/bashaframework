package POMpages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.JSONUtility;

public class Instagramlogin {
  public WebDriver driver;
  JSONUtility json=new JSONUtility();
	public Instagramlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='userLoginId']")
	WebElement Uname;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement Pword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login;
	public WebElement getUname() {
		return Uname;
	}
	public WebElement getPword() {
		return Pword;
	}
	public WebElement getLogin() {
		return Login;
	}
	//business library
    public void applaunch() throws IOException, ParseException, InterruptedException
    { 
    	Uname.sendKeys(json.getDataFromJsoNfile("USERNAME"));
    	Pword.sendKeys(json.getDataFromJsoNfile("PASSWORD"));
    	Login.click();
    }}

