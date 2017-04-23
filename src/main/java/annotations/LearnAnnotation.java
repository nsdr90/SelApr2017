package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {


	@AfterTest
	public void afterTest(){
		System.out.println("AfterTest");
	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
	}


	@Test
	public void editLead(){
		System.out.println("EditLead");
	}
	
	@Test
	public void deleteLead(){
		System.out.println("DeleteLead");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass");
	}
	
		

	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}

}
