package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogoutPom {
	public WebDriver driver;
	
	LogoutPom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	

}
