package day36.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomeMercuryTours {

	@FindBy(name="userName")
	WebElement uname;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(name="login")
	WebElement signin;
	
	public  void findAFlight(String u,String p) {
		System.out.println(u+p);
		uname.sendKeys(u);
		pwd.sendKeys(p);
		signin.click();
		
	}
	@FindBy(linkText="your destination")
	WebElement dest;
	public  void destinations() {
		
		dest.click();
	}
	@FindBy(linkText="featured vacation destinations")
	WebElement vact;
	public void vacations()
	{
		vact.click();
	}
	@FindBy(linkText="Register")
	WebElement reg;
	public void register()
	{
		reg.click();
	}
}
