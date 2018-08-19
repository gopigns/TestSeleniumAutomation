package automationBLClases22;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitTest {
	private static WebDriver newBrowser;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\InventSelenium\\geckodriver.exe");
		// driver=new InternetExplorerDriver();
	 newBrowser = new  ChromeDriver();
	 newBrowser.manage().window().maximize();
	
		newBrowser.get("http://www.engprod-charter.net/"); // identifierId
		 newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Runtime.getRuntime().exec("D:\\Autoitscripts\\authontication.exe");
		 newBrowser.close();
		 
		 
		 
	}

}
