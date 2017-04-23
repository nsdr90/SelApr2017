package leaf.Lead;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	@Test(/*invocationCount=2,*/dataProvider="fetchData",dataProviderClass=DataProv.class,groups = {"smoke"})
	public void createLead(String CN,String FN,String LN) throws Exception{
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName",FN);
		enterById("createLeadForm_lastName", LN);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
		
	}
	
	/*@DataProvider(name="fetchData")
	public Object[][] data(){
		Object[][] testData = new Object[2][3];
		testData[0][0] = "QEagle";
		testData[0][1] = "Gopinath";
		testData[0][2] = "Jayakumar";
		testData[1][0] = "QEagle";
		testData[1][1] = "Babu";
		testData[1][2] = "Manickam";
		return testData;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









