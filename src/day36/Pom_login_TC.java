package day36;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day36.PageClasses.WelcomeMercuryTours;

public class Pom_login_TC {
	
	@Test
	public void loginTest()
	{
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://newtours.demoaut.com/");
		WelcomeMercuryTours wmpage = PageFactory.initElements(f, WelcomeMercuryTours.class);
		wmpage.findAFlight("Admin", "admin");
		f.navigate().back();
		wmpage.destinations();
		wmpage.vacations();
	}

}
