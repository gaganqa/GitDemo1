package customListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test -->"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("<a href=\"C:\\executable\\er.jpg\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\executable\\er.jpg\" target=\"_blank\"><img height=200 width=200 src=\"C:\\executable\\"
				+ "er.jpg\">Screenshot link</a>");
		System.out.println("Capturing screenshot for failed test case-->"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		                                   	}

	
}
