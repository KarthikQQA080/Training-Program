package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidationsAndSynchronisation {

	public static void main(String[] args) {
		String chromeWebDriverName = "webdriver.chrome.driver";
		String chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		System.setProperty(chromeWebDriverName, chromeWebDriverLoc);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tools.pingdom.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// added implicit wait
		driver.findElement(By.xpath("//*[@id=\"urlInput\"]")).sendKeys("https://qapitol.darwinbox.in/"); // this line will wait for 60 seconds and execute
		driver.quit();

	}

}
