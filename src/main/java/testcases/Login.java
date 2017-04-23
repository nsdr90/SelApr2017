package testcases;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	@Test
	public void login() throws Exception{
		
		/*invokeApp("chrome", "http://leaftaps.com");*/
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByClassName("decorativeSubmit");
	
		
	/*	String txt = "Gopinath";
		char[] ch = txt.toCharArray();
		List<Character> lst = new LinkedList<Character>();
		for (Character char1 : lst) {
			if(char1)
		}*/
		
		
	}
	
}
