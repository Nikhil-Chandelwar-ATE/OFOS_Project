package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_Page extends Base_Page{

	public Checkout_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "radioStacked1")
	private WebElement codRadioButton;

	public WebElement getCodRadioButton() {
		return codRadioButton;
	}

	public void setCodRadioButton(WebElement codRadioButton) {
		this.codRadioButton = codRadioButton;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Paypal')]")
	private WebElement paypalRadioButton;

	public WebElement getPaypalRadioButton() {
		return paypalRadioButton;
	}

	public void setPaypalRadioButton(WebElement paypalRadioButton) {
		this.paypalRadioButton = paypalRadioButton;
	}

	@FindBy(xpath = "//input[@value='Order Now']")
	private WebElement orderNowButton;

	public WebElement getOrderNowButton() {
		return orderNowButton;
	}

	public void setOrderNowButton(WebElement orderNowButton) {
		this.orderNowButton = orderNowButton;
	}
	
}
