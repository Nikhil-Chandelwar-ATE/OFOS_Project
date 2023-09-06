package com.ofos.test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Login_Page;
import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC002_OFOS_Login extends Base_Test{

	@Test
	public void login() throws InterruptedException {
		
		test.log(LogStatus.INFO, "Application launched successfully");
		Welcome_Page wp = new Welcome_Page(driver);
		Assert.assertEquals(wp.getOfosLogo().isDisplayed(), true);
		
		clickAction(wp.getLoginLink());
		Login_Page lp = new Login_Page(driver);
		Assert.assertEquals(wp.getOfosLogo().isDisplayed(), true);
		
		try {
			enter_value(lp.getUsernameTextField(), getValueProperty("email"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			enter_value(lp.getPasswordTextField(), getValueProperty("password"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickAction(lp.getLoginButton());
		Thread.sleep(2000);
		//Home_Page hp = new Home_Page(driver);
		//Assert.assertEquals(hp.getLogoutLink().isDisplayed(), true);
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.PASS, "User is logged in successfully");
		
	}
}
