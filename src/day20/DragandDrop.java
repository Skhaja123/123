package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {

	FirefoxDriver  f;
	 @BeforeTest
	 public void setup()
		{
			f = new FirefoxDriver();
			f.get("https://jqueryui.com/droppable/");
			
		}
		@Test
		public void draganddropTest()
		{
			Actions a = new Actions(f);
			f.switchTo().frame(0);
			WebElement src = f.findElement(By.xpath("//*[@id='draggable']"));
			WebElement tgt = f.findElement(By.xpath("//*[@id='droppable']"));
			a.dragAndDrop(src, tgt).build().perform();
		
		
		}
}
