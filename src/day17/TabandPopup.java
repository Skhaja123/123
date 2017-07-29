package day17;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandPopup {
	
	FirefoxDriver f;
	@BeforeTest
	
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://bing.com");
	}
	
	@Test
	public void tabandPopupTest()
	{
		f.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		f.findElement(By.linkText("Help")).click();
		
		Set<String> windowids = f.getWindowHandles();
		Iterator<String> i = windowids.iterator();
		while(i.hasNext())
		{
			f.switchTo().window(i.next());
			try
			{
				f.findElement(By.xpath("//*[@id='privacyLabel']"));
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}

}
