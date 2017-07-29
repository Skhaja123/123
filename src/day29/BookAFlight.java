package day29;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookAFlight extends BaseClass{
	
	@Test
	
	public void bookAFlight()
	{
		f.findElement(By.name("passFirst0")).sendKeys("Shaik");
		f.findElement(By.name("passLast0")).sendKeys("khaja");
		f.findElement(By.name("creditCard")).sendKeys("Visa");
		f.findElement(By.name("creditnumber")).sendKeys("111222444");
		f.findElement(By.name("buyFlights")).click();
		
	}

}
