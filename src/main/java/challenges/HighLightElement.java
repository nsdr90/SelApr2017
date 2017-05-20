package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class HighLightElement {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("http://jqueryui.com/");
		
		// Locate the element
		WebElement demo =driver.findElementByLinkText("Demos");
		
		// 
		JavascriptExecutor je = (JavascriptExecutor) driver;		
		
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Red; border: 2px dotted solid green;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Blue; border: 10px dotted solid yellow;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Red; border: 10px dotted solid yellow;");
		Thread.sleep(250);		
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Blue; border: 10px dotted solid yellow;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Red; border: 2px dotted solid green;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Blue; border: 10px dotted solid yellow;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Red; border: 10px dotted solid yellow;");
		Thread.sleep(250);		
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Blue; border: 10px dotted solid yellow;");
		Thread.sleep(250);
		je.executeScript("arguments[0].setAttribute('style', arguments[1]);",demo, "color: Red; border: 2px dotted solid green;");

		
		System.out.println("Completes");
		
		
		
		
		
		
		
	}

}
