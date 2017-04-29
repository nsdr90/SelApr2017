package utils;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void sampleRe(){
		
		//BeforeSuite
		ExtentReports report = new ExtentReports("./reports/result.html", true);
		report.loadConfig(new File("./src/main/resources/extent-config.xml"));
		
		
		//BeforeMethod
		ExtentTest test1 = report.startTest("EditLead", "Edit a Lead in LeafTaps");
		test1.assignAuthor("Babu");
		test1.assignCategory("sanity");
		
		
		test1.log(LogStatus.WARNING, "Enter UserName", "The data: DemoSalesManager entered successfully in field : username");

		//		System.out.println("The data: DemoSalesManager entered successfully in field : username");
		test1.log(LogStatus.FAIL, "Enter Pasword", "The data: crmsfa could not be entered in field : password");
	
		//AfterMethod
		report.endTest(test1);
		
		//AfterSuite
		report.flush();
		
	
	}

}





















