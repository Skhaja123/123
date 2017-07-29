package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	FirefoxDriver f;
	@BeforeTest
	
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://google.com");
		
	}
	@Test
	public void rightclickTest()
	{
		Actions a = new Actions(f);
		WebElement gmail = f.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		a.contextClick(gmail).sendKeys("L").build().perform();
	}

}
