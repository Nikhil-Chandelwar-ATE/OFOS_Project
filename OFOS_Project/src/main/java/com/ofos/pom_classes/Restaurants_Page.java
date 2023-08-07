package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Restaurants_Page extends Base_Page{

	public Restaurants_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='North Street Tavern']")
	private WebElement restaurantLink;

	public WebElement getRestaurantLink() {
		return restaurantLink;
	}

	public void setRestaurantLink(WebElement restaurantLink) {
		this.restaurantLink = restaurantLink;
	}
	
	@FindBy(xpath = "(//a[text()='View Menu'])[1]")
	private WebElement viewMenuLink;

	public WebElement getViewMenuLink() {
		return viewMenuLink;
	}

	public void setViewMenuLink(WebElement viewMenuLink) {
		this.viewMenuLink = viewMenuLink;
	}
	

}
