package testclasses;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Myaccountregpage;

public class TC_001_AccountRegistrationTest extends Baseclass 
{

	
	
	@Test
	void test_account_registration() 
	{
		Homepage hp= new Homepage(driver);
		hp.clickmyaccount();
		hp.registeraccount();
		
		Myaccountregpage myreg= new Myaccountregpage(driver);
		myreg.emailclk();
		myreg.lastnameclk();
		myreg.firstnameclk();
		myreg.passwordclk();
		myreg.subscribeclk();
		myreg.privacybtnclk();
		myreg.confirmbtnclk();
		
		String confrmmsg=myreg.msgconfirm();
		Assert.assertEquals(confrmmsg, "Your Account Has Been Created!");
		
		
		
}	

}
	

