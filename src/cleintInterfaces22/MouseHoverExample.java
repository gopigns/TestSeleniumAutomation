package cleintInterfaces22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws Exception {

	      // Initialize WebDriver
		//System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\training\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
	      //WebDriver driver = new ChromeDriver();
	   //   WebDriver driver = new ChromeDriver();

	      // Wait For Page To Load
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      // Go to URL
	      driver.get("http://www.myntra.com/");

	      // Maximize Window
	      driver.manage().window().maximize();

	      // Mouse Over On " Men link "
	      Actions act = new Actions(driver);
	      By testlink = By.linkText("Men");
	      WebElement test = driver.findElement(testlink);
	      act.moveToElement(test).build().perform();

	      // Click on " bags & backpacks " link
	      driver.findElement(By.linkText("Bags & Backpacks")).click();

	      // Click on the categories - Bag-packs
	      driver.findElement(By.xpath("//*[text()='Categories']//following::li[1]/label")).click();

	      // Mouse Hover on the 1st bag
	      Actions sel = new Actions(driver);
	      sel.moveToElement(driver.findElement(By.xpath("//ul[@class='results small']/li[1]"))).build().perform();

	      // Click on the "Add to Bag" icon of the 1st bag
	      driver.findElement(By.xpath("//ul[@class='results small']/li[1]/div[1]//div")).click();

	      // Hover over the shopping bag icon present on the top navigation bar
	      Actions mov = new Actions(driver);
	      mov.moveToElement(driver.findElement(By.xpath("//a[contains(@class, 'cart')]//div"))).click().build().perform();

	      // Click on the remove icon
	      driver.findElement(By.xpath("(//span[@data-hint='REMOVE FROM BAG'])[1]")).click();

	      // Closing current driver window
	      driver.close();
	   }

}
