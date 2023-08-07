package com.ofos.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page extends Base_Page{

	public Register_Page(WebDriver driver) {
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
	
	@FindBy(name = "firstname")
	private WebElement firstnameTextField;

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public void setFirstnameTextField(WebElement firstnameTextField) {
		this.firstnameTextField = firstnameTextField;
	}
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextField;

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public void setLastnameTextField(WebElement lastnameTextField) {
		this.lastnameTextField = lastnameTextField;
	}
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextField;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneTextField;

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public void setPhoneTextField(WebElement phoneTextField) {
		this.phoneTextField = phoneTextField;
	}
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTextField;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	
	@FindBy(name = "cpassword")
	private WebElement confirmPasswordTextField;

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		this.confirmPasswordTextField = confirmPasswordTextField;
	}
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement deliveryAddressTextField;

	public WebElement getDeliveryAddressTextField() {
		return deliveryAddressTextField;
	}

	public void setDeliveryAddressTextField(WebElement deliveryAddressTextField) {
		this.deliveryAddressTextField = deliveryAddressTextField;
	}
	
	@FindBy(name = "submit")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}
}
