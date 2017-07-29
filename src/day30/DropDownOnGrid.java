package day30;

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

public class DropDownOnGrid {
	
	@Parameters("browser")
	
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		DesiredCapabilities cap = null;
		if(b.equals("chrome"))
		{
			cap = DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver rd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
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
