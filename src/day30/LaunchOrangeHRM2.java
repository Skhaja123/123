package day30;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchOrangeHRM2 {
	
@Test
	
	public void loginTest() throws MalformedURLException
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		//DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver r = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		r.get("http://opensource.demo.orangehrmlive.com/");
		r.findElement(By.id("txtUsername")).sendKeys("Admin");
		r.findElement(By.id("txtPassword")).sendKeys("admin");
		r.findElement(By.id("btnLogin")).click();
	}


}
