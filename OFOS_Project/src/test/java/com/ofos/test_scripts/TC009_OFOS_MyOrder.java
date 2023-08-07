package com.ofos.test_scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Checkout_Page;
import com.ofos.pom_classes.My_Orders_Page;
import com.ofos.pom_classes.Restaurant_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC009_OFOS_MyOrder extends Base_Test{

	@Test
	public void deleteOrder() throws InterruptedException {
		
		TC003_OFOS_Cart cart = new TC003_OFOS_Cart();
		cart.addToCart();
		
		Restaurant_Page rp = new Restaurant_Page(driver);
		clickAction(rp.getCheckoutLink());
		Thread.sleep(2000);
		
		Checkout_Page cp = new Checkout_Page(driver);
		Assert.assertEquals(cp.getCodRadioButton().isSelected(), true);
		Assert.assertEquals(cp.getOrderNowButton().isDisplayed(), true);
		clickAction(cp.getOrderNowButton());
		Thread.sleep(2000);
		
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Not able to place order");
		}
		Thread.sleep(2000);
		
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Not able to place order");
		}
		Thread.sleep(2000);
		
		My_Orders_Page mop = new My_Orders_Page(driver);
		test.log(LogStatus.PASS, "order placed successfully");
		
		for (int i = 0; i < mop.getOrderDetails().size(); i++) {
			test.log(LogStatus.INFO, mop.getOrderDetails().get(i).getText());
		}
		test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		
		Assert.assertEquals(mop.getDeleteLink().isEnabled(), true);
		clickAction(mop.getDeleteLink());
		Thread.sleep(2000);
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			test.log(LogStatus.PASS, "Placed order deleted successfully. ");
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Not able to delete placed order");
		}

		driver.quit();
	}
}
