package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BikeComputers extends Homepage {
	WebDriver driver;
	public BikeComputers() {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='roam-sec']//span[contains(text(),'Buy')]")
	public WebElement productElementRoamBuy;
	
	@FindBy(xpath="//div[@id='bolt-sec']//span[contains(text(),'Buy')]")
	public WebElement productElementBoltBuy;

}

