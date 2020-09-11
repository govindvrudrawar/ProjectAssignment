package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='hover-con app-block']/h2[@class='subheadbig light'][contains(text(),'BIKE TRAINERS')]")
	public WebElement bikeTrainers;

	@FindBy(xpath="//div/h2[text()='BIKE COMPUTERS']")
	public WebElement bikeComputers;
	
	@FindBy(xpath="")
	public WebElement mainCart;
}
