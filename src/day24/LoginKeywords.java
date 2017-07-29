package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords {
	
	FirefoxDriver f;
	public void launchBrowser()
	{
		f = new FirefoxDriver();
	}
	public void navigate()
	{
		f.get("http://opensource.demo.orangehrmlive.com/");
	}
	public void enterUsername()
	{
		f.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		f.findElement(By.name("txtPassword")).sendKeys("admin");
	}
	public void loginButton()
	{
		f.findElement(By.name("Submit")).click();
	}

}
