package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FillSampleForm {

	public static void main(String[] args) {
		// Fill a sample form using all locators and XPath

		String chromeWebDriverName = "webdriver.chrome.driver";
		String chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		System.setProperty(chromeWebDriverName, chromeWebDriverLoc);
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.saucedemo.com/");
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */

		driver.get("https://ultimateqa.com/automation");
		driver.findElement(By.xpath("//*[@id=\"post-507\"]/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[1]/a"))
				.click();

		Actions action = new Actions(driver); // scrolling
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_0\"]"))).perform();
		driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_0\"]")).sendKeys("Test Karthik");
		// driver.quit();

	}

}
