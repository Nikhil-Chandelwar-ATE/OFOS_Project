package com.ofos.test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Restaurant_Page;
import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC003_OFOS_Cart extends Base_Test{

	@Test
	public void addToCart() throws InterruptedException {
		
		TC002_OFOS_Login login = new TC002_OFOS_Login();
		login.login();
		
		Welcome_Page wp = new Welcome_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(false);", wp.getDishLink());
		Thread.sleep(2000);
		clickAction(wp.getDishLink());
		
		Restaurant_Page rp = new Restaurant_Page(driver);
		Assert.assertEquals(rp.getRestaurantName().isDisplayed(), true);
		js.executeScript("arguments[0].scrollIntoView(false);", rp.getAddToCartButton());
		Thread.sleep(2000);
		clickAction(rp.getAddToCartButton());
		
		js.executeScript("arguments[0].scrollIntoView(false);", rp.getCheckoutLink());
		Thread.sleep(2000);
		Assert.assertEquals(rp.getCheckoutLink().isEnabled(), true);
		test.log(LogStatus.PASS, "Dish is added successfully to cart");
		test.log(LogStatus.INFO, rp.getCartDeatils().getText());
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
	}
	
}
