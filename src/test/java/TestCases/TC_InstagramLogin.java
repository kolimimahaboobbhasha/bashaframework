package TestCases;



import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMpages.Instagramlogin;

public class TC_InstagramLogin extends BaseClass{
	@Test
	public void Launchapp() throws Exception, ParseException
	{
		Instagramlogin inst=new Instagramlogin(driver);
		inst.applaunch();
	}

	
	
	
	
	
	
	
	
	
	
	
}
