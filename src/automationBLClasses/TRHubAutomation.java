package automationBLClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtilities.CommonServices;

public class TRHubAutomation {
	
	//Instance variables...
	private static WebDriver newBrowser;
	private static String applicationURL;
	
	//Default constructor...
	public TRHubAutomation() {
		applicationURL = "https://thehub.thomsonreuters.com";
	}
	
	//Automation of Create SAFE Account workflow...
	
	
	// Automation of handling the popup windows...
	public static void automationOfManagingWindows() throws IOException {

		try {
			
		
		// System.setProperty("webdriver.chrome.driver",
		// "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		// WebDriver newBrowser = new ChromeDriver();

		// Step 1 : Creating the specific browser instance...
		System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String browserName = br.readLine();

		newBrowser = CommonServices.getBrowserInstance(browserName);
		newBrowser.manage().window().maximize();

		// System.setProperty("webdriver.gecko.driver",
		// "F:\\Saradhi.Seshagiri\\geckodriver.exe");
		// newBrowser = new FirefoxDriver();

		// Step 2 : Loading the AUT...
		// browserDriver.get("http://docs.seleniumhq.org/");
		newBrowser.get("https://www.naukri.com/");

		// Additional step for Unconditional Synchronization/wait...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser window....
		// newBrowser.manage().window().maximize();

		// Step 3 : Automation Business logic for Managing the poped up
		// windows...
		/*
		 * Methods to support retrieving the Unique Alphanumeric ID : 1.
		 * getWindowHandle() 2. getWindowHandles()
		 */
		Set<String> windowsId = newBrowser.getWindowHandles();

		for (String handle : windowsId) {
			newBrowser.switchTo().window(handle);

			System.out.println(newBrowser.getTitle());

			// if(!"Jobs - Recruitment - Job Search - Employment - Job Vacancies
			// - Naukri.com".equalsIgnoreCase(driver.getTitle()))
			if (!"Automation...".equalsIgnoreCase(newBrowser.getTitle())) {
				newBrowser.close();
				System.out.println("Closed !!!");
			}
		} // Scope of handle variable...

	} //try
	catch(Exception e){
	}
	
		finally {
			
			System.out.println("Success...");
		}
		

		// Step 4. Closing the browser instances..
		
	}
	
	public static void alertPopupWorkflowAutomation() throws InterruptedException, IOException {
		try {
		// Step 1 : Creating the specific browser instance...
		System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String browserName = br.readLine();

		newBrowser = CommonServices.getBrowserInstance(browserName);

		// Step 2 : Loading the Web Application onto the Browser instance...
		newBrowser.get("https://uidai.gov.in/");

		// Additional browser settings...Maximizing the browser window..
		newBrowser.manage().window().maximize();

		// Implementing Unconditional Synchronization...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 3 : Business logic for automating Alerts Popups workflow...
		WebElement resourceLinkText = newBrowser
				.findElement(By.cssSelector("a.item-108.deeper.parent.mega-item-a.dropTrigger"));
		resourceLinkText.click();

		WebElement authenticationLinkText = newBrowser.findElement(By.xpath("//*[@id='main245']/a"));
		authenticationLinkText.click();

		WebElement biometricLinkText = newBrowser
				.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/p[3]/span/a"));
		biometricLinkText.click();

		// Conditional wait/synchronization...
		WebDriverWait explicitWait = new WebDriverWait(newBrowser, 100, 15);
		explicitWait.until(ExpectedConditions.alertIsPresent());

		// Business Logic for Handling Alert popup...
		Alert biometericAlert = newBrowser.switchTo().alert(); // Switching the focus to the alert popup...

		biometericAlert.accept();

		// Making the thread idealize for 10 sec...
		Thread.sleep(50000);
		}
		
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}

		
		finally {
			// Step 4 : Close the Browser instance created...
			
			
			//newBrowser.quit();
			

			System.out.println("Success..Handling Popups...");
		}
		

	}
	
	public String automationOfManageSAFEAccountF() {
		
		/*Locater values for different web elements/control...
		 * MANAGE SAFE Account Link Test = xpath : //*[@id='manageAccount']
		 * SAFE USER ID = id : user#username
		 * SAFE password	 = id : next #safeLoginbtnViaCaptcha
		 * */
		
		try {
		//Step 1 : Creating the browser instance of choice...
		//System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");

		newBrowser = new ChromeDriver();
		
		//Additional features...
		newBrowser.manage().window().maximize();
		
		//Step 2 : Launching the browser instance and loading the AUT...
		newBrowser.get(applicationURL);
		//Step 2.1 : Synchronizing the WD with the WB...
		newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Step 3 : Business logic for automation of Create SAFE Account...
		/*WebElement createSafeACLinkText = newBrowser.findElement(By.id("registerNewUserLnk"));
		createSafeACLinkText.click();
		
		WebElement mSafeACLinkText = newBrowser.findElement(By.id("registerNewUserLnk"));
		createSafeACLinkText.click();
		
		WebElement trEmployeeNumberTextBox = newBrowser.findElement(By.id("verify_username"));
		trEmployeeNumberTextBox.sendKeys("295957");
		
		WebElement nextButton = newBrowser.findElement(By.id("next"));
		nextButton.click();*/
		
		WebElement manageSafeACLinkText = newBrowser.findElement(By.xpath("//*[@id='manageAccount']"));
		manageSafeACLinkText.click();
		
		WebElement manageSafeACLinkTex1 = newBrowser.findElement(By.cssSelector("input#username"));
		manageSafeACLinkTex1.sendKeys("1234");
		
		WebElement trEmployeeNumberTextBox2 = newBrowser.findElement(By.cssSelector("input#password"));
		trEmployeeNumberTextBox2.sendKeys("295957");
		
		//WebElement nextButton = newBrowser.findElement(By.cssSelector("dd.submit-button submit-holder safe login"));
		//nextButton.click();
		}//close of try block...
		
		catch(NoSuchElementException nsee) {
			System.out.println("In Exception Block...");
			nsee.printStackTrace();
		}
		finally {
			//Step 4 : Closing the Browser Instance...
			//newBrowser.quit();
		}
			
		System.out.println("Wow..Successfully Automated...");
		return  "Success" ;
	}//End of the Method...
	
	
