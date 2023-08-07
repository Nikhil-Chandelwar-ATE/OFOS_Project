package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopper_login_Page extends Base_Page{

	public Shopper_login_Page(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(css = "[id='Email']")
	private WebElement emailTextField;
	
	public void enterEmailTextField(String email) {
		emailTextField.sendKeys(email);
	}
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	@FindBy(css = "[id='Password']")
	private WebElement passwordTextField;
	
	public void enterPasswordTextField(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	@FindBy(xpath = "//button[@id='Login']")
	private WebElement loginButton;
	
	public void clickLoginButton() {
		loginButton.click();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	@FindBy(css = "[id='Create Account']")
	private WebElement createAccountButton;
	
	public void clickCreateAccountButton() {
		createAccountButton.click();
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public void setCreateAccountButton(WebElement createAccountButton) {
		this.createAccountButton = createAccountButton;
	}
	
	@FindBy(css = "[id='Forgot Password?']")
	private WebElement forgotPasswordLink;
	
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}
}
