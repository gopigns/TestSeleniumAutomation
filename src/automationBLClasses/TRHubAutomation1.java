package automationBLClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
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

public class TRHubAutomation1 {
	
	//Instance variables...
	private static WebDriver newBrowser;
	private static String applicationURL;
	
	//Default constructor...
	public TRHubAutomation1() {
		applicationURL = "https://thehub.thomsonreuters.com";
	}
	
	//Automation of Create SAFE Account workflow...
	public void automationOfCreateSAFEAccountFlow() throws IOException {
		
		/*Locater values for different web elements/control...
		 * Create SAFE Account Link Test = id : registerNewUserLnk
		 * TR Employee Number = id : verify_username
		 * Next button = id : next
		 * */
		
		try {
		//Step 1 : Creating the browser instance of choice...
		//System.setProperty("webdriver.chrome.driver", "F:\\Saradhi.Seshagiri\\chromedriver.exe");
			//System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//String browserName = br.readLine();
			//newBrowser = CommonServices.getBrowserInstance(browserName);
			System.setProperty("webdriver.chrome.driver", "D:\\InventSelenium\\NewDriverChrome\\chromedriver.exe");
		newBrowser = new ChromeDriver();
		
		//Additional features...
		newBrowser.manage().window().maximize();
		
		//Step 2 : Launching the browser instance and loading the AUT...
		newBrowser.get(applicationURL);
		//Step 2.1 : Synchronizing the WD with the WB...
		newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 3 : Business logic for automation of Create SAFE Account...
		WebElement createSafeACLinkText = newBrowser.findElement(By.id("registerNewUserLnk")); //registerNewUserLnk
		createSafeACLinkText.click();
		
		WebElement trEmployeeNumberTextBox = newBrowser.findElement(By.id("verify_username"));
		trEmployeeNumberTextBox.sendKeys("295957");
		
		WebElement nextButton = newBrowser.findElement(By.id("next"));
		nextButton.click();
		}//close of try block...
		
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
	
	
	//Automation of Manage SAFE Account workflow...
	public void automationOfManageSAFEAccountFlow() {
			
			/*Locater values for different web elements/control...
			 * Manage SAFE Account Link Test = xpath : //*[@id='manageAccount']
			 * SAFE UserID = css value : input#username
			 * SAFE Password = css value : input#password
			 * Next button = css : dd.submit-button.submit-holder.plus.login
			 * 	
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
			
			//Step 3 : Business logic for automation of Manage SAFE Account...
			WebElement manageSafeACLinkText = newBrowser.findElement(By.xpath("//*[@id='manageAccount']"));
			manageSafeACLinkText.click();
			
			WebElement safeUsernameTextBox = newBrowser.findElement(By.cssSelector("input#username"));
			safeUsernameTextBox.sendKeys("295957");
			
			WebElement safePasswordTextBox = newBrowser.findElement(By.cssSelector("input#password"));
			safePasswordTextBox.sendKeys("dummypwd");
			
			WebElement nextButton = newBrowser.findElement(By.cssSelector("dd.submit-button.submit-holder.plus.login"));
			nextButton.click();
			}//close of try block...
			
			catch(NoSuchElementException nsee) {
				System.out.println("In Exception Block...");
				nsee.printStackTrace();
			}
			catch(ElementNotVisibleException enve) {
				System.out.println("In Exception Block...");
				enve.printStackTrace();
			}
			
			finally {
				//Step 4 : Closing the Browser Instance...
				newBrowser.quit();
			}
				
			System.out.println("Wow..Successfully Automated...");
		}//End of the Method...
	// Automation of handling the popup windows...
		public static void automationOfManagingPopUpWindows() throws IOException {

				try {
				// Step 1 : Creating the specific browser instance...
				System.out.println("Please Enter the Browser Name of Your Choice[chrome, firefox, ie, opera]...");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String browserName = br.readLine();

				newBrowser = CommonServices.getBrowserInstance(browserName);

				//Additional features...
				newBrowser.manage().window().maximize();
				
				// Step 2 : Loading the AUT...
				newBrowser.get("https://www.naukri.com/");

				// Additional step for Unconditional Synchronization/wait...
				newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// Step 3 : Automation Business logic for Managing the popped up windows...
				/*
				 * Methods to support retrieving the Unique Alphanumeric ID : 1.
				 * getWindowHandle() 2. getWindowHandles()
				 */
				Set<String> windowsId = newBrowser.getWindowHandles();

				for (String handle : windowsId) {
					newBrowser.switchTo().window(handle);

					System.out.println("...." + newBrowser.getTitle());

					// if(!"Jobs - Recruitment - Job Search - Employment - Job Vacancies
					// - Naukri.com".equalsIgnoreCase(driver.getTitle()))
					if (!"Automation...".equalsIgnoreCase(newBrowser.getTitle())) {
						newBrowser.close();
						System.out.println("Closed !!!");
					}
				   } // Scope of handle variable...
				}//End of try..
				
				catch(NoSuchElementException nsee) {
					System.out.println("In Exception Block...");
					nsee.printStackTrace();
				}
				catch(ElementNotVisibleException enve) {
					System.out.println("In Exception Block...");
					enve.printStackTrace();
				}
				
				finally {
					//Step 4 : Closing the Browser Instance...As already the main window is closed...
					//newBrowser.quit();
				}
				System.out.println("Wow..Successfully Automated...");

		}//End of Method...
		
		
		// Method to Automate Handling of Alerts Workflow...
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
					WebElement resourceLinkText = newBrowser.findElement(By.cssSelector("a.item-108.deeper.parent.mega-item-a.dropTrigger"));
					resourceLinkText.click();

