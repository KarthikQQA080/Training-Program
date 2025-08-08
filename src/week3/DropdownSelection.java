package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {

	public static void main(String[] args) throws Exception {
		//Automate dropdown selection and table extraction
		
		
		  String chromeWebDriverName = "webdriver.chrome.driver"; String
		  chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
		  System.setProperty(chromeWebDriverName, chromeWebDriverLoc); WebDriver driver
		  = new ChromeDriver();
		  
		  driver.get("https://practice.expandtesting.com/dropdown"); Select dropdown1 =
		  new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
		  dropdown1.selectByIndex(1); // drop down handling
		  
		  Select countryDropdown = new
		  Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		  countryDropdown.selectByVisibleText("India"); // drop down handling
		  
		 // driver.quit(); Thread.sleep(2000);
		 
		
			/*
			 * String chromeWebDriverName = "webdriver.chrome.driver"; String
			 * chromeWebDriverLoc = "C://Drivers/chromedriver.exe";
			 * System.setProperty(chromeWebDriverName, chromeWebDriverLoc); WebDriver
			 * driver1 = new ChromeDriver();
			 */
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
		List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"customers\"]/tbody"));
		
		for(WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
			for(WebElement cell: cells) {
				System.out.println(cell.getText()+" \t");
			}
		}
		
	}

}
