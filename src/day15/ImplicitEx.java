package day15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitEx {
	
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
		f.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		f.findElement(By.xpath("//*[@id='myCarouselId']/div/article[2]/div[1]/div/div[1]/div")).click();
	}
	@AfterTest
	public void close()
	{
		System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeee");
		f.close();
	}

}
