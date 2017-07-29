package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath2 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://news.google.co.in");
		//List<WebElement> headlines=f.findElements(By.xpath(""));
	}

}
