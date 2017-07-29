package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoRecording {

	
	public static void main(String[] args) throws ATUTestRecorderException {
		
		ATUTestRecorder rec = new ATUTestRecorder("F:\\video", "Orangehrm",false);
		rec.start();
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://opensource.demo.orangehrmlive.com/");
		f.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		f.findElement(By.id("txtPassword")).sendKeys("admin");
		f.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
		f.findElement(By.linkText("Welcome Admin")).click();
		f.findElement(By.linkText("Logout")).click();
		f.close();
		rec.stop();
		
		 
		
	}

}
