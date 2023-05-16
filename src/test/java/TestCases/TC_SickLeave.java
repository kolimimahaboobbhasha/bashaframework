package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import POMpages.SickLeavePagePom;

public class TC_SickLeave extends TC_Login {
	@Test
	public void sickLeave() throws IOException
	{
		SickLeavePagePom leave=new SickLeavePagePom(driver);
		leave.LeaveLetter();
	}

}
