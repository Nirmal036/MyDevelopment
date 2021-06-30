package stepdefinitionfiles;
import pages.WebsiteNavigation;
import io.cucumber.java.en.*;
import commonUtilities.BProceed;


public class Login extends BaseStepdefinition{

	public Login() {
		new BaseStepdefinition();
	}
	
	@Given("^User launches the (.*) browser$")
	public void lauchbrowser(String browser) throws Exception{

		BProceed.setbProceedFlag(lanuchBrower(browser));
		BProceed.checkStatus(new Exception().getStackTrace()[0].getMethodName());

	}

	@Given("^User enters the google url$")
	public void enterUrl() throws Exception{

		BProceed.setbProceedFlag(new WebsiteNavigation(driver).navigateToUrl("https://www.google.com"));
		BProceed.checkStatus(new Exception().getStackTrace()[0].getMethodName());
		
	}
}
