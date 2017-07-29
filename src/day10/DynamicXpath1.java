package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DynamicXpath1 {



	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://yahoo.com");
		f.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("selenium");
		f.findElement(By.xpath("//*[@id='uh-search-button']")).click();
		//f.findElement(By.xpath("//*[@id='3fd0']/div/div/div[1]/h3/a")).click();
		Sleeper.sleepTightInSeconds(3);
		//f.findElement(By.xpath("//*[contains(@id,'0')]/div/div[1]/h3/a")).click();
		f.findElement(By.xpath("//*[contains(@id,'0')]/div/div/div[1]/h3/a")).click();
		
	}

}
