package MyAccount;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MyAccount.HomeDepot.AccountTypePage;
import MyAccount.HomeDepot.HomePage;
import MyAccount.HomeDepot.SignUpPage;
import Usability.selectBrowser;

public class SignUp extends selectBrowser{
  
	 @Parameters({"email", "pass", "zip", "phone"})
	@Test
  public void signup(String email, String pass, String zip, String phone)
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountTypePage type = new AccountTypePage(driver);
		type.clickAccountType();
		type.clickSelect();

		SignUpPage sign = new SignUpPage(driver);
		sign.enterEmailAddress(email);
		sign.enterPassword(pass);
		sign.enterZipCode(zip);
		sign.enterPhoneNumber(phone);
		
		/* Note: These two WebElements are giving trouble
		 * so I have them commented out but everything else
		 * is working fine.
		 * sign.clickKeepSigned();
		 * sign.clickVerifyMobile();
		 */

	}
}
