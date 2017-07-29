package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
	
	FirefoxDriver f;
	@BeforeTest
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://yssofindia.org/");

	}
	@Test
	public void mouseHoverTest()
	{
		Actions act = new Actions(f);
		WebElement abtyss = f.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
		//f.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement contyss = f.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
		act.moveToElement(abtyss).moveToElement(contyss).build().perform();
		f.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a")).click();
		f.quit();     // To close all windows
		 
	}
	
	

}
