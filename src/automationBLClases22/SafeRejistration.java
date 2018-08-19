package automationBLClases22;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SafeRejistration {
	
	private WebDriver newBrowser;
	private String applicationURL;	
	public SafeRejistration()
	{
		
		applicationURL = "https://thehub.thomsonreuters.com";
	}
	
	public void automationCreationFloe() {
	
	 try {
		System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\InventSelenium\\geckodriver.exe");
		// driver=new InternetExplorerDriver();
	 newBrowser = new  ChromeDriver();
	 newBrowser.manage().window().maximize();
	
		newBrowser.get(applicationURL); // identifierId
		 newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 // id verify_username; id next
		 
		 WebElement one = newBrowser.findElement(By.id("registerNewUserLnk"));
		 one.click();
		 
		 WebElement text = newBrowser.findElement(By.id("verify_username"));
		 text.sendKeys("666");
		 
		 WebElement nextbutton = newBrowser.findElement(By.id("next"));
		 nextbutton.click();
		 
		 
	 }
	 
	 catch(NoSuchElementException nsee) {
	 
		 nsee.printStackTrace();
		
	 
	 }
	 
	 finally {
		 
	 newBrowser.quit();
	}
}
	
}
