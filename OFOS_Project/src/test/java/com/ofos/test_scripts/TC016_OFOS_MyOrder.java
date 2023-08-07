package com.ofos.test_scripts;

import org.testng.annotations.Test;

import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC016_OFOS_MyOrder extends Base_Test {
	
	@Test
	public void placeOrderFromSouthIndianRestaurant() throws InterruptedException {
	
		TC002_OFOS_Login login = new TC002_OFOS_Login();
		login.login();
		
		Welcome_Page wp = new Welcome_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", wp.getSouthIndianLink());
		Thread.sleep(2000);
		clickAction(wp.getSouthIndianLink());
		Thread.sleep(2000);
		
		test.log(LogStatus.FAIL, "No restaurant found");
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		driver.quit();
	}
}
