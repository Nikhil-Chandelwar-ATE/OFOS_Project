package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page{

	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	private WebElement usernameTextField;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}
	
	@FindBy(name = "password")
	private WebElement passwordTextField;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	
	@FindBy(xpath = "//input[@id='buttn']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Create an account')]")
	private WebElement createAnAccountLink;

	public WebElement getCreateAnAccountLink() {
		return createAnAccountLink;
	}

	public void setCreateAnAccountLink(WebElement createAnAccountLink) {
		this.createAnAccountLink = createAnAccountLink;
	}
	
}
