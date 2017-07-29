package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinkTesting5 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		List<WebElement> link=f.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++)
		{
			//Skip the hidden links
			if(link.get(i).isDisplayed())
			{
				System.out.println(link.get(i).getText());
				link.get(i).click();
				System.out.println(f.getCurrentUrl());
				f.navigate().back();
				Sleeper.sleepTightInSeconds(2);
				link=f.findElements(By.tagName("a"));
			}
		}
		f.close();
	}

}
