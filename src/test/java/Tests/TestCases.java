package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.BikeTrainers;
import POM.Checkout;
import POM.Homepage;
import POM.ProductElementBolt;
import POM.ProductKickrCore;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases  {
	WebDriver driver;
	Homepage page;
	BikeTrainers trainerpage;
	ProductKickrCore kickrcorepage;
	ProductElementBolt  bolt;
	Checkout checkout;
	
	@BeforeClass
	public void launchingUrlAndclickProductCategory() {
		page=new Homepage();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wahoofitness.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void clickOnProductCategory() {
		//select a product e.g. Bike Trainers
		page=new Homepage();
		WebElement element=page.bikeTrainers;
		element.click();
	}
	@Test
	public void addtoCart() {
		//choosing a product Kickr core by clicking on buy now
		trainerpage=new BikeTrainers();
		WebElement element=trainerpage.productKickrCoreBuyNow;
		kickrcorepage.addToCartKickrCore.click();
		
		//verify that it is added 
		String s=kickrcorepage.textmsg.getText();
		System.out.println(s);
	}
	@Test
	public void goingBackToHomePage() {
		driver.navigate().back();
		driver.navigate().back();
		String s=driver.getCurrentUrl();
		Assert.assertEquals(s, "https://eu.wahoofitness.com/");
		
	}
	@Test
	public void selectAnotherProductCategory() {
		page = new Homepage();
		WebElement bikeComputers=page.bikeComputers;
		bikeComputers.click();
	}
	@Test
	public void addAdditionalProduct() {
		bolt = new ProductElementBolt();
		//clicking on product Element Bolt to buy 
		bolt.productElementBoltBuy.click();
		
	}
	@Test
	public void addAdditionalProductToCart() {
		bolt = new ProductElementBolt();
		//Selecting the color by passing webelement for that option
		Select select = new Select(bolt.colorDropDown);
		select.selectByVisibleText("Stealth Black");
		//clicking on the product Element Bolt add to Cart
		bolt.addToCartElementBolt.click();
		//closing the side cart
		bolt.ArrowCloseCart.click();
	}
	@Test
	public void removeProduct() {
		bolt = new ProductElementBolt();
		//go to the cart by clicking on the cart
		bolt.mainCart.click();
		//removing the product 
		bolt.removeFirstProduct.click();
		//switch focus to the pop-up
		Alert alert =driver.switchTo().alert();
		alert.accept();
		//get the message that the product is successfully added
		String s=bolt.removeProductmessage.getText();
		System.out.println(s);
				
	}
	@Test
	public void changingProductQuantity() {
		bolt=new ProductElementBolt();
		WebElement quantityDropDown=bolt.dropDownQuantity;
		Select select = new Select(quantityDropDown);
		select.selectByIndex(2);
		
		//proceed to checkout
		bolt.checkOutbutton.click();
	
	}
	@Test
	public void placeOrderWithOutDetails() {
		checkout = new Checkout();
		checkout.placeOrderButton.click();

	}
	@Test
	public void enterDetailsPlaceOrder() {
		checkout=new Checkout();
		checkout.email.sendKeys("someone@whocares.com");
		checkout.firstName.sendKeys("Test");
		checkout.lastName.sendKeys("Tester");
		checkout.StreetAddress.sendKeys("Comandante Izarduy 67, Barcelona  08940");
		checkout.city.sendKeys("Barcelona");
		Select select = new Select(checkout.country);
		//cannot find Spain
		select.selectByVisibleText("United States");
		checkout.cardNumber.sendKeys("4111111111111111");
		
		Actions action = new Actions(driver);
		action.moveToElement(checkout.ExpiryDateCVV).click().build().perform();
		checkout.ExpiryDateCVV.sendKeys("08/24 111");
		
		checkout.placeOrderButton.click();
		
		
	}
	@AfterSuite
	public void TC100() {
		driver.quit();
	}
}
