package day29;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAFlight extends BaseClass{
	
	@Test
	public void selectAFlight()
	{
		f.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		f.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
		f.findElement(By.name("reserveFlights")).click();
	}

}
