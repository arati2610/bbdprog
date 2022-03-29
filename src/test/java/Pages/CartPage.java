package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By okGotIt =By.className("itemComponents-base-toolTipCTA");
	By MoveTohishList = By.xpath("//button[text()='MOVE TO WISHLIST']");
	By MoveTohishList2 = By.className("bulkActionStrip-waterMelon");
	
	public WebElement okGotItOption() {
		return driver.findElement(okGotIt);
	}
	
	public WebElement MoveTohishListOption() {
		return driver.findElement(MoveTohishList);
	}
	
	public WebElement MoveTohishListOption2() {
		return driver.findElement(MoveTohishList2);
	}
}