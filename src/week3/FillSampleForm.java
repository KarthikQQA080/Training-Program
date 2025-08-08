package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillSampleForm {

	public static void main(String[] args) throws Exception {
		// Fill a sample form using all locators and XPath

		String chromeWebDriverName = "webdriver.chrome.driver";
		String chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		System.setProperty(chromeWebDriverName, chromeWebDriverLoc);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize(); // Maximizing the browser
		// write scroll down code here

		  try {
			  String form = driver.findElement(By.className("text-center")).getText(); // className locator
			  System.out.println(form);
		  } catch (Exception e) {
			  System.out.println("Practice form not found. Error: " + e);
		  	}
		  driver.findElement(By.id("firstName")).sendKeys("Karthik"); // id locator
		  driver.findElement(By.id("lastName")).sendKeys("Bandi");
		  driver.findElement(By.id("userEmail")).sendKeys("bandikarthik2122@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click(); // xpath locator
		  driver.findElement(By.id("userNumber")).sendKeys("7075788963");

		  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[1]/div")).click();

		  Select year = new Select(driver.findElement( By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
		  year.selectByVisibleText("1996"); // Handling drop down and selecting year

		  Select month = new Select(driver.findElement( By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		  month.selectByVisibleText("October"); // Handling drop down and selecting month

		  driver.findElement(By.xpath(
		  "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[7]")).click(); // selecting date

		  driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]")).sendKeys("english"+ Keys.ENTER);
		  driver.findElement(By.id("hobbies-checkbox-1")).click(); // selecting checkbox
		  driver.findElement(By.id("hobbies-checkbox-2")).click();


		  WebElement chooseFile =
		  driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")); chooseFile.
		  sendKeys("C:\\Users\\Qapitol QA\\Downloads\\WhatsApp Image 2025-05-08 at 10.37.34 AM.jpeg"); // Passing file to chooseFile

		  	driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("1-88/4, Issapally, Armoor, Nizamabad - 503224");

			driver.findElement(By.id("state")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click(); // handling drop down and
																							// selecting state

			driver.findElement(By.id("city")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();

			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

			driver.quit();
	}

}
