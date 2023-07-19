package zohoPom;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Listener extends Base implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
	
		try {
			Utility.TakingScreenshots(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Tc is fail...", true);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC successfully run...", true);
	}
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TC executions is Start...", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Tc"+result+"is skipped", true);
	}
	

}
