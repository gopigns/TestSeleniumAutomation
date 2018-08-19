package automationBLClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NedBankAutomation {

	// Instance Variables..
	private WebDriver newBrowser;
	private String applicationURL = "https://www.nedbank.co.za/content/nedbank/desktop/gt/en/personal.html";

	// Automation of Personal Banking workflow...
	public void automationOfPersonalBankingFeature() {

		try {
			// Step 1: Creating the Browser Instance...
			System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
			newBrowser = new ChromeDriver();

			// Launch the browser in max. mode...
			newBrowser.manage().window().maximize();

			// Step 2 : Launching the browser instance and loading the AUT...
			newBrowser.get(applicationURL);

			// Additional Concepts implementation...
			// Synchronize the WD with the WB using unconditional wait/Implicit wait...
			newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// Step 3 : Business logic for automating the Personal Banking feature...
			WebElement bankLinkText = newBrowser.findElement(By.className("nav-menu-item"));
			bankLinkText.click();

			// WebElement accountsLinkText =
			// newBrowser.findElement(By.className("nav-menu3-blurb"));
			// Clicking on the Accounts link text...
			WebElement accountsLinkText = newBrowser.findElement(By.cssSelector("li.nav-menu-item.nav-menu-item-selected::after"));
			accountsLinkText.click();

			WebElement everydayBankingLinkText = newBrowser.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]/span"));
			everydayBankingLinkText.click();
		} // End of try...

		catch (NoSuchElementException nsee) {
			System.out.println("In Exception Block..");
			nsee.printStackTrace();
		}

		finally {
			// Step 4 : Closing the browser instance...
			newBrowser.quit();
		}
		System.out.println("Success...");
	}

	
	// Automation of NedBank Money workflow...
	public void automationOfNedBankMoneyFeature() {

		try {
			// Step 1: Creating the Browser Instance...
			System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
			newBrowser = new ChromeDriver();

			// Launch the browser in max. mode...
			newBrowser.manage().window().maximize();

			// Step 2 : Launching the browser instance and loading the AUT...
			newBrowser.get(applicationURL);

			// Additional Concepts implementation...
			// Synchronize the WD with the WB using unconditional wait/Implicit
			// wait...
			newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// Step 3 : Business logic for automating the NedBank Money feature...
			WebElement bankLinkText = newBrowser.findElement(By.className("nav-menu-item"));
			bankLinkText.click();

			
		} // End of try...

		catch (NoSuchElementException nsee) {
			System.out.println("In Exception Block..");
			nsee.printStackTrace();
		}

		finally {
			// Step 4 : Closing the browser instance...
			newBrowser.quit();
		}
		System.out.println("Success...");
	}

}
