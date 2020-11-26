package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{
	public RemoteWebDriver driver;
	//Locators
	@FindBy(how=How.NAME,using="mobileNo")
	public WebElement mbno;
	
}
