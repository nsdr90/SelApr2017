package leaf.Lead;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadNormal {

/*	@Test(invocationCount=2,invocationTimeOut=30000timeOut=15000)
*/	
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void createLead() {

		// Launch Broswer
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com");
		// Maximize
		driver.manage().window().maximize();
		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("QEagle");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		driver.findElementByName("submitButton").click();
		driver.close();
	}

}
