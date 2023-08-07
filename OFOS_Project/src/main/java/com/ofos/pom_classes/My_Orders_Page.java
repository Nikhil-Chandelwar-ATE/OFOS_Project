package com.ofos.pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;

public class My_Orders_Page extends Base_Page{

	public My_Orders_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//td")
	private List<WebElement> orderDetails;
	
	public List<WebElement> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<WebElement> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@FindBy(xpath = "//td[contains(text(),'Yorkshire Lamb Patties')]/..//button[contains(text(),'Dispatch')]")
	private WebElement dispatchButton;

	public WebElement getDispatchButton() {
		return dispatchButton;
	}

	public void setDispatchButton(WebElement dispatchButton) {
		this.dispatchButton = dispatchButton;
	}
	
	@FindBy(xpath = "//td[contains(text(),'Yorkshire Lamb Patties')]/..//a[contains(@onclick,'return')]")
	private WebElement deleteLink;

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public void setDeleteLink(WebElement deleteLink) {
		this.deleteLink = deleteLink;
	}
	
}
