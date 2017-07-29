package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;



public class HeadlessTesting1 {

	
	public static void main(String[] args) {
		
		HtmlUnitDriver h = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		h.get("http://naukri.com");
		h.findElement(By.linkText("Login")).click();
		System.out.println(h.getTitle());
		System.out.println(h.getCurrentUrl());
		

	}

}
