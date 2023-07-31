package practiceTestNg;

import org.testng.annotations.DataProvider;

public class ProviderClass {
	@DataProvider(name="FbData")
	
	public String[][] enterData(){
		String a[][]= {{"Pallavi","12345"},{"Priya","86756"},{"Kalyani","36374"}};
		return a;
	}
	

}
