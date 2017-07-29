package day22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AlertHandling {
	FirefoxDriver f;
	@BeforeTest
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://google.com");
	}
	
	@Test
	public void alertTest()
	{
		JavascriptExecutor j = (JavascriptExecutor)f;
		j.executeScript("alert('Hello Selenium');");
		Sleeper.sleepTightInSeconds(5);
		alertHandling();
		
	}
	public void alertHandling()
	{
		try
		{
			Alert alt = f.switchTo().alert();
			alt.accept();
		}
		catch(Exception e)
		{
			
		}
	}

}
