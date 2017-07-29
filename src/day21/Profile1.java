package day21;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile1 {
	
	public static void main(String[] args) {
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("Mujju");
		FirefoxDriver f = new FirefoxDriver(fp);
		f.get("http://msn.com");
		
	}

}
