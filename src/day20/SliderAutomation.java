package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderAutomation {
	
	
		
		FirefoxDriver  f;
	 @BeforeTest
	 public void setup()
		{
			f = new FirefoxDriver();
			f.get("https://jqueryui.com/slider/#slider-vertical");
			
		}
		@Test
		public void draganddropTest()
		{
			Actions a = new Actions(f);
			f.switchTo().frame(0);
			WebElement slider = f.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
			int x = slider.getLocation().x;
			int y = slider.getLocation().y;
			System.out.println(x+"------"+y);
			a.dragAndDropBy(slider, 90,y).build().perform();
		}

}
