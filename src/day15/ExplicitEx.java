package day15;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitEx {
	
	FirefoxDriver f;
	@BeforeTest
	
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://hotstar.com");
		
	}
	@Test
	public void waitTest()
	{
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(f).withTimeout(40, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		//Xpath of 1st movie play button
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[1]/div[1]/div/div[1]/div")));
		
		//Xpath of 2nd movie play button
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div"))).click();
	}
	@AfterTest
	public void close()
	{
		System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeee");
		f.close();
	}


}
