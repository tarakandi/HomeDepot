package MyAccount.HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	public WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By myAccount = By.xpath("//div[contains(text(), 'My Account')]");
	By register = By.xpath("//span[contains(text(), 'Register')]");
	
	// Click my Account
	public void clickMyAccount()
	{
		driver.findElement(myAccount).click();
	}
	
	//Click Register
	public void clickRegister()
	{
		driver.findElement(register).click();
	}

}
