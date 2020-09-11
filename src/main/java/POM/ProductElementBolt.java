package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductElementBolt extends BikeComputers {
	WebDriver driver;
	public ProductElementBolt() {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='super_attribute[92]']")
	public WebElement colorDropDown;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartElementBolt;
	
	@FindBy(xpath="//span[contains(text(),'You added ELEMNT BOLT GPS Bike Computer to your sh')]")
	public WebElement getTextMessageBolt;
	
	@FindBy(xpath="//div[@class='minicart-items-wrapper']//div[4]//div[1]//a[1]//span[1]")
	public WebElement removeFirstProduct;
	
	@FindBy(css="#btn-minicart-close")
	public WebElement ArrowCloseCart;
	
	@FindBy(css="#btn-minicart-close")
	public WebElement mainCart;
	
	@FindBy(xpath="//span[@class='minicart-messages']")
	public WebElement removeProductmessage;
	
	@FindBy(xpath="//div[@class='details-qty qty product-minicart-qty']/select")
	public WebElement dropDownQuantity;
	
	@FindBy(css=".top-cart-btn-checkout")
	public WebElement checkOutbutton;
}



