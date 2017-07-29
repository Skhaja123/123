package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalendarTable {
	
	ChromeDriver c ;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		c = new ChromeDriver();
		c.get("http://cleartrip.com");
	}
	@Test
	public void calanderTest()
	{
		c.findElement(By.name("trip_type")).click();
		c.findElement(By.xpath("//*[@id='FromTag']")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		c.findElement(By.name("destination")).sendKeys("Lahore, PK - Lahore (LHE)");
		
		c.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		String doj = "12-03-2018";
		String[] a = doj.split("-");
		String[] months ={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int x = Integer.parseInt(a[1]);
		String month = months[x-1];
		String day = a[0];
		String year = a[2];
		
		String calyear = c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		while(!calyear.equals(year))
		{
			c.findElement(By.className("nextMonth")).click();
			//c.findElement(By.xpath("")).getText();
			calyear = c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		}
		
		String calmonth = c.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month))
		{
			c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calmonth=c.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement calander = c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
		List<WebElement> rows=calander.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
		c.findElement(By.id("SearchBtn")).click();
		
	}

}
