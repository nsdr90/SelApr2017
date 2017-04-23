package week2Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandles {

	@Test
	public void handleWindow(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Set<String> allHanldes = driver.getWindowHandles();
		System.out.println(allHanldes.size());
		for (String eachHandle : allHanldes) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}		
		
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());		
		driver.quit(); 
		
		
	}

}


















