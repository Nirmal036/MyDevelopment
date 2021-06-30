package stepdefinitionfiles;
import commonUtilities.*;
import io.cucumber.java.en.*;
import pages.*;

public class Sample extends BaseStepdefinition{

	@When("^User enters the website url$")
	public void navigateToWebsite(String website) throws Throwable {
		
		BProceed.setbProceedFlag(new WebsiteNavigation(driver).navigateToUrl(website));
		BProceed.checkStatus(new Exception().getStackTrace()[0].getMethodName());

	}

	@And("^User should be able to access the webpage$")
	public void userShouldBeAbleToAccessTheWebpage() throws Throwable {
		
		BProceed.setbProceedFlag(new InputForm(driver).accessWebsite());
		BProceed.checkStatus(new Exception().getStackTrace()[0].getMethodName());

	}

	@Then("^User completes the input form$")
	public void userCompletesTheInputForm() throws Throwable {

		BProceed.setbProceedFlag(new InputForm(driver).completeInputForm());
		BProceed.checkStatus(new Exception().getStackTrace()[0].getMethodName());
	}
}
