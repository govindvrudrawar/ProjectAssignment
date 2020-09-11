package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductKickrCore extends BikeTrainers{
		WebDriver driver;
		public ProductKickrCore () {
			super();
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//button[@id='product-addtocart-button']//span[contains(text(),'Add to Cart')]")
		public WebElement addtoCart;
		
		@FindBy(xpath="//span[@class='minicart-messages']/span")
		public WebElement textmsg;
		
		@FindBy(css=".wf-cart")
		public WebElement mainCart;
		
}
