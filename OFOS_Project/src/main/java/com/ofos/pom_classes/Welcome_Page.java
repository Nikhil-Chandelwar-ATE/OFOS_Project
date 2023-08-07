package com.ofos.pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_Page extends Base_Page{

	public Welcome_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement ofosLogo;
	
	public WebElement getOfosLogo() {
		return ofosLogo;
	}

	public void setOfosLogo(WebElement ofosLogo) {
		this.ofosLogo = ofosLogo;
	}

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement homeLink;

	public WebElement getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(WebElement homeLink) {
		this.homeLink = homeLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Restaurants')]")
	private WebElement restaurantsLink;

	public WebElement getRestaurantsLink() {
		return restaurantsLink;
	}

	public void setRestaurantsLink(WebElement restaurantsLink) {
		this.restaurantsLink = restaurantsLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}
	
	@FindBy(xpath = "//a[text()='Yorkshire Lamb Patties']")
	private WebElement dishLink;

	public WebElement getDishLink() {
		return dishLink;
	}

	public void setDishLink(WebElement dishLink) {
		this.dishLink = dishLink;
	}
	
	@FindBy(xpath = "(//a[text()='Yorkshire Lamb Patties'])/../../..//a[text()='Order Now']")
	private WebElement orderNowLink;

	public WebElement getOrderNowLink() {
		return orderNowLink;
	}

	public void setOrderNowLink(WebElement orderNowLink) {
		this.orderNowLink = orderNowLink;
	}
	
	@FindBy(xpath = "//a[text()='North Street Tavern']")
	private WebElement nstRestaurantLink;

	public WebElement getNstRestaurantLink() {
		return nstRestaurantLink;
	}

	public void setNstRestaurantLink(WebElement nstRestaurantLink) {
		this.nstRestaurantLink = nstRestaurantLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Continental')]")
	private WebElement continentalLink;

	public WebElement getContinentalLink() {
		return continentalLink;
	}

	public void setContinentalLink(WebElement continentalLink) {
		this.continentalLink = continentalLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Italian')]")
	private WebElement italianLink;

	public WebElement getItalianLink() {
		return italianLink;
	}

	public void setItalianLink(WebElement italianLink) {
		this.italianLink = italianLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Chinese')]")
	private WebElement chineseLink;

	public WebElement getChineseLink() {
		return chineseLink;
	}

	public void setChineseLink(WebElement chineseLink) {
		this.chineseLink = chineseLink;
	}

	@FindBy(xpath = "//a[contains(text(),'American')]")
	private WebElement americanLink;

	public WebElement getAmericanLink() {
		return americanLink;
	}

	public void setAmericanLink(WebElement americanLink) {
		this.americanLink = americanLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'South Indian')]")
	private WebElement southIndianLink;

	public WebElement getSouthIndianLink() {
		return southIndianLink;
	}

	public void setSouthIndianLink(WebElement southIndianLink) {
		this.southIndianLink = southIndianLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'North Indian')]")
	private WebElement northIndianLink;

	public WebElement getNorthIndianLink() {
		return northIndianLink;
	}

	public void setNorthIndianLink(WebElement northIndianLink) {
		this.northIndianLink = northIndianLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'hell')]")
	private WebElement hellLink;

	public WebElement getHellLink() {
		return hellLink;
	}

	public void setHellLink(WebElement hellLink) {
		this.hellLink = hellLink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Heavenly Food')]")
	private WebElement heavenlyFoodLink;

	public WebElement getHeavenlyFoodLink() {
		return heavenlyFoodLink;
	}

	public void setHeavenlyFoodLink(WebElement heavenlyFoodLink) {
		this.heavenlyFoodLink = heavenlyFoodLink;
	}
	
	@FindBy(xpath = "//div[@class='restaurant-wrap']//h5")
	private List<WebElement> allRestaurants;

	public List<WebElement> getAllRestaurants() {
		return allRestaurants;
	}

	public void setAllRestaurants(List<WebElement> allRestaurants) {
		this.allRestaurants = allRestaurants;
	}
	
}
