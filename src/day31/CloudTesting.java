package day31;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudTesting {
	
@Parameters("browser")
	
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps = null;
		if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "53.0");
		}
		else if(b.equals("opera"))
		{
			caps = DesiredCapabilities.opera();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "12.12");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "5.1");
		}
		else if(b.equals("firefox"))
		{
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "43.0");
		}
		
		String username = "khan_sk11";
		String access_key ="3cd558e6-ce38-4510-90d6-a5d3d2d82f45";
		String URL = "https://"+ username + ":" + access_key + "@ondemand.saucelabs.com:443/wd/hub";
		
		RemoteWebDriver rd = new RemoteWebDriver(new URL(URL),caps);
		rd.get("http://newtours.demoaut.com/");
		rd.findElement(By.linkText("REGISTER")).click();
		WebElement drop = rd.findElement(By.name("country"));
		List<WebElement> dropdown = drop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				System.out.println(dropdown.get(i).getText()+" is active");
			}
			else
				System.out.println(dropdown.get(i).getText()+" is inactive");
		}
		
	}

}
