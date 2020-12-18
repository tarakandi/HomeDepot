package MyAccount.HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountTypePage 
{
	public WebDriver driver;
	
	public AccountTypePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By accountType = By.xpath("//p[contains(text(), 'Personal Account')]");
	By select = By.xpath("//span[contains(text(), 'Select & Continue')]");
	
	public void clickAccountType()
	{
		driver.findElement(accountType).click();
	}
	
	public void clickSelect()
	{
		driver.findElement(select).click();
	}

}
