package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Restaurant_Page extends Base_Page{

	public Restaurant_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//div[@class='widget-heading'])[1]")
	private WebElement menu;
	
	public WebElement getMenu() {
		return menu;
	}

	public void setMenu(WebElement menu) {
		this.menu = menu;
	}

	@FindBy(xpath = "//a[text()='North Street Tavern']")
	private WebElement restaurantName;

	public WebElement getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(WebElement restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	@FindBy(xpath = "(//input[@value='Add To Cart'])[1]")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}
	
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']/../../../../../..//input[@name='quantity']")
	private WebElement quantityTextField;

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	public void setQuantityTextField(WebElement quantityTextField) {
		this.quantityTextField = quantityTextField;
	}
	
	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement checkoutLink;

	public WebElement getCheckoutLink() {
		return checkoutLink;
	}

	public void setCheckoutLink(WebElement checkoutLink) {
		this.checkoutLink = checkoutLink;
	}
	
	@FindBy(xpath = "//i[contains(@class,'fa-trash')]")
	private WebElement deleteButton;

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(WebElement deleteButton) {
		this.deleteButton = deleteButton;
	}
	
	@FindBy(xpath = "//div[contains(@class,'order-row')]")
	private WebElement cartDeatils;

	public WebElement getCartDeatils() {
		return cartDeatils;
	}

	public void setCartDeatils(WebElement cartDeatils) {
		this.cartDeatils = cartDeatils;
	}
	
	
}
