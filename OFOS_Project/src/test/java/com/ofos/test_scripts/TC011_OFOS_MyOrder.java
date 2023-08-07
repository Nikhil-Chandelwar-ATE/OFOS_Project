package com.ofos.test_scripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Checkout_Page;
import com.ofos.pom_classes.My_Orders_Page;
import com.ofos.pom_classes.Restaurant_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;

public class TC011_OFOS_MyOrder extends Base_Test {

	@Test
	public void placeOrderFromRestaurant() throws InterruptedException {
		
		TC004_OFOS_Cart cart = new TC004_OFOS_Cart();
		cart.addToCart();
		
		Restaurant_Page rp = new Restaurant_Page(driver);
		clickAction(rp.getCheckoutLink());
		Thread.sleep(2000);
		
		Checkout_Page cp = new Checkout_Page(driver);
		clickAction(cp.getPaypalRadioButton());
		
		if (cp.getPaypalRadioButton().isSelected()) {
			
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
		} else {
			
			test.log(LogStatus.FAIL, "Paypal radio button is disabled");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
		driver.quit();
	}
}
