package POMpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PropertyUtility;

public class SickLeavePagePom{
	PropertyUtility properties =new PropertyUtility();
public WebDriver driver;
	public SickLeavePagePom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
  @FindBy(xpath="//div[normalize-space()='Messages']//div[@id='flxLeftMenuItem_lblMenuItem']")
  private WebElement click1;
  @FindBy(xpath="//input[@id='frmCSR_mainHeader_btnAddNewOption']")
  private WebElement click2;
  @FindBy(xpath="//input[@id='frmCSR_mainHeader_btnDropdownList']")
  private WebElement click3;
 
  
  public WebElement getClick1() {
		return click1;
	}
	public WebElement getClick2() {
		return click2;
	}
	public WebElement getClick3() {
		return click3;
	}
	//public WebElement getTempmsg() {
		//return Tempmsg;
	//}
//	public WebElement getMsg() {
//		return Msg;
//	}
//	public WebElement getSave() {
//		return save;
//	}
	//Bussiness library
	public void LeaveLetter() throws IOException
	{
       click1.click();
       click2.click();
       //Tempmsg.sendKeys(properties.getDataFromPropertyUtility("MSGBODY"));
//       Msg.sendKeys(properties.getDataFromPropertyUtility("LEAVELETTER"));
//       save.click();
       
  
  
 
	}
}