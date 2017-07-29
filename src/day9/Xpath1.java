package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://gmail.com");
		String a = f.findElement(By.xpath("//p[@class='FgbZLd']")).getText();
		System.out.println(a);
		
	}
}
