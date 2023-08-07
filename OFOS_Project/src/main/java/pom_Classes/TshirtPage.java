package pom_Classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends Base_Page{

	public TshirtPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='featuredProducts_cardFooter__qL8vT']/../..")
	private List<WebElement> products;

	public List<WebElement> getProducts() {
		return products;
	}

	public void setProducts(List<WebElement> products) {
		this.products = products;
	}
	
	@FindBy(xpath = "//span[text()='Puma t shirt']/../..//p[@class='CalculateOffer_wrapper__R8RZf']")
	private WebElement productPrice;

	public WebElement getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(WebElement productPrice) {
		this.productPrice = productPrice;
	}
	
	@FindBy(xpath = "//span[text()='Puma t shirt']/../..//p[@class='CalculateOffer_wrapper__R8RZf']")
	private WebElement productPercentage;

	public WebElement getProductPercentage() {
		return productPercentage;
	}

	public void setProductPercentage(WebElement productPercentage) {
		this.productPercentage = productPercentage;
	}
	
	@FindBy(xpath = "//div[@class='cat_box__FUszw']")
	private WebElement allProducts;

	public WebElement getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(WebElement allProducts) {
		this.allProducts = allProducts;
	}
	
	@FindBy(xpath = "(//button[text()='add to cart'])[2]")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}
	
}
