package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers {

	@Parameters({"URL","username","password"})
	@BeforeMethod(groups = "sanity")
	public void login(String URL,String UN,String PWD) throws Exception {
		invokeApp("chrome", URL);
		enterById("username", UN);
		enterById("password", PWD);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}	
	
	@AfterMethod(/*groups = {"smoke","sanity","regression"}*/)
	public void closeBroser(){
		quitBrowser();
	}
}
