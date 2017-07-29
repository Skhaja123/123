package day8;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessTesting2 {
	
	public static void main(String[] args) {
		
		System.setProperty("phantomjs.binary.path", "F:\\phantomjs.exe");
		PhantomJSDriver p = new PhantomJSDriver();
		p.get("http://facebook.com");
		System.out.println(p.getTitle());
	}

}
