package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown1 {

	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://amazon.in");
		f.findElement(By.name("url")).sendKeys("Books");
		f.findElement(By.name("field-keywords")).sendKeys("Hadoop Bigdata");
		f.findElement(By.className("nav-input")).click();
		
	}

}
