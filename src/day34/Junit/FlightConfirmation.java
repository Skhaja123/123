package day34.Junit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightConfirmation extends BaseClass{
	
	@Test
	
	public void flightConfirm()
	{
		String exptext = "Your itinerary has been booked!";
		String acttext = f.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		if(exptext.equals(acttext))
			System.out.println("Ticket booked successfully");
		else
			System.out.println("Ticket not booked");
		f.close();
	}

}
