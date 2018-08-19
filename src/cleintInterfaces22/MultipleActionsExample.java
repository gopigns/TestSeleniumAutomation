package cleintInterfaces22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActionsExample {

	public static void main(String[] args) throws Exception {

	      // Initialize WebDriver
		System.setProperty("webdriver.giccko.driver", "C:\\training\\All days - seshagiri meterial\\Selenium_Day 3\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
	      //WebDriver driver = new ChromeDriver();

	      // Wait For Page To Load
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      // Go to URL
	      driver.get("http://www.facebook.com/");

	      // Maximize Window
	      driver.manage().window().maximize();

	      // get the reference for Web Element Email
	      WebElement userName = driver.findElement(By.id("email"));

	      // Handling Multiple Actions
	      Actions act = new Actions(driver);
	      Action seriesOfActions = act.moveToElement(userName).click().keyDown(userName, Keys.SHIFT)
	            .sendKeys(userName, "hello").keyUp(userName, Keys.SHIFT).doubleClick(userName).contextClick().build();
	      seriesOfActions.perform();

	      // Closing current driver window
	      driver.close();
	   }

}
