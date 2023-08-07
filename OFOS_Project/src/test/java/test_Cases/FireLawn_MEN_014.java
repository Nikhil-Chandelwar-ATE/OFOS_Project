package test_Cases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import pom_Classes.Shopper_login_Page;
import pom_Classes.TshirtPage;
import pom_Classes.Welcome_Page;

public class FireLawn_MEN_014 extends Base_Test{

	@Test
	public void addToCartButtonColourChange() throws Throwable {
		
		Welcome_Page wp = new Welcome_Page(driver);
		Thread.sleep(5000);
		clickAction(wp.getLoginButton());
		
		Shopper_login_Page slp = new Shopper_login_Page(driver);
		enter_value(slp.getEmailTextField(), getValueProperty("email"));
		enter_value(slp.getPasswordTextField(), getValueProperty("password"));
		clickAction(slp.getLoginButton());
		
		Thread.sleep(5000);
		action.moveToElement(wp.getMenLink()).perform();
		action.moveToElement(wp.gettShirtsLink()).click().perform();
		action.moveToElement(driver.findElement(By.partialLinkText("Men Tshirt"))).click().perform();
		
		TshirtPage tp = new TshirtPage(driver);
		if(tp.getAllProducts().isDisplayed()) {
			
			Assert.assertEquals(tp.getAddToCartButton().isDisplayed(), true);
			action.moveToElement(tp.getAddToCartButton()).perform();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, test.addScreenCapture(getWebelementScreenshot(tp.getAddToCartButton())));
		}
		else {
			
			test.log(LogStatus.FAIL, test.addScreenCapture(getPhoto(driver)));
		}
	}
}
