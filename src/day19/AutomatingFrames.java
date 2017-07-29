package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomatingFrames {
	
	FirefoxDriver f;
	@BeforeTest
	
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://angelfire.com/super/badwebs/");
	}
	
	@Test
	public  void automatingFramesTest()
	{
		List<WebElement> myfrm = f.findElements(By.tagName("Frame"));
		System.out.println(myfrm.size());
		for(int i=0;i<myfrm.size();i++)
		{
			f.switchTo().frame(i);
			try
			{
				f.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
				break;
			}
			catch(Exception e)
			{
				f.switchTo().defaultContent();
			}
		}
	}
	

}
