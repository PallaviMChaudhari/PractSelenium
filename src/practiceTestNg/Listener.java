package practiceTestNg;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends Base implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
	      try {
			Utility.getScreenshot(driver, result.getName());
		} catch (IOException e) {
			
		}
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"TC successfully run",true);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"TC execution start",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"TC Skipped",true);
	}

}
