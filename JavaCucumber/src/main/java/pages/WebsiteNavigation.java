package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import commonUtilities.BProceed;

public class WebsiteNavigation {

	private WebDriver driver;
	
	public  WebsiteNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchText = By.cssSelector("input[title$='Search']");
	
	public boolean navigateToUrl(String url) throws Exception{
		
		if(BProceed.getbProceedFlag()) {
			
		try
		{
			driver.get(url);
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Error occured while navigating to this url : " + url);
			return false;
		}
	}
		else
		{
			return false;
		}
}
	
	
}
