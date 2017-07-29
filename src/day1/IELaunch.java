package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "f:\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get("http://goibibo.com");
	}

}
