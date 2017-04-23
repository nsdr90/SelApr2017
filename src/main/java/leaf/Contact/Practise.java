package leaf.Contact;

import org.testng.annotations.Test;

public class Practise {

	@Test(dependsOnMethods={"createLead"},alwaysRun=true)/*(priority=5)*/
	public void duplicateLead() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	@Test(invocationCount=5,threadPoolSize=5)/*(priority=1)*/
	@Test
	public void createLead() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		throw new RuntimeException();

	}
	@Test/*(dependsOnMethods="createLead")(priority=3)*/
	public void editLead() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test/*(dependsOnMethods="createLead")(priority=2)*/
	public void deleteLead() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		throw new RuntimeException();
	}
	@Test(enabled=false)/*(dependsOnMethods="createLead")(priority=4)*/
	public void mergeLead() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
