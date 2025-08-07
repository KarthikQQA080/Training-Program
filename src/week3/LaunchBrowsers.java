package week3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {

		String chromeWebDriverName = "webdriver.chrome.driver";
		String chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		System.setProperty(chromeWebDriverName, chromeWebDriverLoc);
		WebDriver driver = new ChromeDriver();

		/*
		 * String firefoxWebDriverName = "webdriver.gecko.driver"; String
		 * firefoxWebDriverLoc = "C://Drivers/geckodriver.exe";
		 * System.setProperty(firefoxWebDriverName, firefoxWebDriverLoc); WebDriver
		 * driver = new FirefoxDriver();
		 */

		/*
		 * String edgeWebDriverName = "webdriver.msedge.driver"; String edgeWebDriverLoc
		 * = "C://Drivers/msedgedriver.exe"; System.setProperty(edgeWebDriverName,
		 * edgeWebDriverLoc); WebDriver driver = new EdgeDriver();
		 */

		driver.get("https://in.bookmyshow.com/"); // Entering a URL and opening it
	}

}
