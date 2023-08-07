package com.ofos.test_scripts;

import org.testng.annotations.Test;

import com.ofos.pom_classes.Restaurant_Page;
import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC012_OFOS_MyOrder extends Base_Test{

	@Test
	public void placeOrderFromContinentalRestaurant() throws InterruptedException {
		
		TC002_OFOS_Login login = new TC002_OFOS_Login();
		login.login();
		
		Welcome_Page wp = new Welcome_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", wp.getContinentalLink());
		Thread.sleep(2000);
		clickAction(wp.getContinentalLink());
		System.out.println(wp.getAllRestaurants().size());
		for (int i = 0; i < wp.getAllRestaurants().size(); i++) {
			if (wp.getAllRestaurants().get(i).getText().equals("Heavenly Food")) {
				clickAction(wp.getAllRestaurants().get(i));
				break;
			}
		}
		Restaurant_Page rp = new Restaurant_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", rp.getMenu());
		Thread.sleep(2000);
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.FAIL, "No dishes found");
		driver.quit();
	}
}
