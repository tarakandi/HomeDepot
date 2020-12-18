package MyAccount.HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage 
{
	
	public WebDriver driver;
	
	public SignUpPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By emailAddress = By.id("email");
	By password = By.id("password-input-field");
	By zipCode = By.id("zipCode");
	By phone = By.id("phone");
	By keepSigned = By.id("kmsi-checkbox");
	By verifyMobile = By.id("verify-phone-checkbox");
	
	public void enterEmailAddress(String email)
	{
		driver.findElement(emailAddress).sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterZipCode(String zip)
	{
		driver.findElement(zipCode).sendKeys(zip);
	}
	
	public void enterPhoneNumber(String phoneNumber)
	{
		driver.findElement(phone).sendKeys(phoneNumber);
	}
	
	public void clickKeepSigned()
	{
		driver.findElement(keepSigned).click();
	}
	
	public void clickVerifyMobile()
	{
		driver.findElement(verifyMobile).click();
	}

}
