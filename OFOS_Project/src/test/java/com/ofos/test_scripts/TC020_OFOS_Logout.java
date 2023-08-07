package com.ofos.test_scripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Home_Page;
import com.ofos.test_scripts.TC002_OFOS_Login;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC020_OFOS_Logout extends Base_Test{
	
	@Test
	public void logout() {
		
		TC002_OFOS_Login login = new TC002_OFOS_Login();
		try {
			login.login();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Home_Page hp = new Home_Page(driver);
		
		Assert.assertEquals(hp.getLogoutLink().isEnabled(), true);
		clickAction(hp.getLogoutLink());
		
		Assert.assertEquals(driver.getTitle(), "Login");
		test.log(LogStatus.PASS, "User is logged out successfully.");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
	}
}
