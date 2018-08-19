package automationBLClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetAppActiveIQ {
	
	//Instance Variables..
	private WebDriver newBrowserDriver;
	private String applicationURL = "https://mysupport.netapp.com/info/web/AboutAIQ.html";
	
	//Automation Workflows Methods...
	public void automationOfSearchWorkflow() {
		
		//Step 1 : Creating Browser Instance...
		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		newBrowserDriver = new ChromeDriver();
		
		//Step 2: Launching the browser instance and loading the AUT...
		newBrowserDriver.get(applicationURL);
		
		//Synchronizing the Web Driver with Browser...
		//Implicit Synchronization...Unconditional wait...
		newBrowserDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximizing the browser...
		newBrowserDriver.manage().window().maximize();
				
		//Step 3 : Business logic for automation of Search workflow..
		//WebElement searchFrame = newBrowserDriver.findElement(By.xpath("//*[@id='header_suggestion_form']/div[1]"));
		//newBrowserDriver.switchTo().frame(searchFrame);
        
		WebElement searchFrame = newBrowserDriver.findElement(By.cssSelector("div.searchBarWrapper.searchBar"));
		searchFrame.click();
		//div[@class='searchBarWrapper']//*[@class='searchBar']
		
		WebElement searchTextBox = newBrowserDriver.findElement(By.cssSelector("input#headerSearchInput.headerSearchInput"));
		searchTextBox.sendKeys("Tapes");
		
		WebElement searchButton = newBrowserDriver.findElement(By.id("searchButton"));
		searchButton.click();
		
		//Step 4 : Closing the Browser Instance...
		newBrowserDriver.quit();
		
		System.out.println("Success....");

	}
	
		public void automationOfLogin() throws InterruptedException {
		
		//Step 1 : Creating Browser Instance...
		ChromeOptions additionalProperties =  new ChromeOptions();
		additionalProperties.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		newBrowserDriver = new ChromeDriver(additionalProperties);
		
		//Step 2: Launching the browser instance and loading the AUT...
		newBrowserDriver.get(applicationURL);
		
		//Synchronizing the Web Driver with Browser...
		//Implicit Synchronization...Unconditional wait...
		newBrowserDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximizing the browser...
		//newBrowserDriver.manage().window().maximize();
		
		//Step 3 : Business logic for automation of ActiveIQ Login workflow..
		WebElement launchingActiveIQLink = newBrowserDriver.findElement(By.xpath("//*[@id='outerMain']/div[5]/div/div/div[1]/div[1]/p[2]/a"));
		launchingActiveIQLink.click();
		
		Thread.sleep(20000);
		
		//Step 4 : Closing the Browser Instance...
		newBrowserDriver.quit();
		
		System.out.println("Success....");

	}

}

//http://www.abodeqa.com/finding-child-elements-in-webdriver-using-findelements/
