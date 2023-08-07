package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page{

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='My Orders']")
	private WebElement myOrdersLink;
	
	public WebElement getMyOrdersLink() {
		return myOrdersLink;
	}

	public void setMyOrdersLink(WebElement myOrdersLink) {
		this.myOrdersLink = myOrdersLink;
	}

	@FindBy(partialLinkText = "Logout")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	

}
