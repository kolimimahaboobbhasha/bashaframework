package Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BasePackage.BaseClass;
public class ListenersUtility implements ITestListener {
	ExtentReports Reports;
	ExtentTest Test;

	public void onTestStart(ITestResult result) {
	
		String Methodname=result.getMethod().getMethodName();
		Test=Reports.createTest(Methodname);
		
	}

	public void onTestSuccess(ITestResult result) {
		String Methodname=result.getMethod().getMethodName();
		//Test.log(Status.PASS, Methodname+"SUCCESSFULLY PASSED");
		Test.log(Status.INFO, Methodname+"SUCCESSFULLY PASSED");
	}

	public void onTestFailure(ITestResult result) {
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();
		String methodName = result.getMethod().getMethodName();//reflection api
		String screenShotName = methodName+"-"+jLib.getSystemDateInFormat();
		Test.log(Status.INFO, methodName+ "---> Failed");
		Test.log(Status.FAIL, result.getThrowable());
		try {
			String path = wLib.takeScreenShot(BaseClass.sdriver, screenShotName);

		Test.addScreenCaptureFromPath(path); //Navigate to screenshot path and attach it to the report
      }  
		catch (IOException e)
		{
			e.printStackTrace();
			}
	}

	public void onTestSkipped(ITestResult result, String msg) {
		String MethodName = result.getMethod().getMethodName();
		Test.log(Status.SKIP, MethodName +" ---> Skipped");
		Test.log(Status.SKIP, result.getThrowable());
		//Reports.log(MethodName+" => is skipped because => "+msg,true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(".\\ExtentReports\\Report-"+ new JavaUtility().getSystemDateInFormat()+".html");
		htmlReport.config().setDocumentTitle("Basha FrameWork Execution Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("Project Execution Report");
		
		Reports = new ExtentReports();
		Reports.attachReporter(htmlReport);
		Reports.setSystemInfo("Base-Browser", "Chrome");
		Reports.setSystemInfo("Base-platform", "Windows");
		Reports.setSystemInfo("Base-URL", "http://localhost:8888");
		Reports.setSystemInfo("Reporter Name", "Basha");
		
	}

	public void onFinish(ITestContext context) {
		Reports.flush();
		
	}

}
