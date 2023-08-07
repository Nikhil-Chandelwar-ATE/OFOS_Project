package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_Page extends Base_Page{

	public Welcome_Page(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='loginBtn']")
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
	
	@FindBy(partialLinkText = "MEN")
	private WebElement menLink;

	public WebElement getMenLink() {
		return menLink;
	}

	public void setMenLink(WebElement menLink) {
		this.menLink = menLink;
	}
	
	@FindBy(partialLinkText = "T-SHIRTS")
	private WebElement tShirtsLink;

	public WebElement gettShirtsLink() {
		return tShirtsLink;
	}

	public void settShirtsLink(WebElement tShirtsLink) {
		this.tShirtsLink = tShirtsLink;
	}
	
}