public static void automationOfManageSAFEAccountAdncaeOptionsF() {
		
		/*Locater values for different web elements/control...
		 * MANAGE SAFE Account Link Test = xpath : //*[@id='manageAccount']
		 * SAFE USER ID = id : user#username
		 * SAFE password	 = id : next #safeLoginbtnViaCaptcha
		 * */
		
		try {
		//Step 1 : Creating the browser instance of choice...
		//System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");

		newBrowser = new ChromeDriver();
		
		//Additional features...
		newBrowser.manage().window().maximize();
		
		//Step 2 : Launching the browser instance and loading the AUT...
		newBrowser.get(applicationURL);
		//Step 2.1 : Synchronizing the WD with the WB...
		newBrowser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Step 3 : Business logic for automation of Create SAFE Account...
		WebElement createSafeACLinkText = newBrowser.findElement(By.id("registerNewUserLnk"));
	
		WebElement mSafeACLinkText = newBrowser.findElement(By.id("verify_username"));
	
		
		WebElement trEmployeeNumberTextBox = newBrowser.findElement(By.id("verify_username"));
	
		
		WebElement nextButton = newBrowser.findElement(By.id("next"));
		
		Actions newactions = new Actions(newBrowser);
		Action action = newactions.moveToElement(createSafeACLinkText).click()
								.moveToElement(trEmployeeNumberTextBox).sendKeys("1234")
								.moveToElement(nextButton).build();
		newactions.perform();
	
		}
		
		
		catch(NoSuchElementException nsee) {
			System.out.println("In Exception Block...");
			nsee.printStackTrace();
		}
		finally {
			//Step 4 : Closing the Browser Instance...
			newBrowser.quit();
		}
			
		System.out.println("Wow..Successfully Automated...");
	}//End of the Method...
	
	// Method to Automate Handling DBoxes Using AWT Robot Class..
		public static void automationOfHandlingDBoxes() throws IOException, AWTException, InterruptedException {

			// Step 1 : Creating the specific browser instance...
			System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String browserName = br.readLine();

			newBrowser = CommonServices.getBrowserInstance(browserName);

			// Step 2 : Loading the Web Application onto the Browser instance...
			newBrowser.get("http://toolsqa.com/automation-practice-form/");

			// Additional browser settings...Maximizing the browser window..
			newBrowser.manage().window().maximize();
			newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit waiting...

			// Step 3 : Business logic for automating for handling dialog boxes...
			WebElement chooseFileButton = newBrowser.findElement(By.id("photo"));
			chooseFileButton.click();

			// Switch the focus to handle the dialog box...
			Robot dialogRobot = new Robot();
			dialogRobot.keyPress(KeyEvent.VK_S);
			dialogRobot.keyRelease(KeyEvent.VK_S);
			dialogRobot.keyPress(KeyEvent.VK_A);
			dialogRobot.keyRelease(KeyEvent.VK_A);

			Thread.sleep(50000);

			// Step 4 : Close the Browser instance created...
			newBrowser.quit();

			System.out.println("Success");

		}
		
		
		// Method to Automate Handling DBoxes Using AWT Robot Class..
			public static void automationOfHandlingDBoxesUsingAdvncaActiok() throws IOException, AWTException, InterruptedException {

				// Step 1 : Creating the specific browser instance...
				System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String browserName = br.readLine();

				newBrowser = CommonServices.getBrowserInstance(browserName);

				// Step 2 : Loading the Web Application onto the Browser instance...
				newBrowser.get("http://toolsqa.com/automation-practice-form/");

				// Additional browser settings...Maximizing the browser window..
				newBrowser.manage().window().maximize();
				newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit waiting...

				// Step 3 : Business logic for automating for handling dialog boxes...
				WebElement chooseFileButton = newBrowser.findElement(By.id("photo"));
				chooseFileButton.click();

				// Switch the focus to handle the dialog box...
				Robot dialogRobot = new Robot();
				dialogRobot.keyPress(KeyEvent.VK_S);
				dialogRobot.keyRelease(KeyEvent.VK_S);
				dialogRobot.keyPress(KeyEvent.VK_A);
				dialogRobot.keyRelease(KeyEvent.VK_A);

				Thread.sleep(50000);

				// Step 4 : Close the Browser instance created...
				newBrowser.quit();

				System.out.println("Success");

			}
}
