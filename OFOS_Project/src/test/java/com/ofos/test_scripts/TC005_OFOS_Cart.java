package com.ofos.test_scripts;

import org.testng.annotations.Test;

import com.ofos.pom_classes.Restaurant_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC005_OFOS_Cart extends Base_Test{

	@Test
	public void removeFromCart() throws InterruptedException {
		
		TC003_OFOS_Cart cart = new TC003_OFOS_Cart();
		cart.addToCart();
		
		Restaurant_Page rp = new Restaurant_Page(driver);
		Thread.sleep(2000);
		clickAction(rp.getDeleteButton());
		js.executeScript("arguments[0].scrollIntoView(false);", rp.getCheckoutLink());
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		test.log(LogStatus.PASS, "Dish is removed successfully from cart.");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
