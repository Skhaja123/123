package day24;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingWindowsProcesses {

	public static void main(String[] args) {
		
		WindowsUtils.killByName("notepad.exe");
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		f.close();
		Sleeper.sleepTightInSeconds(5);
		WindowsUtils.killByName("eclipse.exe");
	}

}
