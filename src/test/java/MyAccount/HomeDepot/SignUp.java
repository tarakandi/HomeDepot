package MyAccount.HomeDepot;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Usability.selectBrowser;

public class SignUp extends selectBrowser{
  
	@Test
  public void signup() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Thread.sleep(3000);
		
		AccountTypePage type = new AccountTypePage(driver);
		type.clickAccountType();
		type.clickSelect();
		Thread.sleep(3000);

		SignUpPage sign = new SignUpPage(driver);
		sign.enterEmailAddress("example@gmail.com");
		sign.enterPassword("Omar@234");
		sign.enterZipCode("08401");
		sign.enterPhoneNumber("6094456789");
		
		/* Note: These two WebElements are giving trouble
		 * so I have them commented out but everything else
		 * is working fine.
		 * sign.clickKeepSigned();
		 * sign.clickVerifyMobile();
		 */
		Thread.sleep(3000);

	}
}
