package day17;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPopup2 {

	
	ChromeDriver c;
	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("http://bing.com");
	}
	
	@Test
	public void tabandPopupTest()
	{
		c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		c.findElement(By.linkText("Help")).click();
		
		Set<String> windowids = c.getWindowHandles();
		Iterator<String> i = windowids.iterator();
		while(i.hasNext())
		{
			c.switchTo().window(i.next());
			try
			{
				c.findElement(By.xpath("//*[@id='privacyLabel']"));
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}

}
