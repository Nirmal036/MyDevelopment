package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import commonUtilities.*;

public class InputForm {

	private CommonMethods commonMethodsObject;

	public InputForm(WebDriver driver) {
		commonMethodsObject = new CommonMethods(driver);
	}

	private By imgCrossBrower = By.cssSelector("img[src$='sponsored-by-CBT.png']");
	private By firstName = By.cssSelector("input[name$='first_name']");
	private By lastName = By.cssSelector("input[name$='last_name']");
	private By email = By.cssSelector("input[name$='email']");
	private By phone = By.cssSelector("input[name$='phone']");
	private By address = By.cssSelector("input[name$='address']");
	private By city = By.cssSelector("input[name$='city']");
	private By state = By.cssSelector("select[name$='state']");
	private By zip = By.cssSelector("input[name$='zip']");
	private By website = By.cssSelector("input[name$='website']");
	private By hostingYes = By.cssSelector("input[value$='yes']");
	//private By hostingNo = By.cssSelector("input[value$='no']");
	private By projectDescription = By.cssSelector("textarea[name$='comment']");
	private By sendIcon = By.xpath("//button[text()='Send ']");

	/**
	 * Method to validate the user is able to navigate to website successfully
	 * @return true or false based on the accessibility of the website
	 * @throws Exception
	 */
	public boolean accessWebsite() throws Exception{

		if(BProceed.getbProceedFlag()) {

			if(commonMethodsObject.elementExists(imgCrossBrower, 10))
			{
				System.out.println("User is able to access the website successfully");
				return true;
			}
			else
			{
				System.out.println("User is not able to access the website");
				return false;
			}

		}
		else
		{
			return false;
		}
	}

	/**
	 * Method to complete all the details in the user input form
	 * @return true or false based on the status
	 * @throws Exception
	 */

	public boolean completeInputForm() throws Exception{

		if(BProceed.getbProceedFlag()) {

			commonMethodsObject.enterValueWhenVisible(firstName, "NIRMAL");
			commonMethodsObject.enterValueWhenVisible(lastName, "V");
			commonMethodsObject.enterValueWhenVisible(email, "nirmalvelumani@gmail.com");
			commonMethodsObject.enterValueWhenVisible(phone, "1234567890");
			commonMethodsObject.enterValueWhenVisible(address, "1/214 Uthangarai Thottam, Periyer, Attur");
			commonMethodsObject.enterValueWhenVisible(city, "Salem");
			commonMethodsObject.selectValueWhenVisibile(state, "Indiana");
			commonMethodsObject.enterValueWhenVisible(zip, "56006");
			commonMethodsObject.enterValueWhenVisible(website, "nirmal@tcs.com");
			commonMethodsObject.clickWhenVisible(hostingYes, 5);
			commonMethodsObject.enterValueWhenVisible(projectDescription, "Mortgage Lending Transformation - Functional Tester");
			commonMethodsObject.clickWhenVisible(sendIcon, 5);

			return true;
		}
		else
		{
			return false;
		}
	}
}
