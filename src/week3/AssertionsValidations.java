package week3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsValidations {
	static WebDriver driver;

	public static void main(String[] args) {
		String chromeWebDriverName = "webdriver.chrome.driver";
		String chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		System.setProperty(chromeWebDriverName, chromeWebDriverLoc);
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tools.pingdom.com/");
	}

	@Test
	public void firstMethod() {
		String ExpectedValue = "Pingdom Website Speed Test";
		Assert.assertEquals(ExpectedValue,
				driver.findElement(
						By.xpath("/html/body/app-root/main/app-home-hero/header/section/app-test-runner/div/div[1]/h1"))
						.getText());
	}
}
