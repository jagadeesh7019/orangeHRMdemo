package listeners;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.bassee;
import utilites.reoprts;

public class listeners extends bassee implements ITestListener {
	ExtentReports extentreport = reoprts.Getextendreport();
	ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		extentTest = extentreport.createTest(testname);
	        
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();

		extentTest.log(Status.PASS, testname+"got Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getName();
		extentTest.log(Status.FAIL, methodname+"execution fail");

			WebDriver driver = null;
			
			String testMethodName = result.getName();
			
			
				try {
					driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
			
			try {
				@SuppressWarnings("unused")
				String destinationFilePath=takeScreenshot(testMethodName,driver);
				

			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	
	

	@SuppressWarnings("unused")
	private void addScreenCaptureFromPath(String takingscreenshot, String testMethodName) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extentreport.flush();
		
		
	}
	

}
