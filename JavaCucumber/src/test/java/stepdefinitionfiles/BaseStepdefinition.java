package stepdefinitionfiles;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import commonUtilities.*;

public class BaseStepdefinition {

	public WebDriver driver;
	private static String projectPath = System.getProperty("user.dir");
	
	public BaseStepdefinition() {
		new LogStatus();
		LogStatus.logState = LogStatus.report.createTest("MyTest");
	}


	/**
	 * Method to open the given browser
	 * @param browserName
	 *        Name of the Browser to invoke
	 * @return
	 *        True or Fail based on the Browser Launch
	 * @throws Exception
	 */
	
	public boolean lanuchBrower(String browserName) throws Exception {

		if(BProceed.getbProceedFlag()) {

			switch(browserName)
			{
			case "IE" : launchIE(); break;
			case "Chrome" : launchChrome(); break;
			default : LogStatus.logState.fail("Invalid Browser Name : " + browserName);
			}

			return true;
		}
		else
		{
			return false;
		}
	}

	private void launchChrome() throws Exception{

		try
		{
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			waitForBrowserLoad();
		}
		catch(Exception e)
		{
			System.out.println("Error Occured while setting up the System Property");
		}
	}

	private void launchIE() throws Exception{

		try 
		{
			System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			waitForBrowserLoad();
		}
		catch(Exception e)
		{
			System.out.println("Error Occured while setting up the System Property");
		}
	}

	private void waitForBrowserLoad() throws Exception{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
	}

}