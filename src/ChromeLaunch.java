import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://google.com");

	}

}
