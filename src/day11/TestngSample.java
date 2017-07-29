package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSample {
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("login func...");
	}
	@Test(priority=0)
	public void registration()
	{
		System.out.println("This is for registration");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("logout fuct...");
	}
	@BeforeMethod
	public void functionality()
	{
		System.out.println("ajdbjsjs");
	}

}
