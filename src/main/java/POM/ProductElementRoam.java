package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductElementRoam {
	WebDriver driver;
	public ProductElementRoam() {
		PageFactory.initElements(driver, this);
	}
	
}
