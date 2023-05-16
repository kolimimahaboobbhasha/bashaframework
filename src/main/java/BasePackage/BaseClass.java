package BasePackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Utilities.JSONUtility;
import Utilities.ListenersUtility;
import Utilities.LogUtility;
import Utilities.PropertyUtility;
import Utilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenersUtility.class)
public class BaseClass {
	protected WebDriverUtility wlib=new WebDriverUtility();
	protected PropertyUtility properties=new PropertyUtility();
	LogUtility log=new LogUtility();
	protected JSONUtility json=new JSONUtility();
	public static WebDriver driver=null;
	public static WebDriver sdriver;
	
	@Parameters("Browser")
	@BeforeClass
	public void setBrowser(String Browser) throws IOException, ParseException
	{
		if(Browser.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
			
			}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
	
	else if(Browser.equalsIgnoreCase("Internet Explorer"))
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
	else if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			log.info("successfully login");
			}
	else if(Browser.equalsIgnoreCase("IOS"))
	{
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		}
	else {
		System.out.println("Invalid Browser");
	}
		sdriver=driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	   // driver.get(json.getDatafromJSON("URL"));
		driver.get(properties.getDataFromPropertyUtility("URL"));
		log.info("successfully login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void appclose()
{
		driver.close();
	}
	

}
