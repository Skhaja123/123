package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LinkTesting1 {
	
	public static void main(String[] args) {
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("http://google.com");
		String exptitle = "Gmail";
		f.findElement(By.linkText("Gmail")).click();
		String acttiltle = f.getTitle();
		if(exptitle.equals(acttiltle))
			System.out.println("Gmail link is working properly");
		else
			System.out.println("Gmail link is not working properly");
		f.close();
			
	}

}
