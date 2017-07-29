package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinkTesting4 {
	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://pvrcinemas.com");
		WebElement gen=f.findElement(By.cssSelector(".col-lg-2.col-md-2.col-sm-3.mob-accordion"));
		List<WebElement> links=gen.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
			links.get(i).click();
			System.out.println(f.getCurrentUrl());
			Sleeper.sleepTightInSeconds(3);
			f.navigate().back();
			gen=f.findElement(By.xpath("/html/body/div[11]/div[1]/div[2]"));
			links=gen.findElements(By.tagName("a"));
		}
		
	}

}
