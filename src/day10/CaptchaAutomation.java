package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CaptchaAutomation {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://harvard.edu/feedback");
		f.findElement(By.name("submitted[name]")).sendKeys("Shaik");
		f.findElement(By.name("submitted[email]")).sendKeys("khajas415@gmail.com");
		f.findElement(By.id("edit-submitted-comment")).sendKeys("change the captcha");
		String  x = f.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		
		String [] a = x.split(" ");
		int i = Integer.parseInt(a[0]);
		int j = Integer.parseInt(a[2]);
		int k = i+j;
		
		String str = Integer.toString(k);
		f.findElement(By.name("captcha_response")).sendKeys(str);
		Sleeper.sleepTightInSeconds(7);
		f.findElement(By.name("op")).click(); //not able to clicking on the submit button
		
		
	}

}
