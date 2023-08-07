package com.ofos.test_scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ofos.pom_classes.Register_Page;
import com.ofos.pom_classes.Welcome_Page;
import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;

public class TC001_OFOS_Register extends Base_Test{

	@DataProvider(name = "Register")
	public Object[][] read() throws IOException{
		return ReadExcel.getMultipleData("Register");
	}
	
	@Test(dataProvider = "Register")
	public void resgister(String usn, String fname, String lname, String email, String phone, String pwd, String cpwd, String address) throws InterruptedException {
		
		test.log(LogStatus.INFO, "Application launched successfully");
		Welcome_Page wp = new Welcome_Page(driver);
		Assert.assertEquals(wp.getOfosLogo().isDisplayed(), true);
		
		clickAction(wp.getRegisterLink());
		Assert.assertEquals(wp.getOfosLogo().isDisplayed(), true);
		
		Register_Page rp = new Register_Page(driver);
		enter_value(rp.getUsernameTextField(), usn);
		//System.out.println(usn);
		enter_value(rp.getFirstnameTextField(), fname);
		//System.out.println(fname);
		enter_value(rp.getLastnameTextField(), lname);
		//System.out.println(lname);
		enter_value(rp.getEmailTextField(), email);
		//System.out.println(email);
		enter_value(rp.getPhoneTextField(), phone);
		//System.out.println(phone);
		enter_value(rp.getPasswordTextField(), pwd);
		//System.out.println(pwd);
		enter_value(rp.getConfirmPasswordTextField(), cpwd);
		//System.out.println(cpwd);
		enter_value(rp.getDeliveryAddressTextField(), address);
		//System.out.println(address);
		clickAction(rp.getSubmitButton());
		
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No alert found");
			test.log(LogStatus.PASS, "User is registered successfully");
			test.log(LogStatus.PASS, test.addScreenCapture(getPhoto(driver)));
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
