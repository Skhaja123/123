package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot1 {
	
	public static void main(String[] args) throws IOException {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://newtours.demoaut.com");
		TakesScreenshot screen = (TakesScreenshot)f;
		//File srcFile = screen.getScreenshotAs(OutputType.FILE);
		File src = ((TakesScreenshot)f).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, newFile("C:\\Users\\shaik\\Downloads\\scr1.png"));
		//FileUtils.copyFile(srcFile, newFile("F:\\scr1"));
		
	}

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
