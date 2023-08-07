package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page{

	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@name='category']")
	private WebElement categoryDropdown;

	public WebElement getCategoryDropdown() {
		return categoryDropdown;
	}

	public void setCategoryDropdown(WebElement categoryDropdown) {
		this.categoryDropdown = categoryDropdown;
	}
	
	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchTextField;
	
	public void enterSearchTextField(String search) {
		searchTextField.sendKeys(search);
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	
	@FindBy(id = "searchBtn")
	private WebElement searchButton;
	
	public void clickSearchButton() {
		searchButton.click();
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accounntSettingsButton;
	
	public void clickAccounntSettingsButton() {
		accounntSettingsButton.click();
	}

	public WebElement getAccounntSettingsButton() {
		return accounntSettingsButton;
	}

	public void setAccounntSettingsButton(WebElement accounntSettingsButton) {
		this.accounntSettingsButton = accounntSettingsButton;
	}
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutLink;
	
	public void clickLogoutLink() {
		logoutLink.click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	
}
