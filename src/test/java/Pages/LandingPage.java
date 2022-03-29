package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public By women = By.xpath("//*[@class='desktop-navLink']/a[text()='Women']");
	public By dresses = By.xpath("//div[@data-group='women']//ul[@class='desktop-navBlock']//a[text()='Dresses']");

	public WebElement womenOption() {
		return driver.findElement(women);
	}
	
	public WebElement dressesOption() {
		return driver.findElement(dresses);
	}
}
