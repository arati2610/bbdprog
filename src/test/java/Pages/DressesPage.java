package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {
	
	WebDriver driver;

	public DressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By brand = By.xpath("(//*[@class='brand-list']//*[@class='common-checkboxIndicator'])[1]");
	By discount = By.xpath("//*[@class='discount-list']//*[@class='common-radioIndicator']");
	By firstDress = By.xpath("(//*[@class='results-base']/li/a)[1]");
	By cart=By.className("desktop-cart");
	
	public WebElement cartOption() {
		return 	driver.findElement(cart);
	
	}
	
	public WebElement firstDressOption() {
		return 	driver.findElement(firstDress);
	
	}
	
	public WebElement brandOption() {
		return 	driver.findElement(brand);
	}

	public WebElement discountOption() {
		return 	driver.findElement(discount);
	}
	
}
