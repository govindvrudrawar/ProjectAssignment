package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikeTrainers extends Homepage{
	WebDriver driver;
	
	public BikeTrainers() {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='clp-free-tickrx-block top-padding-free-clp-block']//div[@class='pagebuilder-column-group']//div[@class='pagebuilder-column about-content-column']//div//span[contains(text(),'BUY NOW')]")
	public WebElement productKickrBuyNow;
	
	//Locators for KickrCore
	@FindBy(xpath="//div[@class='clp-free-tickrx-block']//div[@class='pagebuilder-column-group']//div[@class='pagebuilder-column about-content-column']//div//span[contains(text(),'BUY NOW')]")
	public WebElement productKickrCoreBuyNow;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	public WebElement addToCartKickrCore;
	
	
	@FindBy(xpath="//div[@class='clp-free-tickrx-block bottom-padding-free-clp-block']//div[@class='pagebuilder-column-group']//div[@class='pagebuilder-column about-content-column']//div//span[contains(text(),'BUY NOW')]")
	public WebElement productKickrSnapBuyNow;
}

