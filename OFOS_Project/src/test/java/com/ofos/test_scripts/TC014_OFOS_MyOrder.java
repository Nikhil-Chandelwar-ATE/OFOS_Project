package com.ofos.test_scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Checkout_Page;
import com.ofos.pom_classes.My_Orders_Page;
import com.ofos.pom_classes.Restaurant_Page;
import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC014_OFOS_MyOrder extends Base_Test{
	
	@Test
	public void placeOrderFromChineseRestaurant() throws InterruptedException {
	
		TC002_OFOS_Login login = new TC002_OFOS_Login();
		login.login();
		
		Welcome_Page wp = new Welcome_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", wp.getChineseLink());
		Thread.sleep(2000);
		clickAction(wp.getChineseLink());
		Thread.sleep(2000);
		
		for (int i = 0; i < wp.getAllRestaurants().size(); i++) {
			if (wp.getAllRestaurants().get(i).getText().equals("Nan Xiang Xiao Long Bao")) {
				clickAction(wp.getAllRestaurants().get(i));
				break;
			}
		}
		Restaurant_Page rp = new Restaurant_Page(driver);
		js.executeScript("arguments[0].scrollIntoView(true);", rp.getMenu());
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		
		Thread.sleep(2000);
		clickAction(rp.getAddToCartButton());
		
		js.executeScript("arguments[0].scrollIntoView(false);", rp.getCheckoutLink());
		Thread.sleep(2000);
		Assert.assertEquals(rp.getCheckoutLink().isEnabled(), true);
		test.log(LogStatus.PASS, "Dish is added successfully to cart");
		test.log(LogStatus.INFO, rp.getCartDeatils().getText());
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		
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
		Thread.sleep(2000);
		driver.quit();
	}

}
