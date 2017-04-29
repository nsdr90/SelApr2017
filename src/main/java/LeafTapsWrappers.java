package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class LeafTapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	
	

	@BeforeSuite(groups="smoke")
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest(groups="smoke")
	public void beforeTest(){
	}
	
	@BeforeMethod(groups="smoke")
	public void beforeMethod(){
		test = startTestCase("Create Lead", "Create a new Lead");
		test.assignCategory("smoke");
		test.assignAuthor("Babu");
		invokeApp("chrome","http://leaftaps.com");
	}
		
	@AfterSuite(groups="smoke")
	public void afterSuite(){
		endResult();
	}

	@AfterTest(groups="smoke")
	public void afterTest(){
	}
	
	@AfterMethod(groups="smoke")
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet("TC001");		
	}	
	
	
}






