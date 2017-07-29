package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLaunch {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
	}

}
