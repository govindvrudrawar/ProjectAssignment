package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends ProductElementBolt {
	WebDriver driver;
	public Checkout() {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='control _with-tooltip']//input[@id='customer-email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='Q2H9NES']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='S4F4WYQ']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='NCEFOHA']")
	public WebElement StreetAddress;
	
	@FindBy(xpath="//input[@id='K31LDOF']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='XIONEYL']")
	public WebElement country;
	
	@FindBy(xpath="//button[@class='action primary checkout amasty']")
	public WebElement placeOrderButton; 
	
	@FindBy(xpath="//input[@id='AN83RWU']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='VAAEEVC']")
	public WebElement postalCode;
	
	@FindBy(xpath="//input[@id='QOTPKI8']")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='QOTPKI8']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//input[@id='QOTPKI8']")
	public WebElement ExpiryDateCVV;
	

}