					WebElement authenticationLinkText = newBrowser.findElement(By.xpath("//*[@id='main245']/a"));
					authenticationLinkText.click();

				//	WebElement biometricLinkText = newBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/div/p[3]/span/a"));
					WebElement biometricLinkText = newBrowser.findElement(By.xpath("//*[@id=\"sub311\"]/a"));
					biometricLinkText.click();

					//Conditional wait/synchronization...
					WebDriverWait explicitWait = new WebDriverWait(newBrowser, 100, 15);
					explicitWait.until(ExpectedConditions.alertIsPresent());
					
					// Business Logic for Handling Alert popup...
					Alert biometericAlert = newBrowser.switchTo().alert(); // Switching the focus to the alert popup... 
																		
					biometericAlert.accept();

					// Making the thread idealize for 10 sec...
					Thread.sleep(50000);
					}//End of try block...
					
					catch(NoSuchElementException nsee) {
						System.out.println("In Exception Block...");
						nsee.printStackTrace();
					}
					
					finally {
						// Step 4 : Close the Browser instance created...
						newBrowser.quit();
					}
					System.out.println("Success..Handling Popups...");
				}
				
				
				//Automation of Create SAFE Account workflow Implemented using AUIAPI[Action and Actions combo]...
				public void automationOfCreateSAFEAccountFlowUsingAUIAPI() {
					
					/*Locater values for different web elements/control...
					 * Create SAFE Account Link Test = id : registerNewUserLnk
					 * TR Employee Number = id : verify_username
					 * Next button = id : next
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
					newBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Step 3 : Business logic for automation of Create SAFE Account...
					WebElement createSafeACLinkText = newBrowser.findElement(By.id("registerNewUserLnk"));
				WebElement trEmployeeNumberTextBox = newBrowser.findElement(By.id("verify_username"));
				trEmployeeNumberTextBox.sendKeys("123345");
					//WebElement trEmployeeNumberTextBox = newBrowser.findElement(By.xpath("//*[@id='verify_username']"));
			WebElement nextButton = newBrowser.findElement(By.id("next"));;
					//nextButton.click();//
					//Implementing KB/Mouse events using Advance User Interactions API..
					//Step 1 : Creating Actions class Object...
					Actions newActions =  new Actions(newBrowser);
					
					//Step 2 : Trapping the various KB/Mouse related events on the web page and build ...
				/*	Action newAction = newActions.moveToElement(createSafeACLinkText).click()
												 .moveToElement(trEmployeeNumberTextBox).sendKeys(trEmployeeNumberTextBox, "454545")
												 .moveToElement(nextButton).click().build();*/
					 //action.sendKeys(driver.findElement(By.id("search_course")), Keys.ENTER).build().perform();
					Action actionInterface = newActions.moveToElement(createSafeACLinkText).click()
															.moveToElement(trEmployeeNumberTextBox)
															.moveToElement(nextButton).click().build();
					
					//Step 3 : Performing the events as a batch....
					//newAction.perform();
					actionInterface.perform();
					
					}//close of try block...
					
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
	
}
